import java.util.Scanner;

public class DetyraMeIfElse_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Shtyp nje numer (byte) a");
        int a = input.nextInt();

        if (a > 0){
            System.out.print("a eshte pozitiv");
        } else if (a < 0){
            System.out.print("a eshte negativ");
        } else {
            System.out.print("a eshte zero");
        }
        System.out.println();
        System.out.print("a = " + a);
    }
}
