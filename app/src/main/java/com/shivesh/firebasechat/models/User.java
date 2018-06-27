package com.shivesh.firebasechat.models;

/**
 * Author: Shivesh Karan Mehta
 * Created on: 17/2/2017 , 04:15 PM
 * Project: Chat Application Demo
 */
public class User {
    public String uid;
    public String email;
    public String firebaseToken;

    public User(){

    }

    public User(String uid, String email, String firebaseToken){
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}
