/*Scrivere un programma che contenga una classe che definisce un Auto che abbia
come proprietà cilindrata, targa, marca e modello. Per questa classe saranno
necessari i metodi accessori (getters e setters) ed un costruttore. Nel main
dichiarare un oggetto di tipo Auto. In questo caso la nota importante è rendere
le proprietà della classe auto accessibili solo attraverso i metodi.*/

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto (1000, "KR567LO", "Fiat", 819303028);
        Auto auto2 = new Auto (1500, "LV208DT", "Ford", 819362058);

        System.out.println("le info dell'auto sono: " + auto1);
        System.out.println("le info dell'auto sono: " + auto2);
    }
}
