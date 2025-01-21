## Esercizio sull'ereditarietà
Scrivere una classe Persona contenente i seguenti attributi:
nome: String
cognome: String
dataNascita: LocalDate
e i seguenti metodi:
costruttore
void saluta(): mostra il messaggio "Ciao, mi chiamo e sono nato il "
getters, setters opportuni (con verifica validità parametri)

Scrivere una sottoclasse Impiegato che eredita da Persona , e che contiene i seguenti attributi:
nrTesserino: String
dataAssunzione: LocalDate
stipendio: Integer
e i seguenti metodi:
costruttore
void riceviAumento(int aumento): aumenta lo stipendio del valore indicato nel parametro
String toString(): mostra tutti i dati del dipendente
getters, setters opportuni (con verifica validità parametri)

Scrivere una sottoclasse Professionista che eredita da Persona , e che contiene i seguenti attributi:
partitaIva: String
dataInizioAttività: LocalDate
totaleFatturato: Integer
e i seguenti metodi:
costruttore
void fattura(int importo): aumenta il totale fatturato del valore indicato nel parametro
String toString(): mostra tutti i dati del professionista
getters, setters opportuni (con verifica validità parametri)
Scrivere una classe Main in cui viene dichiarato un oggetto Impiegato e un oggetto Professionista, ne vengono visualizzati i dati e ne vengono chiamati i metodi