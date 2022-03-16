package com.example.beta;

import static com.example.beta.FBref.refUser;

import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;

public class User {

    //the user: info about the user.
    //with id
    private String uid;
    private String userName;
    private float age;
    private boolean priorityOn;
    private boolean disabled;
    private boolean willPay;
    private ArrayList<Integer> area;

    public User() {}

    public User(String uid,String userName,float age,boolean priorityOn,boolean disabled,boolean willPay,ArrayList<Integer> area){

        this.uid=uid;
        this.userName=userName;
        this.age=age;
        this.priorityOn=priorityOn;
        this.disabled=disabled;
        this.willPay=willPay;
        this.area=area;

    }

    public String getUid(){
        return uid;
    }

    public void setUid(String uid){
      this.uid=uid;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String uid){
        this.userName=userName;
    }

    public float getAge(){
        return age;
    }

    public void setAge(float age){
        this.age=age;
    }

    public boolean getPriorityOn(){
        return priorityOn;
    }

    public void setPriorityOn(boolean priorityOn){
        this.priorityOn=priorityOn;
    }

    public boolean getDisabled(){
        return disabled;
    }

    public void setDisabled(boolean disabled){
        this.disabled=disabled;
    }

    public boolean getWillpay(){
        return willPay;
    }

    public void setWillPay(boolean willPay){
        this.willPay=willPay;
    }

    public ArrayList<Integer> getArea(){
        return area;
    }

    public void setArea(ArrayList<Integer> area){
        this.area=area;
    }

    @Override
    public String toString(){
        return "User{" +
                "uid=" + uid+""+
                ",userName="+userName+""+
                ",age="+age+""+
                ",priorityOn="+priorityOn+""+
                ",disabled="+disabled+""+
                ",willPay="+willPay+"";
    }
}

