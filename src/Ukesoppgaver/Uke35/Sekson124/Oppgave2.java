package Ukesoppgaver.Uke35.Sekson124;

import Datastrukturer.Tabell;

public class Oppgave2 {
    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = Tabell.maks(a); // m er posisjonen til tabellens største verdi

        Tabell.bytt(a, 0, m);

        int k = Tabell.maks(a, 1,a.length);

        if (k == m)
        {
            k=0;
            Tabell.bytt(a, 0, m);                  // leter i a[1:n>
        }
        return new int[]{m,k};


    } // nestMaks
}
