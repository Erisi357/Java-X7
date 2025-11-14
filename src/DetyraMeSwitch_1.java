import java.util.Scanner;

public class DetyraMeSwitch_1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Shtyp 1-E_Kuqe, 2-E_Verdhe, 3-E-Gjelber");
        int ngjyra = input.nextInt();

        switch (ngjyra)
        {
            case 1:
                System.out.println("Ndal");
                break;
            case 2:
                System.out.println("Behu Gati");
                break;
            case 3:
                System.out.println();
                break;
            default:
                System.out.println("Vlera e dhene eshte jashte rangut te ngjyrave te semaforit");

        }
    }
}
