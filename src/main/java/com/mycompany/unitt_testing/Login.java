/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unitt_testing;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    
    //Check username
    
    //temp variable for checking
    boolean Found = false;
    
    //check the useername
    
    if (username.length() <= 5 && username.contains("_")){
    //then assign to true
    Found = true;
    //message 
    System.out.println("Username is captured!");
    }
    
    else{
    //assign to false
    Found=false;
    //message 
    System.out.println("Username is not captured!");
    }
    
    return Found;
    
    }
    
    //check the password
    public boolean checkPassword(String password){
    //pattern regex
    Pattern check_num = Pattern.compile("[0123456789]");
    Pattern check_special = Pattern.compile("[!@#$%^&*_-~`]");
    Pattern check_Upper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYXZ]");
    
    // temp variable Found
    boolean Found = false;
    
    //check all here
    if(check_num.matcher(password).find() && check_special.matcher(password).find() && check_Upper.matcher(password).find() ){
        
        //assign ntrue 
        Found = true;
   //message 
   System.out.println("Password is captured");
           
    }else{ 
        // assign to false
         Found = false;
        //message
     System.out.println("Password is not captured");
}
    
    return Found;
    
}
}