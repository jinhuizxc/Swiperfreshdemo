package com.example.jh.swiperfreshdemo;

/**
 * 作者：jinhui on 2017/3/20
 * 邮箱：1004260403@qq.com
 */

public class ImageInfor {

    private String name;
    private int imageId;

    public ImageInfor(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
