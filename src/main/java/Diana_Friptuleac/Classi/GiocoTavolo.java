package Diana_Friptuleac.Classi;

import java.time.LocalDate;

public class GiocoTavolo extends AllGiochi {
    private int numeroGiocatori;
    private int durataPartitaMinuti;

    public GiocoTavolo(int Id, String titolo, LocalDate annoPublicazione, double prezzo, int numeroGiocatori, int durataPartitaMinuti) {
        super(Id, titolo, annoPublicazione, prezzo);

        if (numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new IllegalArgumentException("Il nr. dei giocatori deve essere di min. 2 persone e max. 10 "); //valore fuori dal limite
        }
        this.numeroGiocatori = numeroGiocatori;
        this.durataPartitaMinuti = durataPartitaMinuti;
    }


    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataPartitaMinuti() {
        return durataPartitaMinuti;
    }

    public void setDurataPartitaMinuti(int durataPartitaMinuti) {
        this.durataPartitaMinuti = durataPartitaMinuti;
    }

}

