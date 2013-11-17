package com.mycompany.example.controllers;

import com.mycompany.example.models.AUser;
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
public class SettingsController {

    @Autowired
    private AUserService auserService;
    
    @RequestMapping("/settings/{userId}")
    @PreAuthorize("#username == principal.username and hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String settingsC(@PathVariable("userId") Integer contactId , Map <String , Object> map) {
        map.put( "auser" , auserService.getUserById(contactId)) ;
        return "redirect:/usermanagerC";
    }
    
}