package com.mycompany.example.service;

import com.mycompany.example.models.Classifier;


public interface ClassifierService {
    
    public void addClassifier ( Classifier classifier);

    public void removeClassifier (Integer id);
    
    public void updateClassifier ( Classifier classifier );
    
    public Classifier getClassifierById ( Integer id ) ;
}
