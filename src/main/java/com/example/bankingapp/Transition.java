/*
  AKSHAY KOKADWAR
  VELLORE INSTITUTE OF TECHNOLOGY
  INTERNSHIP TASK #2 Basic Banking App
  GRIP SPARK FOUNDATION
 */


package com.example.bankingapp;
public class Transition {
    String sender,receiver,amount,status;
    public Transition(String sender, String receiver, String amt, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amt;
        this.status = status;
    }
    String getSender(){
        return this.sender;
    }
    String getReceiver(){
        return this.receiver;
    }
    String getAmount(){
        return this.amount;
    }
    String getStatus(){
        return this.status;
    }
}
