package com.mycompany.example.service;

import com.mycompany.example.models.NotAuthorizedUser;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;


public class RegistrationMailPreparator implements MimeMessagePreparator{
    
    private NotAuthorizedUser nauser ;
    private static final  String APPROVE_REG = "http://localhost:8080/Letsgo/aprovereg/" ;
    public RegistrationMailPreparator ( NotAuthorizedUser nauser ) {
        this.nauser = nauser ;
    }
    
    @Override
    public void prepare(MimeMessage mimeMessage) throws Exception { 
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setTo(nauser.getEmail());
        mimeMessageHelper.setFrom("andrew.daskhevich@yandex.ru") ;
        mimeMessageHelper.setSubject("Registretion on LetsGo");
        StringBuilder text = new StringBuilder();
        text.append("<html>");
        text.append("<body>");
        text.append("<p> You registrate on LetsGo.com </p>" ) ;
        text.append("your login : " + nauser.getUsername() + "<br>" ) ;
        text.append("your password : " + nauser.getPassword() + "<br>" ) ;
        text.append("clic hera to aprove yor registration <a href="
                + APPROVE_REG + nauser.getHash() + ">" + APPROVE_REG + nauser.getHash() + "</a>" ) ;
        text.append("</body>");
        text.append("</html>");
        mimeMessageHelper.setText(text.toString(), true); 
    }
}
