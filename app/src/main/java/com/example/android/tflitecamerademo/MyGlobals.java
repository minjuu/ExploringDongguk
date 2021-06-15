package com.example.android.tflitecamerademo;

public class MyGlobals {
    private String gId;
    public String getId()
    {
        return gId;
    }
    public void setID(String id)
    {
        this.gId = id;
    }

    private static MyGlobals instance = null;

    public static synchronized MyGlobals getInstance(){
        if(null == instance){
            instance = new MyGlobals();
        }
        return instance;
    }
}


