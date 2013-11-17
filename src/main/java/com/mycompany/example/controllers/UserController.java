package com.mycompany.example.controllers;

import com.mycompany.example.models.AUser;
import com.mycompany.example.models.Classifier;
import com.mycompany.example.models.NotAuthorizedUser;
import com.mycompany.example.models.Role;
import com.mycompany.example.service.AUserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    
    @Autowired
    private AUserService auserService;
    
    @RequestMapping("/index")
    public String listUserC( ) {
        return "redirect:/popularC" ;
    }
    
    @RequestMapping("/")
    public String homeC() {
        return "redirect:/index";
    }
    
    @RequestMapping("/registration_aprove")
    public String aproveReg( @ModelAttribute("nauser") NotAuthorizedUser nauser ) {
        AUser auser = new AUser () ;
        auser.setClassifier( new Classifier () );
        auser.setUsername(nauser.getUsername());
        auser.setEmail(nauser.getEmail());
        auser.setPassword(nauser.getPassword());
        Role role = new Role () ;
        role.setAuthority( "ROLE_USER" ) ;
        auser.setGrantedAuthority( role );
        auserService.addUser(auser);
        return "registration_aprove" ;
    }
    
    /*@RequestMapping("/registrationC")
    public String registrationC( Model model ) {
        //model.addAttribute("auser", new AUser());
        model.addAttribute ("nauser" , new NotAuthorizedUser () ) ;
        return "registration";
    }*/

    /*@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContactC(@ModelAttribute("user") User user ,
            BindingResult result) {

        userService.addUser (user);

        return "redirect:/index";
    }*/

    /*@RequestMapping(value = "/registrateuser", method = RequestMethod.POST)
    public String registateUserC(@ModelAttribute("nauser") AUser NotAuthorizedUser ,
            BindingResult result) {
        //new not authorizate user
        //Role defaultRole = new Role () ;
        //defaultRole.setAuthority( "ROLE_USER" );
        //auser.setGrantedAuthority( defaultRole ) ;
        //auserService.addUser (auser);
        return "redirect:/popularC";
    }*/
    
    @RequestMapping("/delete/{userId}")
    public String deleteUserC(@PathVariable("userId") Integer contactId) {
        auserService.removeUser(contactId);
        return "redirect:/usermanagerC";
    }
    
    @RequestMapping(value = "/change/{userId}")
    public String changeUserC(@PathVariable("userId") Integer id , Map<String, Object> map ) {    
        map.put( "auser" , auserService.getUserById( id ) ) ; 
        return "changeUser";   
    }
    
    @RequestMapping("/profile/{userId}")
    public String profileC(@PathVariable("userId") Integer id , Map<String, Object> map ) {
        // create default Category
        /*Classifier = auserService.getUserById( id ).getClassifier() ;
        if ( )
        auserService.getUserById( id ).getClassifier().getCategory();
        map.put ( "category" , new Category () ) 
        auserService.removeUser(contactId);*/
        return "redirect:/usermanagerC";
    }
    
    /*@RequestMapping(value = "/test"  )
    public String test(@RequestParam("name") String param,Model model){
        model.addAttribute("name",param);
        return "hello";
    }*/
    
    @RequestMapping(value = "/popularC"  )
    public String popularC( Model model){
        return "popular";
    }
    
    @RequestMapping(value = "/myeventC"  )
    public String myEventC( Model model){
        return "popular";
    }
    
    /*@RequestMapping(value="/info")
     public ModelAndView info(Model model) {

            //model.addAttribute("message", "Info Page !!!");

        return new ModelAndView("info");
    }*/
    
    @RequestMapping(value="/searchC")
     public ModelAndView searchC(Model model) {
            //model.addAttribute("message", "Info Page !!!");

        return new ModelAndView ("search") ;
    }
    
    @RequestMapping(value="/change/changeuserC" , method = RequestMethod.POST)
     public String changeUserC( @ModelAttribute AUser auser ) {
        auserService.updateUser(auser);
        return ("redirect:/usermanagerC") ;
    }
  
    @RequestMapping(value="/usermanagerC")
     public String userManagerC(Map<String, Object> map) {
        map.put("auserList", auserService.listUser());
        return  "userTab" ;
    }
}