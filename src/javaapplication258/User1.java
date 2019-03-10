/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication258;

/**
 *
 * @author USER
 */
public class User1 {
    private static User user1=new User();

    public User1() {
    }
    

    public static User getUser() {
        return user1;
    }

    public static void setUser (User user1) {
        User1.user1 = user1;
    }
    
}
