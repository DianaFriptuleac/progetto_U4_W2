package Diana_Friptuleac.Classi;

import java.time.LocalDate;

public abstract class AllGiochi {
    private int Id;
    private String titolo;
    private LocalDate annoPublicazione;
    private double prezzo;

    public AllGiochi(int Id, String titolo, LocalDate annoPublicazione, double prezzo) {
        this.Id = Id;
        this.titolo = titolo;
        this.annoPublicazione = annoPublicazione;
        this.prezzo = prezzo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(LocalDate annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Il gioco: {" +
                "id='" + Id + '\'' +
                ", Titilo:" + titolo + '\'' +
                ", Anno di publicazione='" + annoPublicazione.getYear() + '\'' +
                ", prezzo ='" + prezzo + '\'' +
                " euro" + '\'' +
                '}';

    }
}
