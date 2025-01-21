import java.time.LocalDate;

public class Professionista extends Persona {

    private String partitaIva;
    private LocalDate dataInizioAttivita;
    private Integer totaleFatturato;

    public Professionista(String nome, String cognome, LocalDate dataNascita, String partitaIva,
            LocalDate dataInizioAttivita, Integer totaleFatturato) {
        super(nome, cognome, dataNascita);
        this.partitaIva = partitaIva;
        this.dataInizioAttivita = dataInizioAttivita;
        this.totaleFatturato = totaleFatturato;
    }

    public void fattura(int importo) {
        if (importo >0) {
            totaleFatturato += importo;
            System.out.println("Il tuo fatturato totale è: "+ totaleFatturato);
        } else {
            System.out.println("L'importo deve essere positivo");
        }
    }

    @Override
    public String toString() {
        return "Professionista [partitaIva=" + partitaIva + ", DataInizioAttivita=" + dataInizioAttivita
                + ", TotaleFatturato=" + totaleFatturato + ", Nome()=" + getNome() + ", Cognome()=" + getCognome()
                + ", DataNascita()=" + getDataNascita() + "]";
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public LocalDate getDataInizioAttivita() {
        return dataInizioAttivita;
    }

    public void setDataInizioAttivita(LocalDate dataInizioAttivita) {
        this.dataInizioAttivita = dataInizioAttivita;
    }

    public Integer getTotaleFatturato() {
        return totaleFatturato;
    }

    public void setTotaleFatturato(Integer totaleFatturato) {
        if (totaleFatturato>=0) {
            this.totaleFatturato = totaleFatturato;
        } else {
            System.out.println("Fatturato non valido");
        }
        
    }


}
