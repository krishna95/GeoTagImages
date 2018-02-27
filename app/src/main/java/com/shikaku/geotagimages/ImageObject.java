package com.shikaku.geotagimages;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by shikaku on 2/26/18.
 */

public class ImageObject implements Serializable{
    private Bitmap imgBitMap;
    private String address;

    ImageObject (Bitmap img, String add){
        address = add;
        imgBitMap = img;
    }

}
