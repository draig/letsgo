package com.mycompany.example.service;

import com.mycompany.example.dao.ClassifierDAO;
import com.mycompany.example.models.Classifier;
import org.springframework.beans.factory.annotation.Autowired;


public class ClassifierServiceImpl implements ClassifierService {
    
    @Autowired
    private ClassifierDAO classifierDAO;
    
    public void addClassifier ( Classifier classifier){
        classifierDAO.addClassifier(classifier);
    }

    public void removeClassifier (Integer id){
        classifierDAO.removeClassifier(id);
    }
    
    public void updateClassifier ( Classifier classifier ){
        classifierDAO.updateClassifier(classifier);
    }
    
    public Classifier getClassifierById ( Integer id ) {
        return classifierDAO.getClassifierById(id) ;
    }
}
