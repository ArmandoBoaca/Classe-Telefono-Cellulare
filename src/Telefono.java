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

    public void setNumero(int newNumero) {
        this.numero = newNumero;
    }

    public void setOperatore(String newOperatore) {
        this.operatore = newOperatore;
    }

    public Object clone(){
        return new Telefono(this.marca, this.modello, this.numero, this.operatore);
    }

    public String toString(){
        String str = "{";
        str += "\n\"marca\" : \""+this.marca+"\",";
        str += "\n\"modello\" : \""+this.modello+"\",";
        str += "\n\"numero\" : "+this.numero+",";
        str += "\n\"this.operatore\" : \""+this.operatore+"\"";
        str += "\n}";
        return str;
    }

    public String toStringInner(){
        String str = "";
        str += "\n\"marca\" : \""+this.marca+"\",";
        str += "\n\"modello\" : \""+this.modello+"\",";
        str += "\n\"numero\" : "+this.numero+",";
        str += "\n\"this.operatore\" : \""+this.operatore+"\",";
        return str;
    }
}
