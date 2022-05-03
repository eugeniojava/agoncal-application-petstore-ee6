package org.agoncal.application.petstore.web;

import lombok.Getter;
import lombok.Setter;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Getter
@Setter
@Named
@RequestScoped
public class Credentials {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String login;
    private String password;
    private String password2;
}
