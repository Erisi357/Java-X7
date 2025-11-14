import java.util.Scanner;

public class UshtrimeIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Shtypni nje numer nga 1 deri 20: ");
        int numri = input.nextInt();

        if (numri >= 1 && numri <= 20){
            System.out.println("Numri i shtypur perputhet me kerkesen");
        } else {
            System.out.println("Numri i shtypur nuk perputhet me kerkesen");
        }
    }
}
