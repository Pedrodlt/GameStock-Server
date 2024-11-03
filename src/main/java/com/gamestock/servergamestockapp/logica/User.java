
package com.gamestock.servergamestockapp.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pedro
 * Clase que representa un usuario en el sistema.
 */
@Entity
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String role;
    private String email;
    private String password;
    
    /**
     * Constructor por defecto.
     */

    public User() {
    }
    
     /**
     * Constructor con parámetros.
     * 
     * @param id Identificador único del usuario.
     * @param username Nombre de usuario.
     * @param role Rol del usuario.
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     */

    public User(Long id, String username, String role, String email, String password) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
