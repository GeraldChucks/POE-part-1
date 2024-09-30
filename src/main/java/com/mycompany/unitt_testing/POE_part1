/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitt_testing;
import java.util.*;

/**
 *
 * @author RC_Student_lab
 */
public class Registration_and_Login {

    
    public static void main(String[] args) {
      
        //Login instance 
        Login check_all = new Login();
        
        //object for our scanner 
        Scanner user_input = new Scanner(System.in);
        
        //prompting the user for username and password
        
        //declare variable 
        String username = "";
        String password = "";
        
        //use do while 
        do{
            //propmt
            System.out.println("Enter username:");
            username = user_input.nextLine();
            
        }while(!check_all.CheckUsername(username));
            
            
           //user do while for password 
           do{
               //prompt
               System.out.println("Enter password:");
               password =user_input.nextLine();
               
           }while(!check_all.checkPassword(password));
    }
}
