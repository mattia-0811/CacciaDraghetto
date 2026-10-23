import java.time.Duration;

public class Cacciatore {
    private String nome;

    public Cacciatore(String nome) {
        this.nome=nome;
    }


    public void lanciaDardo(Thread d) {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main"+e);
            }
            System.out.println("il cacciatore"+nome+"sta lanciando il dardo="+i);
            d.interrupt();
        }
    }
}

