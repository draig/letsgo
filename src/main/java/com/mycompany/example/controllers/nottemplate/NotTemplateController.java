package com.mycompany.example.controllers.nottemplate;

import com.mycompany.example.models.NotAuthorizedUser;
import com.mycompany.example.service.NotAuthorizedUserService;
import com.mycompany.example.service.NotAuthorizedUserValidator;
import com.mycompany.example.service.RegistrationMailSenderService;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class NotTemplateController {
    @Autowired
    private NotAuthorizedUserService notAuthorizedUser;
    @Autowired
    private NotAuthorizedUserValidator signupValidator;
    @Autowired
    private RegistrationMailSenderService regMailSenderService ;
    private Random random = new Random () ;
    
    @RequestMapping("/registration")
    public String NotTemplateRegistration( Model model ) {
        model.addAttribute ("nauser" , new NotAuthorizedUser () ) ;
        return "registration";
    }
    
    @RequestMapping(value = "/registrateuser", method = RequestMethod.POST)
    public String registateUserC(@ModelAttribute("nauser")  NotAuthorizedUser nauser ,
            BindingResult result) {
        signupValidator.validate(nauser, result);
        if ( result.hasErrors() ) {
            return "registration" ;
        }
        String hash = nauser.getUsername() + "_" + random.nextInt( Integer.MAX_VALUE ) ;
        nauser.setHash(hash);
        if ( !regMailSenderService.sendRegistrationMail(nauser) ) {
            return "redirect:/registration_unsuccessful" ;
        }
        notAuthorizedUser.addNotAuthorizedUser(nauser);
        return "redirect:/registration_successful";
    }
}
