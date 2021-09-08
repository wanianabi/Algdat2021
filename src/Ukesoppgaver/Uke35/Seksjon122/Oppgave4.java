package Ukesoppgaver.Uke35.Seksjon122;

import Datastrukturer.Tabell;

public class Oppgave4 {
    public static void skriv(int[] a, int fra, int til){
        Tabell.fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
    }

    public static void skriv(int[] a)
    {
        skriv(a, 0, a.length);
    }
}
