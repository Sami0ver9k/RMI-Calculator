
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package rmisimpleapplication;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Windows
 */
public interface HelloInterface extends Remote {
    public int add(int a, int b) throws RemoteException;

    public void close() throws RemoteException;

    public float div(float a, float b) throws RemoteException;

    public int multiply(int a, int b) throws RemoteException;

    public String sayHello(String name) throws RemoteException;

    public int subtract(int a, int b) throws RemoteException;
}


//~ Formatted by Jindent --- http://www.jindent.com
