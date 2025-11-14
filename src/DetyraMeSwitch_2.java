import java.util.Scanner;

public class DetyraMeSwitch_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Shtyp 1-E_Hene, 2-E_Marte, 3-E-Merkure, 4-E_Enjte, 5-E_Premte, 6-E_Shtune, 7-E_Diell");
        int Dita = input.nextInt();

        switch (Dita){
            case 1:
                System.out.println("E Hene");
                break;
            case 2:
                System.out.println("E Marte");
                break;
            case 3:
                System.out.println("E Merkure");
                break;
            case 4:
                System.out.println("E Enjte");
                break;
            case 5:
                System.out.println("E Premte");
                break;
            case 6:
                System.out.println("E Shtune");
                break;
            case 7:
                System.out.println("E Diell");
                break;
            default:
                System.out.println("Numri nuk perputhet me ditet");
        }
    }
}
