package com.shivesh.firebasechat.models;

/**
 * Author: Shivesh Karan Mehta
 * Created on: 17/2/2017 , 05:10 PM
 * Project: Chat Application Demo
 */
public class Users {

    private String emailId;
    private String lastMessage;
    private int notifCount;

    public String getEmailId(){ return emailId; }

    public void setEmailId(){ this.emailId = emailId; }

    public String getLastMessage(){ return lastMessage; }

    public void setLastMessage(){ this.lastMessage = lastMessage; }

    public int getNotifCount(){ return notifCount; }

    public void setNotifCount(int notifCount){ this.notifCount = notifCount; }
}
