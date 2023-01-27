import java.util.Random;
import java.util.Scanner;

public class RandomNumGenerator {
    public static void main(String[] args){
        Random rn = new Random();
        int ComputerChoice = rn.nextInt(20);
        // guess the number
        Scanner sc = new Scanner(System.in);
        int UserChoice = sc.nextInt();

            if (UserChoice > ComputerChoice) {
                System.out.println("Your guess is higher then the number.");
            } else if (UserChoice < ComputerChoice) {
                System.out.println("Your guess is lower then the number.");
            } else {
                System.out.println("Your guess is correct!!");

            }
        System.out.println("The Computer's choice is "+ ComputerChoice);

    }

    }

