package com.company;

//Builder

public class LittlePigs {
    public static void main(String[] args) {
        IBuilder nifnif = new NifNif();
        IBuilder nafnaf = new NafNaf();
        IBuilder nufnuf = new NufNuf();

        Director director = new Director();

        director.setBuilder(nifnif);
        director.buildBase();

        director.setBuilder(nufnuf);
        director.buildWalls();
        director.buildRoof();


    }
}

interface IBuilder{

    void buildBase();
    void buildWalls();
    void buildRoof();

}

class NifNif implements IBuilder{

    @Override
    public void buildBase() {
        System.out.println("soil base");
    }

    @Override
    public void buildWalls() {
        System.out.println("clay walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("straw roof");
    }
}
class NafNaf implements IBuilder{

    @Override
    public void buildBase() {
        System.out.println("sand base");
    }

    @Override
    public void buildWalls() {
        System.out.println("sticks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("leaves roof");
    }
}
class NufNuf implements IBuilder{

    @Override
    public void buildBase() {
        System.out.println("concrete base");
    }

    @Override
    public void buildWalls() {
        System.out.println("bricks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("tile roof");
    }
}

class Director{
    private IBuilder builder;

    public void setBuilder(IBuilder builder) {
        this.builder = builder;
    }

    public void buildBase(){
        builder.buildBase();
    }
    public void buildWalls(){
        builder.buildWalls();
    }
    public void buildRoof(){
        builder.buildRoof();
    }




}