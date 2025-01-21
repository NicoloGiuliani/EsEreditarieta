import java.time.Duration;
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

    //setters
    public void setNrTesserino(String nrTesserino) {
        if (dataAssunzione!=null) {
            this.nrTesserino = nrTesserino;
        }
    } 

    public void setStipendio(Integer stipendio) {
        if (stipendio<=0) {
            System.out.println("Stipendio non valido");
            return;
        }
        Stipendio = stipendio;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        if (dataAssunzione.isAfter(LocalDate.now())) {
            if (Duration.between(getDataNascita(), dataAssunzione).toDays()<18*365) {
                System.out.println("l'impiegato è minorenne!!!!");
            }
            System.out.println("Data assunzione non valida");
            return;
        }
        this.dataAssunzione = dataAssunzione;
    }

    @Override
    public String toString() {
        return "Impiegato [nrTesserino=" + nrTesserino + ", Stipendio=" + Stipendio + ", dataAssunzione="
                + dataAssunzione + ", Nome=" + getNome() + ", Cognome=" + getCognome() + ", DataNascita="
                + getDataNascita() + "]";
    }
}
