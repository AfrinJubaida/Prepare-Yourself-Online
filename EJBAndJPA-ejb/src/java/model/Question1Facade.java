/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Question1;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author afrin
 */
@Stateless
public class Question1Facade extends AbstractFacade<Question1> {

    @PersistenceContext(unitName = "EJBAndJPA-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Question1Facade() {
        super(Question1.class);
    }
    
}
