package com.company;

public class WiseOwl {
    public static void main(String[] args) {
        Singleton owl = Singleton.getInstanse();
        System.out.println(owl);

    }
}
class Singleton{

    private static Singleton instance = new Singleton();
    private int wisdom  = 0;

    private Singleton(){
        System.out.println("There was an old owl");
    }
    public static Singleton getInstanse(){
        return instance;
    }

    public void incWisdom(){
        wisdom++;
    }
    public int getWisdom() {
        return wisdom;
    }

}