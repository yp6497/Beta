package com.example.beta;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class FBref {


    public static FirebaseDatabase FBDB = FirebaseDatabase.getInstance();

    public static DatabaseReference refUser = FBDB.getReference("User");
    public static DatabaseReference refPlace = FBDB.getReference("Place");
    public static DatabaseReference refOpinionMemorie = FBDB.getReference("OpinionMemorie");


    //User user= new User(uid,userName,age,priorityOn,disabled,willPay,area);
    //refUser.child(uid).setValue(user);

}






/*
    ArrayList<String> userList= new ArrayList<String>();
    ArrayList<User> userValues= new ArrayList<User>();

    @Override
    public void onDataChange(DataSnapshot ds){
        userList.clear();
        userValues.clear();
        for(DataSnapshot data : ds.getChildren()){
            str1= (String) data.getKey();
            User userTmp= data.getValue(User.class);
            userValues.add(userTmp);
            str2= userTmp.getUserName();
            userValues.add(str1+""+str2);
        }
    */

