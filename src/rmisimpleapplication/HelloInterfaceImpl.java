
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package rmisimpleapplication;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Windows
 */
public class HelloInterfaceImpl extends UnicastRemoteObject implements HelloInterface {
    HelloInterfaceImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return (a + b);
    }

    @Override
    public void close() throws RemoteException {
        System.exit(0);
    }

    @Override
    public float div(float a, float b) throws RemoteException {
        int ans;

        if (b == 0) {
            throw new ArithmeticException("divide by zero error pls try again");
        }

        return a / b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        return (a * b);    // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Server says hello to " + name;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return (a - b);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
