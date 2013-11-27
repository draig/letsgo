package com.mycompany.example.controllers.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelpController {
     @RequestMapping( value = "registration_unsuccessful" )
     public String regUnSuccess ( ) {
         return "registration_unsuccessful" ;
     }
     
     @RequestMapping( value = "registration_successful" )
     public String regSuccess ( ) {
         return "registration_successful" ;
     }
}
