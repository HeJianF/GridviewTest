package com.e.gridviewtest;

import android.graphics.Bitmap;

/**
 * Author: He Jianfeng
 * Data: 2017/10/11
 */

public class Bean {

    private int bitmapId;//图片Id

    private String name;//图片编号

    Bean(int bitmap, String name) {
        this.bitmapId = bitmap;
        this.name = name;
    }

    public int getBitmapId() {
        return bitmapId;
    }

    public void setBitmapId(int bitmapId) {
        this.bitmapId = bitmapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
