public class Cacciatore {

    private String nome;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void lanciaDardi(Thread drago) {
        for (int i = 0; i <= 20 && (!drago.isInterrupted()); i++) {
            try {
                Thread.sleep(500);
                drago.interrupt();
                System.out.println(nome+" sta cercando di colpire il drago");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Il cacciatore " + nome + " lancia il dardo!");
            drago.interrupt();
        }
    }
}