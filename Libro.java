// Classe Libro
public class Libro {
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;
    private Scaffale scaffale; // Nuovo attributo

    // Costruttore
    public Libro(String titolo, String autore, float prezzo, int npag, String editore) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.npag = npag;
        this.editore = editore;
        this.scaffale = null; // Di default, il libro non ha uno scaffale
    }

    // Metodo setCollocazione
    public void setCollocazione(Scaffale scaffale) {
        this.scaffale = scaffale;
    }

    // Metodo toString()
    public String toString() {
        return "Libro{" +
                "Titolo='" + titolo + '\'' +
                ", Autore='" + autore + '\'' +
                ", Prezzo=" + prezzo +
                ", Numero di pagine=" + npag +
                ", Editore='" + editore + '\'' +
                ", Scaffale=" + (scaffale != null ? scaffale.getId() : "Nessuno") +
                '}';
    }
    
    // Getters
    public String getAutore() {
        return autore;
    }

    public float getPrezzo() {
        return prezzo;
    }
}
