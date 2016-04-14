/*
 * Created by Jared Schwalbe on 2016.04.08  * 
 * Copyright © 2016 Osman Balci. All rights reserved. * 
 */
package com.mycompany.sessionbeanpackage;

import com.mycompany.entitypackage.Progress;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jared
 */
@Stateless
public class ProgressFacade extends AbstractFacade<Progress> {

    @PersistenceContext(unitName = "BetterU-WebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgressFacade() {
        super(Progress.class);
    }
    
    public Progress findProgressByPid(int id) {
        String query = "SELECT p FROM Progress p WHERE p.id = :pid";
        
        if (em.createQuery(query)
                .setParameter("pid", id)
                .getResultList().isEmpty()) {
            return null;
        }
        else {
            return (Progress) (em.createQuery(query)
                .setParameter("pid", id)
                .getSingleResult());        
        }
    }
    
}
