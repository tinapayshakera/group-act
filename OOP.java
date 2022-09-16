package abstraction_tinapayfinal;
abstract class Animal {

    public abstract void bees();

    public abstract void snake();

    public abstract void tiger();

    public void sleep() {
        System.out.println("When they sleep: Zzzz.");
    }
    public void wild(){
        System.out.println("This animals are all aggressive.");
    }
}

class Insects extends Animal {

    public void bees() {
        System.out.println("Bee sound like Zzzz.");
    }
    public void snake(){
        System.out.println("Snake sound like hsssssss.");
    }
    public void tiger(){
        System.out.println("Tiger sound like roooaaaarrr.");
    }
}


public class Abstraction_TinapayFinal {

    public static void main(String[] args) {
        Insects b = new Insects();
        b.bees();
        b.snake();
        b.tiger();
        b.sleep();
        b.wild();

    }
}
