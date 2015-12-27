package com.example.kimhuang.recycleview;

/**
 * Created by Kimhuang on 27/12/2558.
 */
public class Items {
    private String item;
    private String id;

    public Items(String item, String id) {
        this.item = item;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getItem() {
        return item;
    }
}
