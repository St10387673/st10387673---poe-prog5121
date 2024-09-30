/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class CheckuserTest {
    
    public CheckuserTest() {
    }
    
    

    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        Checkuser instance = new Checkuser();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Checkuser instance = new Checkuser();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        Checkuser instance = new Checkuser();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        Checkuser instance = new Checkuser();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginSuccess = false;
        Checkuser instance = new Checkuser();
        String expResult = "";
        String result = instance.returnLoginStatus(loginSuccess);
        assertEquals(expResult, result);
       
    }
    
}
