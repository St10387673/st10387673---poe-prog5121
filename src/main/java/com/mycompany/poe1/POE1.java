/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checkuser checkuser = new Checkuser(); // Create an instance of Checkuser

        // Step 1: Register
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Create your username: ");
        String username = scanner.nextLine();

        System.out.print("Create your password: ");
        String password = scanner.nextLine();

        // Register the user using the Checkuser class
        String registrationMessage = checkuser.registerUser(username, password);
        System.out.println(registrationMessage);

        // If registration fails, exit the program
        if (!registrationMessage.equals("User registered successfully.")) {
            System.out.println("Registration failed. Please restart the program and try again.");
            scanner.close();
            return;
        }

        // Step 2: Login
        System.out.println("\nRegistration Successful! Please log in.\n");

        System.out.print("Enter your username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String loginPassword = scanner.nextLine();

        // Validate login credentials using the Checkuser class
        boolean loginSuccess = checkuser.loginUser(loginUsername, loginPassword);

        // Get the login status message from the Checkuser class
        String loginStatusMessage = checkuser.returnLoginStatus(loginSuccess);
        System.out.println(loginStatusMessage);

        // Display a personalized message for successful login
        if (loginSuccess) {
            System.out.println("Welcome it is great to see you again!;), " + firstName + " " + lastName + "!");
        }

        scanner.close();
    }
}