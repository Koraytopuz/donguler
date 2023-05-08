import java.util.Scanner;

public class Main{
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        int number, sum = 0;


        do {
            System.out.print("Enter a number: ");
            number = inp.nextInt();
            if  (number % 4 == 0) {
                sum += number;
            }
            else if (number%2 != 0)
            {
                System.out.println("You entered odd number.");
            }

        } while (number % 2 == 0);

        System.out.print("Total: "+ sum);

    }
}
