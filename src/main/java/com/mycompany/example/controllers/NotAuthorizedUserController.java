package com.mycompany.example.controllers;

import com.mycompany.example.models.AUser;
import com.mycompany.example.models.Category;
import com.mycompany.example.models.Classifier;
import com.mycompany.example.models.NotAuthorizedUser;
import com.mycompany.example.models.Role;
import com.mycompany.example.service.AUserService;
import com.mycompany.example.service.NotAuthorizedUserService;
import com.mycompany.example.service.NotAuthorizedUserValidator;
import com.mycompany.example.service.RegistrationMailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Random ;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NotAuthorizedUserController {
    
    @Autowired
    private NotAuthorizedUserService notAuthorizedUser;
    @Autowired
    private RegistrationMailSenderService regMailSenderService ;
    @Autowired
    private NotAuthorizedUserValidator signupValidator;
    @Autowired
    private AUserService auserService;
    
    private Random random = new Random () ;
    
    @RequestMapping( value = "/aprovereg/{userHash}" )
    public String aproveRegistrationC( @PathVariable("userHash") String hash , Model model ) {
        NotAuthorizedUser nauser = notAuthorizedUser.getNotAuthorizedUserByHash(hash) ;
        if ( nauser == null ) {
            return "registration_unsuccessful" ;
        }
        AUser auser = AUser.defaultAUser() ;
        auser.setUsername(nauser.getUsername());
        auser.setEmail(nauser.getEmail());
        auser.setPassword(nauser.getPassword());
        auserService.addUser(auser);
        return "registration_aprove" ;
    }
    
    @RequestMapping("/registrationC")
    public String registrationC( Model model ) {
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
            return "registration_unsuccessful" ;
        }
        notAuthorizedUser.addNotAuthorizedUser(nauser);
        return "registration_success";
    }
}