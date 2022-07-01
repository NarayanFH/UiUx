package com.example.ui_tasks;

public class Tab1RecV {
    private String title1;
    private String title2;
    private String text1;
    private String text2;
    private int img1;
    private int img2;

    public Tab1RecV(String title1, String title2, String text1, String text2, int img1, int img2) {
        this.title1 = title1;
        this.title2 = title2;
        this.text1 = text1;
        this.text2 = text2;
        this.img1 = img1;
        this.img2 = img2;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getTitle1() {
        return title1;
    }
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title1;
    }
    public void setTitle2(String title2) {
        this.title2 = title2;
    }
    public int getImg1() {
        return img1;
    }
    public void setImg1(int img1) {
        this.img1 = img1;
    }
    public int getImg2() {
        return img2;
    }
    public void setImg2(int img2) {
        this.img2 = img2;
    }
}
