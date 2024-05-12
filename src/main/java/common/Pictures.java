package main.java.common;

import java.io.Serializable;

public class Pictures implements Serializable {

    private String pictureName;
    private byte[] pictureData;

    public Pictures(String pictureName, byte[] pictureData){
        this.pictureName = pictureName;
        this.pictureData = pictureData;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public void setPictureData(byte[] pictureData) {
        this.pictureData = pictureData;
    }

    public String getPictureName() {
        return pictureName;
    }

    public byte[] getPictureData() {
        return pictureData;
    }
}
