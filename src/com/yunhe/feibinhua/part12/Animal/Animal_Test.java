package com.yunhe.feibinhua.part12.Animal;

public class Animal_Test {
    public static void main(String[] args) {
        Dog dog=new Dog("狗", 8, "黑色");
        Cat cat=new Cat("猫", 9, "白色");
        System.out.println(dog.eat("肉"));
        dog.play();
        System.out.println(cat.eat("鱼"));
        cat.play();
    }
}