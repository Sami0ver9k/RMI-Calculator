
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package rmisimpleapplication;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Windows
 */
public class RMISimpleApplication {
    public static void main(String args[]) {
        try {

            // Instantiating the implementation class
            HelloInterfaceImpl helloImpl = new HelloInterfaceImpl();

            // Binding the remote object (stub) in the registry
            Registry registry = LocateRegistry.createRegistry(3000);

            registry.bind("Hello", helloImpl);
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
