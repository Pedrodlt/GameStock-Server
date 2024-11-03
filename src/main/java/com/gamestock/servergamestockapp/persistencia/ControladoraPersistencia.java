/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamestock.servergamestockapp.persistencia;

import com.gamestock.servergamestockapp.logica.User;
import com.gamestock.servergamestockapp.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 * Clase que gestiona la persistencia de los usuarios en la base de datos.
 */
public class ControladoraPersistencia {
    
    UserJpaController userJPA = new UserJpaController();
    
    
    //MÉTODOS PARA USERS
    /**
     * Crea un nuevo usuario en la base de datos.
     * 
     * @param user Objeto User que contiene la información del usuario a crear.
     */
    public void crearUser (User user) {
        userJPA.create(user);
    }
    
    /**
     * Elimina un usuario de la base de datos.
     * 
     * @param id Identificador único del usuario a eliminar.
     */
    
    public void eliminarUser (Long id) {
        try {
            userJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Trae una lista de todos los usuarios en la base de datos.
     * 
     * @return Lista de objetos User.
     */
    
    public List<User> traerUsers () {
    return userJPA.findUserEntities();
    }
    
    /**
     * Edita la información de un usuario en la base de datos.
     * 
     * @param user Objeto User con la información actualizada del usuario.
     */
    
    public void editarUser (User user) {
        try {
            userJPA.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Obtiene un usuario por su ID.
     * 
     * @param id Identificador único del usuario.
     * @return Objeto User correspondiente al ID dado.
     */
    
     public User obtenerUser(Long id) {
        return userJPA.findUser(id);
    }
     
      /**
     * Comprueba si un nombre de usuario existe en la base de datos.
     * 
     * @param username Nombre de usuario a comprobar.
     * @return {@code true} si el nombre de usuario existe, {@code false} en caso contrario.
     */
     
    public boolean traerUsername (String username){
        return userJPA.existeUsername(username);
    }
    
     /**
     * Obtiene un usuario por su nombre de usuario.
     * 
     * @param username Nombre de usuario.
     * @return Objeto User correspondiente al nombre de usuario dado.
     */
      
    public User obtenerUserName (String username){
        return userJPA.findUserByUsername(username);
    }
    
}
