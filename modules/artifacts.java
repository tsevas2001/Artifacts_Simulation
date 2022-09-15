package modules;
import java.util.Random;

abstract public class artifacts {

    int index;
    String creator;
    int year;

    public artifacts(int i) { // constructor
        System.out.println("Creating an instance of artifacts...");
        Random rand = new Random(); // creating random object, we need it to take random numbers
        String Names[] = {"Bogeyman", "Vampire", "Dybbuk", "Banshee", "Pontianak", "Hydra", "Chimera"}; // Array with the names of the array
        index = i;
        creator = Names[rand.nextInt(7)]; // random value from the info table of strings
        year = rand.nextInt(1500, 2022); // random numver from 1500 to 2022
        System.out.println("Artifacts created successfully!");
    }

    // printing the values of the class
    public void getInfo() {
        System.out.println("Creator: " + creator + " Year: " + year);
    }
    // printing the values of the class
    public void getIndex() {
        System.out.println("Index: " + index);
    }

    // abstract cause every child class doing different things
    abstract public boolean evaluate (String dat, String cond);

}
