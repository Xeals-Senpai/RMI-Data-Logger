/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.File;
import java.rmi.*;

/**
 *
 * @author xeals
 */
public interface ServerInt extends Remote {
    public void saveFile(File file, String msg) throws RemoteException;
}
