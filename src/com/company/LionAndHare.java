package com.company;

public class LionAndHare {
    public static void main(String[] args) {
        Lion lion = new CleverLion();
        Hare hare = new StupidHare();
        hare.meetWithLion(lion);
        lion.meetWithHare(hare);
    }
}

abstract class Lion{
    public boolean wit;

    abstract public void meetWithHare(Hare hare);
}

abstract class Hare{
    public boolean wit;

    abstract public void meetWithLion(Lion lion);
}

class StupidLion extends Lion {
    public StupidLion() {
        wit = false;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if(hare.wit)
            System.out.println("Lion jumps");
        else System.out.println("Lion eats the hare");
    }
}
class CleverLion extends Lion {
    public CleverLion() {
        wit = true;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if(hare.wit)
            System.out.println("Lion talk with hare");
        else System.out.println("Lion will eat the hare");
    }
}

class StupidHare extends Hare{
    public StupidHare() {
        wit = false;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("I have no chance");
        else System.out.println("I afraid him");
    }
}
class CleverHare extends Hare{
    public CleverHare() {
        wit = true;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("My attempt fails");
        else System.out.println("I will try to fool him");
    }
}