package modules;
import java.util.Random;

abstract public class masterpiece extends artifacts {

    String movement;
    String condition;

    public masterpiece(int i) {
        super(i);
        System.out.println("Creating an instance of masterpiece...");
        Random rand = new Random(); // creating random object, we need it to take random numbers
        String info[] = {"impressionism", "expressionism", "naturalism"}; 
        String cond[] = {"bad", "good", "excellent", ""};
        movement = info[rand.nextInt(3)]; // random value from the info table of strings
        condition = cond[rand.nextInt(4)]; // random value from the cond table of strings
        System.out.println("Masterpiece created successfully!");
    }

    // printing the values of the class
    public void getInfo() {
        super.getInfo(); // getting the method getInfo from the super class
        super.getIndex(); // getting the method getIndex from the super class
        System.out.println("Movement: " + movement + " Condition: " + condition);
    }

    // abstract cause every child class doing different things
    abstract public boolean evaluate (String dat, String cond);
}
