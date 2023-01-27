import java.util.Scanner;

public class BasicPay {
    public static void main(String[] args){
        int HRA,DA,Gross;
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();


        if(n>= 5000) {
             HRA = (n/10);
             DA = (n/5);
        } else {
            HRA = (n/5);
            DA = (n*3/10);
        }
        Gross = n + HRA + DA;
        System.out.println("The Gross Income is " + Gross );
        System.out.println("The HRA is " + HRA + " and DA is " + DA );
    }
}
