public class aufgabe1 {

    //Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als
    //Rückgabewert soll die Methode ein Array mit nicht ausreichender Note liefern.
    public static int [] nichtausreichendeNote(int [] noten){
        int anz=0;
        for(int i=0; i<noten.length; i++){
            if(noten[i]<40){
                anz++;
            }
        }

        int[] nichtausreichend= new int[anz];

        for(int i=0; i<noten.length; i++){
            if(noten[i]<40){
                nichtausreichend[i]=noten[i];
            }
        }
        return nichtausreichend;
    }


}
