/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication258;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Message {

    int messageID;
    String subject;
    String from;
    String to;
    String text;
    Date timeOfMessage;
    boolean isRead;
    boolean isSpam;
    boolean deletedByFrom;
    boolean deletedByTo;
    

    public Message() {
    }

    public int getMessageID() {
        return messageID;
    }

    public boolean isDeletedByFrom() {
        return deletedByFrom;
    }

    public void setDeletedByFrom(boolean deletedByFrom) {
        this.deletedByFrom = deletedByFrom;
    }

    public boolean isDeletedByTo() {
        return deletedByTo;
    }

    public void setDeletedByTo(boolean deletedByTo) {
        this.deletedByTo = deletedByTo;
    }

    public void setMessageID(int id) {
        this.messageID = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public boolean isIsSpam() {
        return isSpam;
    }

    public void setIsSpam(boolean isSpam) {
        this.isSpam = isSpam;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTimeOfMessage() {
        return timeOfMessage;
    }

    public void setTimeOfMessage(Date timeOfMessage) {
        this.timeOfMessage = timeOfMessage;
    }

    @Override
    public String toString() {
        return "Message{" + "messageID=" + messageID + ", subject=" + subject + ", from=" + from + ", to=" + to + ", text=" + text + ", timeOfMessage=" + timeOfMessage + ", isRead=" + isRead + ", isSpam=" + isSpam + '}';
    }
    
 

    
   

}
