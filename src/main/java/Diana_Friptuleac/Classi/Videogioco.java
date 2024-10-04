package Diana_Friptuleac.Classi;

import java.time.LocalDate;

public class Videogioco extends AllGiochi {

    private String piattaforma;
    private int durataOre;
    private Genere genere;

    public Videogioco(int Id, String titolo, LocalDate annoPublicazione, double prezzo, String piattaforma, int durataOre, Genere genere) {
        super(Id, titolo, annoPublicazione, prezzo);
        this.piattaforma = piattaforma;
        this.durataOre = durataOre;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(int durataOre) {
        this.durataOre = durataOre;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

}

