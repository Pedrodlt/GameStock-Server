/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamestock.servergamestockapp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author pedro
 */
class MockSocketsServer {
    
    private int port;
    private PrintStream logFile;
    private ServerSocket serverSocket;
    private boolean running; 

    public void initialize(int port, String logFile, boolean logTime) throws IOException {
        this.port = port;
        this.logFile = new PrintStream(logFile);
        
    }

    public void run() {
        try  {
            serverSocket = new ServerSocket(port);
            running = true; // Marca el servidor como en ejecución
            while (running) {
                Socket clientSocket = serverSocket.accept();
                // Lógica para manejar la conexión con el cliente en el futuro
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            //Cierra el serversocket
            if(serverSocket != null && !serverSocket.isClosed()){
                
            }
        }
    }

    public void stop() {
        running = false;
    } 
}
