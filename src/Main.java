import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inTastiera = new Scanner(System.in);

        System.out.println("INSERISCI IL NUMERO DI BATTITI DI ALI: ");
        int battiti = inTastiera.nextInt();

        Cacciatore sangiorgio = new Cacciatore("Giorgio");

        Thread drago1 = new Thread(new Drago(battiti, "Argo"));

        drago1.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("Main sta osservando il drago... i = " + (i + 1));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Sleep error nel main: " + e);
                Thread.currentThread().interrupt();
                break;
            }
        }

        sangiorgio.colpisciDrago(drago1);

        inTastiera.close();
    }

}