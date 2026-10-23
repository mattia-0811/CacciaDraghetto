
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("INSERISCI inìl numero di battiti di ali: ");
        int battiti = inTastiera.nextInt();
        Thread drago1 = new Thread(new Drago("argo", battiti));
        drago1.start();

        sangiorgio.lanciaDardi(drago1)

        for (int i = 0; i <= 5; i++) {
            System.out.println("main continua a fare cose...i=" + i);


        }
    }
}
