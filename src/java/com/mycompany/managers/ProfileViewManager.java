/*
 * Created by Ojas Mhetar on 2016.02.27  * 
 * Copyright © 2016 Ojas Mhetar. All rights reserved. * 
 */
package com.mycompany.managers;

import com.mycompany.entitypackage.Progress;
import com.mycompany.entitypackage.User;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "profileViewManager")
@SessionScoped
/**
 *
 * @author Ben
 */
public class ProfileViewManager implements Serializable {

    // Instance Variable (Property)
    private User user;
    
    /**
     * The instance variable 'userFacade' is annotated with the @EJB annotation.
     * This means that the GlassFish application server, at runtime, will inject in
     * this instance variable a reference to the @Stateless session bean UserFacade.
     */  
    @EJB
    private com.mycompany.sessionbeanpackage.UserFacade userFacade;
    
    /**
     * The instance variable 'userFacade' is annotated with the @EJB annotation.
     * This means that the GlassFish application server, at runtime, will inject in
     * this instance variable a reference to the @Stateless session bean UserFacade.
     */  
    @EJB
    private com.mycompany.sessionbeanpackage.ProgressFacade progressFacade;

    public ProfileViewManager() {
        
    }

    public String viewProfile() {
        return "MyAccount";
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    public User getLoggedInUser() {
        return userFacade.find(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user_id"));
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    
    public Progress getLoggedInUsersProgress() {
        // TODO return whole list
        return progressFacade.findAllProgressEntriesByUid(getLoggedInUser().getId()).get(0);
    }

}