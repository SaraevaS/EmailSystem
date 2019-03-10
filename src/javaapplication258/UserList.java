/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication258;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UserList {

    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserList.users = users;
    }

    public UserList() {
        System.out.println("Adding users");
        if(users.size()==0){
        User u1 = new User("t", "t", "t", "t@t.com", "123456789", "What is your favorite movie?", "t");
        User u2 = new User("m", "m", "m", "m@t.com", "123456789", "What is your favorite movie?", "t");
        u1.setUserId();
        u2.setUserId();
        users.add(u1);
        users.add(u2);}
        
    }

    public void addUser(User u) {
        users.add(u);
    }

    public boolean searchUser(String mail) {
        for (User user : users) {
            if (user.getMail().equals(mail)) {
                return true;
            }
        }
        return false;
    }

    public int indexUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return users.indexOf(user);
            }
        }
        return -1;
    }

    public boolean isPasswordTrue(int k, String password) {
        System.out.println("User PP: " + users.get(k).getPassword());
        System.out.println("User PP: " + password);
        if (users.get(k).getPassword().equals(password)) {
            System.out.println("-----");
            return true;
        }
        return false;

    }
    
      public User getUserByUsername(String username) {
        for (User user : users) {
           
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean searchUserName(String username) {
        for (User user : users) {
            System.out.println("S_Username: " + username);
            System.out.println("Username: " + user.getUsername());
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
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

    public String getMailFromIndex(int k) {
        return users.get(k).getMail();
    }

    public String getNameFromIndex(int k) {
        return users.get(k).getName();
    }

    public String getAnswerFromIndex(int k) {
        return users.get(k).getSecurityAnswer();

    }

    public String getPasswordFromIndex(int k) {
        return users.get(k).getPassword();
    }

    public String getQuestionFromIndex(int k) {
        return users.get(k).getSecurityQuestion();
    }

    public User getUser(int k) {
        return users.get(k);
    }
}
