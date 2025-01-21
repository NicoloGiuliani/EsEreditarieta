import java.time.LocalDate;

public class Persona {
    
    private String nome, cognome;
    private LocalDate dataNascita;
    
    //costruttore
    public Persona(String nome, String cognome, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    //metodi
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " " + cognome + " e sono nato il " + dataNascita);
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }
}
