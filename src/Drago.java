public class Drago implements Runnable {
    private final int count;
    private String name;

    public Drago(String nome, int count) {
        setName(nome + "");
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.getName() + " sto volando " + (i + 1));
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " sto volando " + (i + 1));

            System.out.println("sleep error nel main"+e);

        }
    }

    private void setName(String s) {
        this.name = s;
    }

    private String getName() {
        return name;
    }
}
