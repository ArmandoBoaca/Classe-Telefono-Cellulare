import java.math.BigInteger;

public class Telefono {
    private String marca;
    private String modello;
    private String numero;
    private String operatore;

    public Telefono(String marca, String modello, String numero, String operatore){
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

    public String getNumero() {
        return numero;
    }

    public String getOperatore() {
        return operatore;
    }

    public void setNumero(String newNumero) {
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
