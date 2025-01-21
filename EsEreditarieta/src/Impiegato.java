import java.time.LocalDate;

public class Impiegato extends Persona {
    
    private String nrTesserino;
    private Integer Stipendio;
    private LocalDate dataAssunzione;
    
    //costruttore
    public Impiegato(String nome, String cognome, LocalDate dataNascita, String nrTesserino, Integer stipendio,
            LocalDate dataAssunzione) {
        super(nome, cognome, dataNascita);
        this.nrTesserino = nrTesserino;
        Stipendio = stipendio;
        this.dataAssunzione = dataAssunzione;
    }

    //metodi
    public void riceviAumento(int aumento) {
        if (aumento<=0) {
            System.out.println("Aumento non valido");
            return;
        }
        Stipendio += aumento;
    }
    
    //getters
    public String getNrTesserino() {
        return nrTesserino;
    }

    public Integer getStipendio() {
        return Stipendio;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    @Override
    public String toString() {
        return "Impiegato [nrTesserino=" + nrTesserino + ", Stipendio=" + Stipendio + ", dataAssunzione="
                + dataAssunzione + ", Nome=" + getNome() + ", Cognome=" + getCognome() + ", DataNascita="
                + getDataNascita() + "]";
    }    
}
