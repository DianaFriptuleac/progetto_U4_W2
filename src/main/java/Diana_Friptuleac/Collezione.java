package Diana_Friptuleac;

import Diana_Friptuleac.Classi.AllGiochi;
import exceptions.DuplicateException;

import java.util.List;
import java.util.Optional;

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
}
