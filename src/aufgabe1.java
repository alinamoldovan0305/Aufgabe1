public class aufgabe1 {

    //Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als
    //Rückgabewert soll die Methode ein Array mit nicht ausreichender Note liefern.
    public static int [] nichtausreichendeNoten(int [] noten){
        int anz=0;
        for(int i=0; i<noten.length; i++){
            if(noten[i]<40){
                anz++;
            }
        }

        int[] nichtausreichendeNoten= new int[anz];
        int index = 0;

        for(int i=0; i<noten.length; i++){
            if(noten[i]<40){
                nichtausreichendeNoten[index]=noten[i];
                index++;
            }
        }
        return nichtausreichendeNoten;
    }

    //Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als
    //Rückgabewert soll die Methode den Durchschnittswert liefern.
    public static double durchschnittwert(int [] noten){
        int anz=0;
        int sum=0;
        for(int i=0; i<noten.length; i++){
            anz++;
            sum+=noten[i];
        }
        return sum/anz;

    }
    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als
    //Rückgabewert soll die Methode ein Array mit die abgerundeten Noten liefern.

    public static int[] abgerundetenNoten(int [] noten){

        int [] abgerundetenNoten= new int[noten.length];
        for(int i=0; i<noten.length; i++){
            int note = noten[i];
            if(note<38){
                abgerundetenNoten[i]=note;
            }
            else{
                int nachsterVielfachen = ((note / 5) + 1) * 5;
                if(nachsterVielfachen-note <3){
                    abgerundetenNoten[i]=nachsterVielfachen;
                }
                else{
                    abgerundetenNoten[i] = note;
                }
            }

        }
        return abgerundetenNoten;
    }

}
