
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package rmisimpleapplication;

import java.rmi.UnmarshalException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Client {
    public static void main(String args[]) {
        try {

            // Instantiating the implementation class
            // Getting the registry
            Registry       registry = LocateRegistry.getRegistry("localhost", 3000);
            HelloInterface stub     = (HelloInterface) registry.lookup("Hello");

            stub.sayHello("check");

            Scanner input = new Scanner(System.in);    // Create a Scanner object

            System.out.println("calculator app is connected");

            String   s = "";
            int      a = 0,
                     b = 0;
            String[] arr;
            int      flag = 0;

            while (true) {
                System.out.println("input in format a + b  with space after each expression");

                String in = input.nextLine();

                if (in.equals("close")) {
                    try {
                        stub.close();
                    } catch (UnmarshalException e) {
                        System.err.println("connection closed");
                    }

                    break;
                }

                arr = in.split(" ");

                if (arr.length == 3) {
                    try {
                        a = Integer.parseInt(arr[0]);
                        s = arr[1];
                        b = Integer.parseInt(arr[2]);
                    } catch (NumberFormatException ex) {
                        System.err.println("Ilegal input");

                        continue;
                    }

                    if (s.equals("+")) {
                        System.out.println(stub.add(a, b));
                    }

                    if (s.equals("-")) {
                        System.out.println(stub.subtract(a, b));
                    }

                    if (s.equals("*")) {
                        System.out.println(stub.multiply(a, b));
                    }

                    if (s.equals("/")) {
                        try {
                            System.out.println(stub.div(a, b));
                        } catch (ArithmeticException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                } else {
                    System.out.println("input invalid ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
