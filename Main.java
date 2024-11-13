public class Main {
    public static void main(String[] args) {
        // Istanziare uno scaffale
        Scaffale scaffale = new Scaffale("S1");

        // Creare tre oggetti di classe Libro
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 29.99f, 1178, "Bompiani");
        Libro libro2 = new Libro("1984", "George Orwell", 12.99f, 328, "Mondadori");
        Libro libro3 = new Libro("Il Codice Da Vinci", "Dan Brown", 15.99f, 689, "Mondadori");

        // Aggiungere i libri allo scaffale
        scaffale.aggiungi(libro1);
        scaffale.aggiungi(libro2);
        scaffale.aggiungi(libro3);

        // Testare il metodo elencaLibri per mostrare tutti i libri
        System.out.println("Elenco completo dei libri nello scaffale:");
        System.out.println(scaffale.elencaLibri());

        // Testare il metodo elencaLibri filtrando per autore
        System.out.println("Libri di George Orwell:");
        System.out.println(scaffale.elencaLibri("George Orwell"));

        // Testare il metodo elencaLibri filtrando per prezzo
        System.out.println("Libri con prezzo fino a 20.00:");
        System.out.println(scaffale.elencaLibri(20.00f));
    }
}
