// Classe Scaffale
public class Scaffale {
    private String id;
    private Libro[] libri;
    private int nLibri;
    private final int N = 10;

    // Costruttore
    public Scaffale(String id) {
        this.id = id;
        libri = new Libro[N];
        nLibri = 0;
    }

    public String getId() {
        return id;
    }

    // Metodo per aggiungere un libro
    public boolean aggiungi(Libro l) {
        if (nLibri < N) {
            libri[nLibri] = l;
            l.setCollocazione(this); // Imposta la collocazione del libro
            nLibri++;
            return true;
        }
        return false;
    }

    // Metodo elencaLibri che restituisce una stringa con le informazioni sui libri
    public String elencaLibri() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scaffale ID: ").append(id).append("\nLibri nello scaffale:\n");

        for (int i = 0; i < nLibri; i++) {
            sb.append(libri[i].toString()).append("\n");
        }

        return sb.toString();
    }

    // Metodo elencaLibri per autore
    public String elencaLibri(String autore) {
        StringBuilder sb = new StringBuilder();
        sb.append("Libri di ").append(autore).append(" nello scaffale ").append(id).append(":\n");

        for (int i = 0; i < nLibri; i++) {
            if (libri[i].getAutore().equalsIgnoreCase(autore)) {
                sb.append(libri[i].toString()).append("\n");
            }
        }

        return sb.toString();
    }

    // Metodo elencaLibri per prezzo massimo
    public String elencaLibri(float prezzo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Libri con prezzo fino a ").append(prezzo).append(" nello scaffale ").append(id).append(":\n");

        for (int i = 0; i < nLibri; i++) {
            if (libri[i].getPrezzo() <= prezzo) {
                sb.append(libri[i].toString()).append("\n");
            }
        }

        return sb.toString();
    }
}
