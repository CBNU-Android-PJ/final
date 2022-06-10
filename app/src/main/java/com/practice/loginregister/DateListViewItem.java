package com.practice.loginregister;


import android.graphics.drawable.Drawable;

public class DateListViewItem {
    // 아이템 타입을 구분하기 위한 type 변수.
    private int type ;

    private String dateIngredientStr ;
    private String dateExpiryStr ;

    public void setType(int type) {
        this.type = type ;
    }
    public void setDateIngredient(String dateIngredient) {
        dateIngredientStr = dateIngredient ;
    }
    public void setDateExpiry(String dateExpiry) {
        dateExpiryStr = dateExpiry ;
    }


    public int getType() {
        return this.type ;
    }

    public String getDateIngredient() {
        return this.dateIngredientStr ;
    }
    public String getDateExpiry() {
        return this.dateExpiryStr ;
    }

}