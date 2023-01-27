import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Division :");
        int n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.println("First Rank");
                break;
            case 2:
                System.out.println("Second Rank");
                break;
            case 3:
                System.out.println("Third Rank");
                break;
            case 4:
                System.out.println("Fourth Rank");
                break;
        }



    }
}
