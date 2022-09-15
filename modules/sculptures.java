package modules;
import java.util.Random;

public class sculptures extends masterpiece{

    float volume;
    String material;

    public sculptures (int i) { // constructor
        super(i);// super is used to refer immediate parent class instance variable
        System.out.println("Creating an instance of sculptures...");
        Random rand = new Random(); // creating random object, we need it to take random numbers
        String mat[] = {"iron", "stone", "wood"};
        volume = rand.nextFloat(); // random float value
        material = mat[rand.nextInt(3)]; // random value from the mat table of strings
        System.out.println("Sculptures created successfully!");
    }

    // printing the values of the class
    public void getInfo () {
        super.getInfo(); // getting the method getInfo from the super class
        System.out.println("Volume: " + volume + " Material: " + material);
    }

    // checking if the art is accepteable
    public boolean evaluate (String dat, String cond) {
        if (condition.equals("")){ // checking if the value of the condition is empty
            if (dat.equals(movement) && cond.equals("excellent")){ // then check if the given parameters are valid
                return true;
            }else{
                return false;
            }
        }
        else if (dat.equals(movement) && cond.equals(condition)) { // then check if the given parameters are valid
            return true;
        }else{
            return false;
        }
    }
}
