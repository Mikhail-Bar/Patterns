package com.company;
//Facade

import java.util.ArrayList;
import java.util.SortedMap;

public class DocktorCroaky {
    public static void main(String[] args) {
    Story.tell();
        System.out.println("************************************************");
    Story.tell2();


    }
}

interface IAnimal{
    void come();
}
class Fox implements IAnimal{

    @Override
    public void come() {
        System.out.println("The fox came");
    }
    public void ask(){
        System.out.println("Fox: if you can cure everyone then why haven't you cured your lame legs?");
    }
}
class Deer implements IAnimal{

    @Override
    public void come() {
        System.out.println("The deer came");
    }
}
class Tortoise implements IAnimal{

    @Override
    public void come() {
        System.out.println("The tortoise came");
    }
}

class Frog{
    public Frog went(){
        System.out.println("The frog went to the forest lake");
        return this;
    }
    public Frog sayHello(){ //chaining
        System.out.println("Frog: Friends, please come here. I am new here. I want to meet all of you. I have come from the village.");
        return this;
    }
    public Frog introduce(){
        System.out.println("Frog: Let me introduce myself. I am Dr. Croaky");
        return this;
    }
    public Frog advertise(){
        System.out.println("Frog: I have medicines for all animals’ diseases. You can come to meet me anytime.");
        return this;
    }
    public Frog askToBeFriend(){
        System.out.println("Frog: Can we be friends?");
        return this;
    }
    public Frog listen(){
        System.out.println("The frog went red with shame for his lie had been detected.");
        return this;
    }
}

class Story{
    private static ArrayList<IAnimal> animals = new ArrayList<>();
    public static void tell(){
        Frog frog = new Frog();
        animals.add(new Deer());
        animals.add(new Tortoise());
        IAnimal fox = new Fox();
        animals.add(fox);

        frog.went().sayHello();
        animals.forEach(IAnimal::come);
        frog.introduce().advertise();
        ((Fox)fox).ask();
        frog.listen();
    }
        public static void tell2(){
        Frog frog = new Frog();
        animals.add(new Deer());
        animals.add(new Tortoise());
        IAnimal fox = new Fox();
        animals.add(fox);

        frog.went().sayHello();
        animals.forEach(IAnimal::come);
        frog.introduce().askToBeFriend();

    }

}