package Ukesoppgaver.Uke35.Seksjon122;

import Datastrukturer.Tabell;

public class Oppgave2 {
        public static void main(String ... args)      // hovedprogram
        {
            int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
            for (int k : a) System.out.print(k + " ");  // skriver ut a

            int m = Tabell.maks(a);   // finner posisjonen til største verdi

            System.out.println("\nStørste verdi ligger på plass " + m);

        } // main
    // class Program

}
