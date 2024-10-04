package Diana_Friptuleac;

import Diana_Friptuleac.Classi.AllGiochi;
import Diana_Friptuleac.Classi.Videogioco;
import exceptions.DuplicateException;

import java.util.List;


public class Collezione {

    private List<Videogioco> giochi;

    public Collezione(List<Videogioco> giochi) {
        this.giochi = giochi;
    }

    //Aggiunta di un elemento
    public void aggGioco(AllGiochi giocoDaAgg) {
        if (giochi.stream().anyMatch(gioco -> gioco.getId() == giocoDaAgg.getId())) {
            throw new DuplicateException("Non puoi inserire un gioco con lo stesso Id!");
        } else {
            giochi.add((Videogioco) giocoDaAgg);
            System.out.println("Il gioco" + giocoDaAgg.getTitolo() + ", ID: " + giocoDaAgg.getId() + " e stato aggiunto!");
        }
    }

}
