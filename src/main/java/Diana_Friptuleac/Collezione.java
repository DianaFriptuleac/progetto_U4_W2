package Diana_Friptuleac;

import Diana_Friptuleac.Classi.AllGiochi;
import Diana_Friptuleac.Classi.GiocoTavolo;
import exceptions.DuplicateException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Collezione {

    private List<AllGiochi> giochi;


    public Collezione(List<AllGiochi> giochi) {
        this.giochi = giochi;
    }

    // Aggiungo un elemento
    public void aggGioco(AllGiochi giocoDaAgg) {
        if (giochi.stream().anyMatch(gioco -> gioco.getId() == giocoDaAgg.getId())) {
            throw new DuplicateException("Non puoi inserire un gioco con lo stesso Id!");
        } else {
            giochi.add(giocoDaAgg); // Aggiunge l'elemento alla collezione
            System.out.println("Il gioco " + giocoDaAgg.getTitolo() + ", ID: " + giocoDaAgg.getId() + " è stato aggiunto!");
        }
    }

    // Cerco per ID
    public void trovaGioco(int id) {
        Optional<AllGiochi> giocoTrovato = giochi.stream()
                .filter(gioco -> gioco.getId() == id)
                .findFirst();
        if (giocoTrovato.isPresent()) {
            System.out.println("Il gioco che stavi cercando è: " + giocoTrovato.get().getTitolo() + " (ID: " + giocoTrovato.get().getId() + ")");
        } else {
            System.out.println("Il gioco con l'id " + id + " non è stato trovato.");
        }
    }

    //Filtro per prezzo
    public List<AllGiochi> filtraPrezzo(double maxP) {
        List<AllGiochi> giochiFiltrati = giochi.stream().filter(gioco -> gioco.getPrezzo() < maxP).collect(Collectors.toList());
        if (giochiFiltrati.isEmpty()) {
            System.out.println("Non ci sono giochi con il prezzo inferiore a " + maxP);
        } else {
            System.out.println("La lista dei giochi con il prezzo inferiore a " + maxP + ":");
            for (AllGiochi gioco : giochiFiltrati) {
                System.out.println("Gioco: " + gioco.getTitolo() + " - " + gioco.getPrezzo() + " euro.");
            }

        }
        return giochiFiltrati;
    }

    //Filtra per numero di giocatori
    public void fitraGiocatori(int nrGiocatori) {
        List<GiocoTavolo> giochiPerGiocatore = giochi.stream().filter(gioco -> gioco instanceof GiocoTavolo)
                .map(gioco -> (GiocoTavolo) gioco)
                .filter(gioco -> gioco.getNumeroGiocatori() == nrGiocatori).collect(Collectors.toList());
        if (giochiPerGiocatore.isEmpty()) {
            System.out.println("Non ci sono giochi con questo numero di gioccatori");
        } else {
            System.out.println("La lista dei giochi con un numero di giocatori inferiore o uguale a " + nrGiocatori + ":");
            for (GiocoTavolo gioco : giochiPerGiocatore) {
                System.out.println("Gioco: " + gioco.getTitolo() + " - Numero di giocatori: " + gioco.getNumeroGiocatori());
            }
        }
    }

    //Rimozione dato un ID
    public void removeG(int id) {
        Optional<AllGiochi> rGioco = giochi.stream().filter(gioco -> gioco.getId() == id).findFirst();
        if (rGioco.isPresent()) {
            giochi.remove(rGioco.get());
            System.out.println("Il gioco " + id + " e stato rimosso con successo!");
        } else {
            System.out.println("Non ci sono giochi con questo id " + id);
        }
    }
}
