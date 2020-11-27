/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Person;
import entities.Question1;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.PersonFacade;
import model.Question1Facade;

/**
 *
 * @author afrin
 */
@Named(value = "question1Controller")
@SessionScoped
public class Question1Controller implements Serializable {

    @EJB
    private Question1Facade question1Facade1;
        
    private Question1 Question1 = new Question1();
    public Question1Controller() {
    }


    public Question1 getQuestion1() {
        return Question1;
    }

    public void setQuestion1(Question1 Question1) {
        this.Question1 = Question1;
    }
    public List<Question1> findAll(){
        return this.question1Facade1.findAll();
    }
    
}
