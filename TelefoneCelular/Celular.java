package TelefoneCelular;

public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private double valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.setMarca("Samsung");
        celular.setModelo("Galaxy A21S");
        celular.setCor("Branco");
        celular.setValor(1345.34);


        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Valor: R$" + celular.getValor());
    }
}
