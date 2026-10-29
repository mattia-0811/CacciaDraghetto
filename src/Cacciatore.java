public class Cacciatore {

    private String nome;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void colpisciDrago(Thread drago) {
        System.out.println("Il cacciatore " + nome + " lancia il dardo!");
        drago.interrupt();
    }

}