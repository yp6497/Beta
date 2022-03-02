package com.example.beta;

import java.util.ArrayList;

public class Place {

    //info about a place;
    //with id
    private String placeName;
    private String adrress;
    private boolean payment;
    private float price;
    private float star;
    private boolean favorite;
    private float age;
    private int season;
    private String area;
    private boolean forFamily;
    private boolean forDisabled;
    private String placeKind; //river, walking
    private String description;
    private ArrayList<String> images;

    public Place() {}

    public Place(String placeName,String adrress,boolean payment,float price,float star,boolean favorite,float age,
                 int season,String area,boolean forFamily,boolean forDisabled,String placeKind,String description){

        this.placeName=placeName;
        this.adrress=adrress;
        this.payment=payment;
        this.price=price;
        this.star=star;
        this.favorite=favorite;
        this.age=age;
        this.season=season;
        this.area=area;
        this.forFamily=forFamily;
        this.forDisabled=forDisabled;
        this.placeKind=placeKind;
        this.description=description;

    }


    public String getPlaceName(){
        return placeName;
    }

    public void setPlaceName(String placeName){
        this.placeName=placeName;
    }

    public String getAdrress(){
        return adrress;
    }

    public void setAdrress(String adrress){
        this.adrress=adrress;
    }

    public boolean getPayment(){
        return payment;
    }

    public void setWithPayment(boolean withPayment){
        this.payment=withPayment;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public float getStar(){
        return star;
    }

    public void setStar(float star){
        this.star=star;
    }

    public boolean getFavorite(){
        return favorite;
    }

    public void setFavorite(boolean favorite){
        this.favorite=favorite;
    }

    public float getAge(){
        return age;
    }

    public void setArea(float age){
        this.age=age;
    }

    public int getSeason(){
        return season;
    }

    public void setSeason(int season){
        this.season=season;
    }

    public String getArea(){
        return area;
    }

    public void setArea(String area){
        this.area=area;
    }

    public boolean getForFamily(){
        return forFamily;
    }

    public void setForFamily(boolean forFamily){
        this.forFamily=forFamily;
    }

    public boolean getForDisabled(){
        return forDisabled;
    }

    public void setForDisabled(boolean forDisabled){
        this.forDisabled=forDisabled;
    }

    public String getPlaceKind(){
        return placeKind;
    }

    public void setPlaceKind(String placeKind){
        this.placeKind=placeKind;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public ArrayList<String> getImages(){
        return images;
    }

    public void setImages(ArrayList<String> images){
        this.images=images;
    }
}
