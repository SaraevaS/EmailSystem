/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication258;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class User {

    private String name;
    private String surname;
    private String mail;
    private int userId;
    private String username;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private static MessageList messages;
    static int counter = 1000;
    Scanner in;
    private int k;

    public User() {

    }

    public User(String name, String surname, String username, String mail, String password, String securityQuestion, String securityAnswer) {
        in = new Scanner(System.in);
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.securityAnswer = securityAnswer;
        this.username = username;
        this.securityQuestion = securityQuestion;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
        k = 1;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname
                + ", mail=" + mail + ", userId=" + userId
                + ", password=" + password + ", securityQuestion="
                + securityQuestion + ", securityAnswer=" + securityAnswer + '}';
    }

    public boolean checkPassword(String s) {
        if (s.length() < 8) {
            return false;
        }
        return true;
    }

    public boolean checkMail(String s) {
        if (s.contains("@")) {
            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '@') {
                    k++;
                }
            }
            if (k == 1) {
                int t = 0;
                String a[] = s.split("@");
                for (int i = 0; i < a[1].length(); i++) {
                    if (a[1].charAt(i) == '.') {
                        t++;
                    }
                }
                if (t == 1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setUserId() {
        this.userId = counter;
        counter++;
    }

}
