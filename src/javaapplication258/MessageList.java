/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication258;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author USER
 */
public class MessageList {

    private static ArrayList<Message> messageList = new ArrayList<Message>();
    ArrayList<String> inboxmessageSubject = new ArrayList<>();
    ArrayList<String> sentboxmessageSubject = new ArrayList<>();

    /*  static DefaultListModel<String> inboxmessage = new DefaultListModel<>();
    static DefaultListModel<String> sentmessage = new DefaultListModel<>();
     static DefaultListModel<String> inmessagesubject = new DefaultListModel<>();
    static DefaultListModel<String> sentmessagesubject = new DefaultListModel<>();
     */
    public MessageList() {
    }

    public List<Message> getReceivedMessages(String to) {
        List<Message> receivedMessages = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getTo().equals(to)) {
                if(message.deletedByTo==false)
                receivedMessages.add(message);
            }
        }
        return receivedMessages;
    }

    public List<Message> getSentMessages(String from) {
        List<Message> sentMessages = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getFrom().equals(from)) {
                if(message.deletedByFrom==false)
                sentMessages.add(message);
            }
        }
        return sentMessages;
    }

    public void addMessage(Message message) {
        messageList.add(message);
    }

    public Message getMessageById(int id) {
        for (Message message : messageList) {
            if (message.getMessageID() == id) {
                return message;
            }
        }
        return null;
    }

    /* public void getMessageSent(String from) {
 for (Message message : messageList) {
            System.out.println("------");
            System.out.println(message);
        }
        for (Message message : messageList) {
            if (message.getFrom().equals(from)) {
                sentmessage.addElement(message.toString());
            }
        }

    }
 public void getMessageIn(String to) {
 for (Message message : messageList) {
            System.out.println("------");
            System.out.println(message);
        }
        for (Message message : messageList) {
            if (message.getTo().equals(to)) {
                inboxmessage.addElement(message.toString());
            }
        }

    } */
    @Override
    public String toString() {
        return "MessageList{" + '}';
    }

}
