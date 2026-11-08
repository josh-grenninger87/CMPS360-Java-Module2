package polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a roar");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says oink oink");
    }
}

class Cat extends Animal {
    public void animalSound(){
        System.out.println("The cat says meow");
    }
}

class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myPig.animalSound();
        myCat.animalSound();

    }
}
