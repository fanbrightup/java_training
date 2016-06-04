package com.example.fan.criminalintent;

import java.util.UUID;

/**
 * Created by fan on 16-6-1.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime(){
        //生成唯一标识符
        mID = UUID.randomUUID();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmID() {
        return mID;
    }

}
