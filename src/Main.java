import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inTastiera = new Scanner(System.in);

        System.out.println("INSERISCI IL NUMERO DI BATTITI DI ALI: ");
        int count = inTastiera.nextInt();

        Cacciatore sangiorgio = new Cacciatore("Giorgio");

        Thread argo = new Thread(new Drago(count, "Argo"));

        argo.start();
        sangiorgio.lanciaDardi(argo);

        for (int i = 0; i < 10; i++) {

            System.out.println("Main sta osservando il drago... i = " + i + 1);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //ystem.out.println(e);
                throw new RuntimeException(e);
            }
        }
    }
}
