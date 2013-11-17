package com.mycompany.example.service;

import com.mycompany.example.models.NotAuthorizedUser;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class RegistrationMailSenderService {
    @Autowired
    private JavaMailSender sender;
    
    public boolean sendRegistrationMail ( NotAuthorizedUser nauser ){
        try {
            MimeMessage mimeMessage = sender.createMimeMessage();
            RegistrationMailPreparator rmp = new RegistrationMailPreparator( nauser );
            rmp.prepare(mimeMessage);
            sender.send(rmp);
        }
        catch (Exception e ) { 
            return false ; 
        }
        return true ;
    }
}
