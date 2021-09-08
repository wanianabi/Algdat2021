package Ukesoppgaver.Uke34.Seksjon113;

public class Oppgave5 {
    public static void main(String[] args) {
        int a [] = {8, 1, 3,7};
        //for å teste om programmet fungerer
        int test [] = minmaks(a);

        for (int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
    }

    public static int[] minmaks(int[] a){
        int min = 0, minverdi = a[0];
        int maks = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 1; i<a.length; i++){
            verdi = a[i];
            if (verdi > maksverdi) { maksverdi = verdi; maks = i;}
            else if (verdi < minverdi) {minverdi = verdi; min = i;}
        }
        return new int[]{min,maks};
    }
}
