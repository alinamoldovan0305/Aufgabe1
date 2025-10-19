import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] noten={23, 48, 59, 78, 32};
        //1-ter Subpunkt
        int[] ergebnis=aufgabe1.nichtausreichendeNoten(noten);
        System.out.println("Nicht ausreichende Noten: "+ Arrays.toString(ergebnis));

        //2-ter Subpunkt
        System.out.println("Durchschnittert: "+ aufgabe1.durchschnittwert(noten));

        //3-ter Subpunkt
        System.out.println("Abgerundete Noten: "+Arrays.toString(aufgabe1.abgerundetenNoten(noten)));

    }
}
