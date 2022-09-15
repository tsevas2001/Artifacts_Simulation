package modules;
import java.util.Random;

public class paintings extends masterpiece{
    float length;
    float width;
    String technique;
    float surface;

    public paintings(int i) { // constructor
        super(i); // super is used to refer immediate parent class instance variable
        System.out.println("Creating an instance of paintings...");
        Random rand = new Random(); // creating random object, we need it to take random numbers
        String tech[] = {"oil", " aquarelle", "tempera"};
        length = rand.nextFloat(); // random float value
        width = rand.nextFloat(); // random float value
        technique = tech[rand.nextInt(3)]; // random value from the tech table of strings
        surface = width * length; // calculating the surface
        System.out.println("Paintings created successfully!");
    }
    
    // printing the values of the class
    public void getInfo () {
        super.getInfo(); // getting the method getInfo from the super class
        System.out.println("Length: " + length + " Width: " + width + " Technique: " + technique + " Surface: " + surface);
    }

    // checking if the art is accepteable
    public boolean evaluate (String dat, String cond) {
        if (condition.equals("")){ // checking if the value of the condition is empty
            if (dat.equals(movement) && cond.equals("good")){ // then check if the given parameters are valid
                return true;
            }else{
                return false;
            }
        }
        else if (dat.equals(movement) && cond.equals(condition)) {// then check if the given parameters are valid
            return true;
        }else if (dat.equals(movement) && cond.equals("good") && condition.equals("excellent")){ // then check if the given parameters are valid
            return true;
        }else{
            return false;
        }
    }
}
