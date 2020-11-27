/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Person;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.PersonFacade;

/**
 *
 * @author afrin
 */
@Named(value = "personController")
@SessionScoped
public class PersonController implements Serializable {

    @EJB
    private PersonFacade personFacade;
    private Person person = new Person();
    /**
     * Creates a new instance of PersonController
     */
    public PersonController() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    //R-read
    public List<Person> findAll(){
        return this.personFacade.findAll();
    }
    //C-create
    public String insert(){
        this.personFacade.create(person);
        this.person=new Person();
        return "index";
    }
    //U-update
    public String update(Person person){
        this.person=person;
        return "update";
    }
    public String update(){
        this.personFacade.edit(person);
        return "admin_page";
    }
    //D-delete
    public String delete(Person person){
        this.personFacade.remove(person);
        return "admin_page";
    }
}
