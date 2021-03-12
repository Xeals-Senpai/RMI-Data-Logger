/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RMISecurityManager;

import Server.ServerInt;

/**
 *
 * @author xeals
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "file:./client.policy");
        
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        } 
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 8000);
            ServerInt si = (ServerInt)registry.lookup("Server");
            new ChatView(si);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
