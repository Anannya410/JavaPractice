
public sealed class Mammal permits Human, Cow {
    void walk(){
        System.out.println("This animal can walk");
    }
}

final class Human extends Mammal{
    void walk(){
        super.walk();
        System.out.println("Humans walk on 2 legs");
    }
}

final class Cow extends Mammal{
    void walk(){
        super.walk();
        System.out.println("Cow walks on 4 legs");
    }
}



//final class Bird extends Mammal{
//}

//Optionally if we declare the child classes of a sealed in the same file then we can remove the permits keyword. But this way all classes within the file can extend the sealed class


sealed class Reptiles{
    void walk(){
        System.out.println("These animals don't walk but they crawl");
    }
}

final class Snake extends Reptiles{
}
