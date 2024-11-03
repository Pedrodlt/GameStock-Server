/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamestock.servergamestockapp.logica;

import com.gamestock.servergamestockapp.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author pedro
 * Clase que controla la lógica de gestión de usuarios en el sistema.
 */

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /**
     * Crea un nuevo usuario en el sistema.
     * 
     * @param user Objeto User que contiene la información del usuario a crear.
     */
    
     public void crearUser (User user) {
        controlPersis.crearUser(user);
    }
    
      /**
     * Elimina un usuario del sistema.
     * 
     * @param id Identificador único del usuario a eliminar.
     */
     
    public void eliminarUser (Long id) {
        controlPersis.eliminarUser(id);
    }
    
    /**
     * Trae una lista de todos los usuarios en el sistema.
     * 
     * @return Lista de objetos User.
     */
    
    public List<User> traerUser() {
        return controlPersis.traerUsers();
    }
    
    /**
     * Edita la información de un usuario existente.
     * 
     * @param user Objeto User con la información actualizada del usuario.
     */
    
    public void editarUser (User user) {
        controlPersis.editarUser(user);
    }
    
     /**
     * Muestra una lista de todos los usuarios en el sistema.
     * 
     * @return Lista de objetos User.
     */
    
    public List<User> mostrarUsers(){
        List <User> ciudadanosCoincidentes =controlPersis.traerUsers().stream()
                 .toList(); 
        return ciudadanosCoincidentes;
    
    }
    
    /**
     * Obtiene un usuario por su ID.
     * 
     * @param id Identificador único del usuario.
     * @return Objeto User correspondiente al ID dado.
     */
    
    public User obtenerUser (Long id){
        return controlPersis.obtenerUser(id);
    }
    
    /**
     * Comprueba si existe un nombre de usuario en el sistema.
     * 
     * @param username Nombre de usuario a comprobar.
     * @return {@code true} si el nombre de usuario existe, {@code false} en caso contrario.
     */
    
    public boolean traerUsername (String username){
        return controlPersis.traerUsername(username);
    }
    
    /**
     * Obtiene un usuario por su nombre de usuario.
     * 
     * @param username Nombre de usuario.
     * @return Objeto User correspondiente al nombre de usuario dado.
     */
    
    public User obtenerUserName (String username){
        return controlPersis.obtenerUserName(username);
    }
}
