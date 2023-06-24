package FestaAniversario;

public abstract class FestaDeAniversario {
    private String nomeAniversariante;
    private int idadeAniversariante;
    private String local;
    private boolean temBolo;

    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdadeAniversariante() {
        return idadeAniversariante;
    }

    public void setIdadeAniversariante(int idadeAniversariante) {
        this.idadeAniversariante = idadeAniversariante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    public boolean isTemBolo() {
        return temBolo;
    }

    public void setTemBolo(boolean temBolo) {
        this.temBolo = temBolo;
    }

    public abstract void realizarFesta();

    public static void main(String[] args) {
        FestaDeAniversario festa = new FestaDeAniversario() {
            @Override
            public void realizarFesta() {
                System.out.println("minha festa de aniversariooooo!");
            }
        };

        festa.setNomeAniversariante("Brenda");
        festa.setIdadeAniversariante(20);
        festa.setLocal("Casa da joaninha");
        festa.setTemBolo(true);

        System.out.println("Nome do aniversariante: " + festa.getNomeAniversariante());
        System.out.println("Idade do aniversariante: " + festa.getIdadeAniversariante());
        System.out.println("Local da festa: " + festa.getLocal());

        System.out.println("Tem bolo? " + (festa.isTemBolo() ? "Sim" : "Não"));

        festa.realizarFesta();
    }
}

