import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(pluralize("dog", 0));

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
        clock();

    }

    public static String pluralize(String word, int numberOfPets) {
        if (numberOfPets == 0 || numberOfPets > 1) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int n) {
        int headsInARow = 0;
        int total = 0;
        Random rando = new Random();
        while(headsInARow < n){
            total++;
            int randomFlip = rando.nextInt(2);
            if(randomFlip == 0){
                System.out.println("tails");
                headsInARow=0;
            }
            else{
                System.out.println("heads");
                headsInARow++;
            }
            
        }
            System.out.println("It took " + total + " flips to flip " + n + " heads in a row" );
    }

    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        while(true){
            LocalDateTime current = LocalDateTime.now();
        if(now.getSecond() != current.getSecond()){
            now = current;
            String time = current.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
        }
        }
    }
}