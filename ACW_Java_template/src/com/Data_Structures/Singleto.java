package com.Data_Structures;

public class Singleto {
    private volatile static Singleto uniqueInstance;
    private Singleto(){}
    public static Singleto getInstance(){
        if(uniqueInstance==null){
            synchronized (Singleto.class){
                if(uniqueInstance==null)
                    uniqueInstance = new Singleto();
            }
        }
    }
}
