
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Draghetto furia = new Draghetto("Furia");
        Draghetto sparky = new Draghetto("Sparky");

        int scelta;
        int drago;

        do {
            System.out.println("\n--- DRAGHETTO VIRTUALE ---");
            System.out.println("1. Usa Furia");
            System.out.println("2. Usa Sparky");
            System.out.println("0. Esci");
            System.out.print("Scegli: ");
            scelta = input.nextInt();

            if (scelta == 1 || scelta == 2) {

                Draghetto selezionato;

                if (scelta == 1) {
                    selezionato = furia;
                } else {
                    selezionato = sparky;
                }

                int azione;

                do {
                    System.out.println("\n--- MENU DRAGHETTO ---");
                    System.out.println("1. Mostra stato");
                    System.out.println("2. Mangia");
                    System.out.println("3. Vola");
                    System.out.println("4. Gioca");
                    System.out.println("5. Riposa");
                    System.out.println("0. Torna indietro");
                    System.out.print("Scegli un'azione: ");

                    azione = input.nextInt();

                    switch (azione) {
                        case 1:
                            selezionato.mostraStato();
                            break;

                        case 2:
                            selezionato.mangia();
                            break;

                        case 3:
                            System.out.print("Quanti battiti di ali? ");
                            int battiti = input.nextInt();
                            selezionato.vola(battiti);
                            break;

                        case 4:
                            selezionato.gioca();
                            break;

                        case 5:
                            selezionato.riposa();
                            break;

                        case 0:
                            System.out.println("Ritorno al menu principale.");
                            break;

                        default:
                            System.out.println("Scelta non valida!");
                    }

                } while (azione != 0);

            } else if (scelta != 0) {
                System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);

        System.out.println("Arrivederci!");
        input.close();
    }
}
