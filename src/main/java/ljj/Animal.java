package ljj;

public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    public static void main(String[] args){
        while(true){

        }
    }
}

class Pig extends Animal {
    public void animalSound() {
        try{
            System.out.println("The pig says: wee wee");
        }
        catch (Exception e){

        }

    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
