//Refer to comments at the bottom to compile this code

sealed class Animal permits Cat, Dog {
        String name;
        Animal(String name){
            this.name = name;
        }
}

final class Dog extends Animal{
    Dog(String name){
        super(name);
    }
}

final class Cat extends Animal{
    Cat(String name){
        super(name);
    }
}

public class PatternMatching {
    public static void main(String args[]){
        Animal animal = new Dog("Tuffy");

        if(animal instanceof Dog dog){
            System.out.println("This is a dog named: "+dog.name);
        }
        else if(animal instanceof Cat cat){
            System.out.println("This is a cat named: "+cat.name);
        }

        Object obj1 = "Java";
        if(obj1 instanceof String str){
            System.out.println("This is a string: "+obj1);
        }

        //Java 17 also allows applying switch to match according to object type
        switch (animal){
            case Dog d-> System.out.println("This is a Dog");
            case Cat c -> System.out.println("This is a Cat");
            default -> System.out.println("Unknow Type");
        }
        //Pattern matching in Java17 is a preview feature which is extended in subsequent versions
        // As it is a preview feature it is not available by default so use the following to compile and execute the code
        //javac --enable-preview --release 20 PatternMatching.java
        //java --enable-preview PatternMatching

    }
}



