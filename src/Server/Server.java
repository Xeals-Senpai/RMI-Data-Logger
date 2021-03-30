/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RMISecurityManager;

/**
 *
 * @author xeals
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "file:./server.policy");

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        
        try {
            String welcome = "Starting the Server...\n...Please wait\n";
            System.out.println(welcome);
            ServerImp server = new ServerImp();
            System.out.println("....Server successfully started...\n");
            Registry registry = LocateRegistry.createRegistry(8000);
            registry.rebind("Server", server);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
