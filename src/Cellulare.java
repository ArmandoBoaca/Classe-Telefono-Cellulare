class Cellulare extends Telefono{
    private String os;

    public Cellulare(String marca, String modello, String numero, String operatore, String os){
        super(marca, modello, numero, operatore);
        this.os = os;
    }

    public Cellulare(Cellulare originale){
        super(originale.marca, originale.modello, originale.numero, originale.operatore);
        this.os = originale.os;
    }

    public String getOS() {
        return this.os;
    }
    public void setOS(String newOs){
        this.os = newOs;
    }

    public String toString(){
        String str = "{";
        str += super.toStringInner();
        str += "\n\"os\" : \""+this.os+"\"";
        return str;
    }
    public String toStringInner(){
        String str = "";
        str += super.toStringInner();
        str += "\n\"os\" : \""+this.os+"\",";
        return str;
    }
}
