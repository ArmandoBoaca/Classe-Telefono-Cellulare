
class Telefono {
    protected String marca;
    protected String modello;
    protected String numero;
    protected String operatore;

    public Telefono(String marca, String modello, String numero, String operatore){
        this.marca = marca;
        this.modello = modello;
        this.numero = numero;
        this.operatore = operatore;
    }

    public Telefono(Telefono telefono){
        this.marca = telefono.marca;
        this.modello = telefono.modello;
        this.numero = telefono.numero;
        this.operatore = telefono.operatore;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getOperatore() {
        return this.operatore;
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
