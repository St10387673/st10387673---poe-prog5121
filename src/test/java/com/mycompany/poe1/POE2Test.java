/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class POE2Test {
    

    
    public POE2Test() {
    }
    
    

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        POE2.main(args);
       // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testPOE2Test() {
        System.out.println("loginUser");
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Register.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        String expResult = "Welcome " + username + ", it is great to see you again.";
        Register Obj = new Register (username , password ,"null","polo" );
        
        assertEquals(expResult, Obj.returnLoginStatus(username, password));
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}