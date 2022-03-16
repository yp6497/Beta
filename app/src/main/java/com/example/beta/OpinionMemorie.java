package com.example.beta;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class OpinionMemorie {

    //an opinion about a place or a memory page.
    //with id?
    private String userName;
    private String date;
    private ArrayList<String> image;
    private String description;
    private float grade;
    //id place- the place that the opinions goes to/memories;

    public OpinionMemorie() {}

    public OpinionMemorie( String userName,String date,ArrayList<String> image,String description,float grade) {

        this.userName=userName;
        this.date=date;
        this.image=image;
        this.description=description;
        this.grade=grade;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public float getGrade(){
        return grade;
    }

    public void setGrade(float grade){
        this.grade=grade;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public ArrayList<String> getImage(){
        return image;
    }

    public void setImage(ArrayList<String> image){
        this.image=image;
    }

    @Override
    public String toString(){
        return "User{" +
                "userName=" +userName+""+
                ",date="+date+""+
                ",image="+image+""+
                ",description="+description+""+
                ",grade="+grade+"";
    }

}
