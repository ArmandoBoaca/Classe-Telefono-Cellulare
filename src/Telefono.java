public class Telefono {
    private String marca;
    private String modello;
    private int numero;
    private String operatore;

    public Telefono(String marca, String modello, int numero, String operatore){
        this.marca = marca;
        this.modello = modello;
        this.numero = numero;
        this.operatore = operatore;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNumero() {
        return numero;
    }

    public String getOperatore() {
        return operatore;
    }
}
