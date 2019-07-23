package com.ddg.sgah.data.model;

/**
 * Created by Mostafa khedr on 15,يوليو,2019
 */
public class HomeListModel {
    private int image;
    private int title;
    private String titleString;
    private String units;
    private int teacher;
    private String section;
    private String reference;

    public HomeListModel(int title, String section, String reference, int teacher) {
        this.title = title;
        this.section = section;
        this.reference = reference;
        this.teacher = teacher;
    }

    public HomeListModel(int title) {
        this.title = title;
    }

    public HomeListModel(int image, int title) {
        this.image = image;
        this.title = title;
    }

    public HomeListModel(int image, String titleString) {
        this.image = image;
        this.titleString = titleString;
    }


    public String getTitleString() {
        return titleString;
    }

    public void setTitleString(String titleString) {
        this.titleString = titleString;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    private int title2;

    public int getImage() {

        return image;
    }

    public int getTitle2() {
        return title2;
    }

    public void setTitle2(int title2) {
        this.title2 = title2;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }


}
