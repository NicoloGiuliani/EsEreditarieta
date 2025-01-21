import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        // creazione oggetto impiegato

        Impiegato impiegato = new Impiegato("Gianmarco", "Baldo", LocalDate.now(), "321", 2000, LocalDate.now() );

        System.out.println(impiegato);
        impiegato.riceviAumento(500);
        impiegato.saluta();

        Professionista professionista = new Professionista("Maria", "Santa", LocalDate.now(), "1243242311", LocalDate.now(), 2000);

        System.out.println(professionista);
        professionista.fattura(3000);
        professionista.saluta();

    }
}
