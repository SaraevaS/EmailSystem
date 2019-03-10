/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication258;

/**
 *
 * @author sarayev
 */
public class MessageIDGenerator {

    public static int currentID =1000;
    
    public static int getNewID(){
        return currentID++;
    }


    
}
