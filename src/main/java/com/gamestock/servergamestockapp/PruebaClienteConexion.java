/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamestock.servergamestockapp;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author pedro
 */
public class PruebaClienteConexion {
    
    //Cliente simulado para pruebas
    
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 8080)) { 
            System.out.println("Cliente conectado al servidor.");

            
        } catch (IOException e) {
            System.err.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }
    
}
