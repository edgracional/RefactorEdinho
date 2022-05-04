package org.agoncal.application.petstore.web;


import lombok.Getter;
import lombok.Setter;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;




@Getter
@Setter

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Named
@RequestScoped


public class Credentials {

    // ======================================
    // =         @Getter @Setter para substituir funções          =
    // ======================================

	 private String login;
	 private String password;
	 private String password2;

    // ======================================
    // =         Getters & setters          =
    // ======================================

   
}
