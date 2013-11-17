package com.mycompany.example.dao;

import com.mycompany.example.models.Classifier;
import java.util.List;


public interface ClassifierDAO {

    public void addClassifier ( Classifier classifier);

    public void removeClassifier (Integer id);
    
    public void updateClassifier ( Classifier classifier );
    
    public Classifier getClassifierById ( Integer id ) ;
    
}