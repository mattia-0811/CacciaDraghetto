public class Draghetto {


        // Attributi privati
        private String nome;
        private int energia;
        private int fame;

        // Costruttore
        public Draghetto(String nome) {
            this.nome = nome;
            this.energia = 100;
            this.fame = 30;
        }

        // Metodo mangia
        public void mangia() {
            fame -= 20;

            if (fame < 0) {
                fame = 0;
            }

            System.out.println(nome + " sgranocchia un marshmallow vulcanico! Fame ridotta.");
        }

        // Metodo vola
        public void vola(int numBattiti) {
            for (int i = 0; i < numBattiti; i++) {
                energia -= 1;
                fame += 1;

                // Evita che l'energia scenda sotto 0
                if (energia < 0) {
                    energia = 0;
                }

                // Evita che la fame superi 100
                if (fame > 100) {
                    fame = 100;
                }

                System.out.println("sto volando");
            }
        }

        // Metodo gioca
        public void gioca() {
            energia -= 20;
            fame += 15;

            if (energia < 0) {
                energia = 0;
            }

            if (fame > 100) {
                fame = 100;
            }

            System.out.println(nome + " fa un salto mortale e sputa una fiammella! Divertimento puro!");
        }

        // Metodo riposa
        public void riposa() {
            energia += 40;

            if (energia > 100) {
                energia = 100;
            }

            System.out.println(nome + " si appallottola e fa un pisolino... Zzz...");
        }

        // Metodo mostraStato
        public void mostraStato() {
            System.out.println("----- STATO DRAGHETTO -----");
            System.out.println("Nome: " + nome);
            System.out.println("Energia: " + energia);
            System.out.println("Fame: " + fame);
            System.out.println("---------------------------");
        }


    }
