package com.example.bdm;

public class Model {
    private String Name_Products, Description;
    private int img;

    public String getName_Products() {
        return Name_Products;
    }

    public void setName_Products(String name_Products) {
        Name_Products = name_Products;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
