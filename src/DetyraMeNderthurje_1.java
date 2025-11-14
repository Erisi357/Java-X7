import java.util.Scanner;

public class DetyraMeNderthurje_1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Shtyp nje numer te plote x: ");
        int x = input.nextInt();

        System.out.println("Shtyp nje numer te plote y: ");
        int y = input.nextInt();

        System.out.println("Shtyp nje numer te plote z:");
        int z = input.nextInt();

        if (x > y) {
            if (y > z) {
                System.out.println();
                System.out.println("x = " + x + ", ka vleren me te madhe se y = " + y + ", dhe me te madhe se z = " + z);
            } else {
                System.out.println();
                System.out.println("Kushti x > y dhe y > z nuk eshte plotesuar");
            }
        }
            else
            {
                System.out.println();
                System.out.println("Kushti x > y nuk eshte plotesuar");
            }
    }
}
