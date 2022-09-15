import java.util.Random;
import modules.artifacts;
import modules.paintings;

public class Main {

    public static void main(String[] args){
        
        int N = Integer.parseInt(args[0]); // convert to integer 
        String movement = args[1];
        String condition = args[2];
        Random rand = new Random();

        // array of artifacts
        artifacts arts[];
        arts = new artifacts[N];

        // creating the arts
        for (int i = 0; i < N; i++) {
            if (rand.nextInt(2) == 0) {
                arts[i] = new paintings(i);
            } else {
                arts[i] = new paintings(i);
            }
        }
        auction(arts, movement, condition);
    }
    
    // printing the information of every object and checking if they are Accepted or Not
    public static void auction (artifacts arts[], String movement, String condition) {
        for (artifacts art: arts) {
            art.getInfo();
            if (art.evaluate(movement, condition)) {
                System.out.println("Accepted");
            }else{
                System.out.println("Not Accepted");
            }

        }
    }
    
}
