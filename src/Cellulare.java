class Cellulare extends Telefono{
    private String oS;

    public Cellulare(String marca, String modello, String numero, String operatore, String os){
        super(marca, modello, numero, operatore);
        this.oS = os;
    }

    public Cellulare(Cellulare originale){
        super(originale.marca, originale.modello, originale.numero, originale.operatore);
        this.oS = originale.oS;
    }

    public String getOS() {
        return this.oS;
    }
    public String setOS(String newOs){
        this.oS = newOs;
    }
}
