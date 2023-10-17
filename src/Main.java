
public class Main {
    public static void main(String[] args) {
        Telefono t1 = new Telefono("Vodafone", "Fisso 2.0", "+0461659809", "Vodafone");
        System.out.println(t1.toString());

        Cellulare c1 = new Cellulare("Apple", "iPhone 13", "+393457657236","Vodafone","iOS");
        System.out.println(c1.toString());
        Cellulare c2 = new Cellulare(c1);
        c2.setOperatore("Fastweb");
        c2.setNumero("Nessuna SIM inserita");
        System.out.println(c2.toString());
    }
}