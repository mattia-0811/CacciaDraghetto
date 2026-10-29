public class Drago implements Runnable {

    private String nome;
    private int numBattiti;

    public Drago(int numBattiti, String nome) {
        this.nome = nome;
        this.numBattiti = numBattiti;
    }

    @Override
    public void run() {

        for (int i = 0; i < numBattiti; i++) {

            System.out.println(nome + " si libra nell'aria! Gioia immensa, al battito " + (i + 1));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(nome + " è stato colpito dal cacciatore!");
                System.out.println(nome + " è morto!");
                return;
            }
        }

        System.out.println(nome + " ha terminato di volare.");
    }

}