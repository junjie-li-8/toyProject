package ljj;

public class Animals {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    public static void main(String[] args){
        while(true){

        }
    }
}

class Pig extends Animals {
    public void animalSoundSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animals{
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
