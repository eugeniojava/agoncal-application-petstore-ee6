package org.agoncal.application.petstore.web;

import lombok.Getter;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Getter
@Named
@RequestScoped
public class Credentials {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String login;
    private String password;
    private String password2;

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
