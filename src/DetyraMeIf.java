import java.util.Scanner;

public class DetyraMeIf {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Shtyp nje numer te plote");
        int x = input.nextInt();

        System.out.println("Shtyp nje numer te plote");
        int y = input.nextInt();

        int z = 0;

        if (x < y) {
            System.out.println("x ka vleren me te vogel se y");
            z = x + y;
            System.out.println("Vlera e shumes se ekuacionit Z eshte: " + z);
        } else if (x > y){
            System.out.println("X ka vleren me te madhe se y");
            z = x - y;
            System.out.println("Vlera e shumes se ekuacionit Z eshte: " + z);
        } else {
            System.out.println("x eshte i barabarte me y");
        }
    }
}
