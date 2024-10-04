package Diana_Friptuleac;

import Diana_Friptuleac.Classi.Genere;
import Diana_Friptuleac.Classi.GiocoTavolo;
import Diana_Friptuleac.Classi.Videogioco;
import exceptions.DuplicateException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("------------------------Lista 10 Videogiochi!-------------------");
        List<Videogioco> videogiochi = new ArrayList<>();
        videogiochi.add(new Videogioco(1255115, "Pokemon", LocalDate.of(2005, 5, 19), 29.99, "PC", 100, Genere.AZIONE));
        videogiochi.add(new Videogioco(5554116, "Need for Speed", LocalDate.of(2015, 11, 3), 39.99, "PS4", 50, Genere.CORSE));
        videogiochi.add(new Videogioco(8954117, "FIFA 21", LocalDate.of(2020, 10, 6), 59.99, "PC", 300, Genere.SPORTIVO));
        videogiochi.add(new Videogioco(1454118, "Assassin's Creed", LocalDate.of(2012, 10, 30), 49.99, "PS3", 80, Genere.AVENTURA));
        videogiochi.add(new Videogioco(1254789, "Minecraft", LocalDate.of(2011, 11, 18), 19.99, "PC", 500, Genere.SURVIVAL));
        videogiochi.add(new Videogioco(1544120, "Portal 2", LocalDate.of(2011, 4, 19), 9.99, "PC", 12, Genere.EDUCATIVI));
        videogiochi.add(new Videogioco(15654121, "Scribblenauts", LocalDate.of(2009, 9, 15), 14.99, "Nintendo DS", 20, Genere.SARATUTTO));
        videogiochi.add(new Videogioco(5454122, "Horizon Zero Dawn", LocalDate.of(2017, 2, 28), 49.99, "PS4", 60, Genere.AVVENTURA));
        videogiochi.add(new Videogioco(3354123, "Titanfall", LocalDate.of(2014, 3, 11), 39.99, "Xbox One", 40, Genere.ROBOT));
        videogiochi.add(new Videogioco(8594124, "ARK: Survival Evolved", LocalDate.of(2017, 8, 29), 29.99, "PC", 300, Genere.SURVIVAL));
        //Stampa
        for (Videogioco gioco : videogiochi) {
            System.out.println(gioco);
        }
        System.out.println();

        System.out.println("------------------------Lista 10 Giochhi da Tavolo!-------------------");
        List<GiocoTavolo> giochiTavolo = new ArrayList<>();
        giochiTavolo.add(new GiocoTavolo(10015, "Exploding Kittens", LocalDate.of(2015, 1, 1), 23.00, 5, 15));
        giochiTavolo.add(new GiocoTavolo(50024, "Anarchy Pancakes", LocalDate.of(2018, 4, 15), 20.00, 4, 30));
        giochiTavolo.add(new GiocoTavolo(10043, "Jumanji", LocalDate.of(1995, 10, 1), 45.00, 4, 120));
        giochiTavolo.add(new GiocoTavolo(68044, "Floor is Lava", LocalDate.of(2020, 7, 25), 19.99, 6, 25));
        giochiTavolo.add(new GiocoTavolo(33205, "Scarabeo", LocalDate.of(1990, 6, 10), 35.00, 4, 60));
        giochiTavolo.add(new GiocoTavolo(10806, "Jenga Giant", LocalDate.of(2016, 12, 20), 50.00, 2, 20));
        giochiTavolo.add(new GiocoTavolo(10507, "Michael", LocalDate.of(2010, 3, 3), 25.00, 3, 45));
        giochiTavolo.add(new GiocoTavolo(14008, "Dixit", LocalDate.of(2008, 9, 5), 30.00, 6, 40));
        giochiTavolo.add(new GiocoTavolo(55009, "Catan", LocalDate.of(1995, 5, 20), 37.99, 4, 90));
        giochiTavolo.add(new GiocoTavolo(25010, "Monopoly", LocalDate.of(1935, 11, 5), 25.00, 6, 180));

        // Stampa
        for (GiocoTavolo gioco : giochiTavolo) {
            System.out.println(gioco);
        }
        System.out.println();
        System.out.println("--------------------------Aggiungi un gioco-------------------");

        // La collezione di videogiochi
        Collezione newCollezione = new Collezione(videogiochi);

        // Agg. un nuovo videogioco
        Videogioco newVideoGioco = new Videogioco(4512245, "Assassin's Creed", LocalDate.of(2007, 5, 25), 31.99, "PS4", 120, Genere.AVVENTURA);
        newCollezione.aggGioco(newVideoGioco);

        // Agg. un videogioco duplicato
        Videogioco duplicateVideoGioco = new Videogioco(1255115, "Pokemon", LocalDate.of(2005, 5, 19), 29.99, "PC", 100, Genere.AZIONE);

        try {
            newCollezione.aggGioco(duplicateVideoGioco);
        } catch (DuplicateException e) {
            System.out.println(e.getMessage());
        }

        // lista aggiornata dei videogiochi
        System.out.println("\n------------------------Lista Aggiornata dei Giochi-------------------");
        for (Videogioco gioco : videogiochi) {
            System.out.println(gioco);
        }
    }
}