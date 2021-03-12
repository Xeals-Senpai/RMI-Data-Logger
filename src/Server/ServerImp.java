/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Client.ChatView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.rmi.server.*;
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author xeals
 */
public class ServerImp extends UnicastRemoteObject implements ServerInt {
    private static final long serialVersionUID = 1L;
    ChatView view;
    
    protected ServerImp () throws RemoteException {
        super();
    }

    @Override
    public void saveFile(File file, String msg) throws RemoteException {
        if (file == null) {
            throw new IllegalArgumentException("Illegal argument, File cannot be null");
        } if (msg == null) {
            throw new IllegalArgumentException("Illegal argument, Msg cannot be null");
        } try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getPath())))) {
            writer.write(msg);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
