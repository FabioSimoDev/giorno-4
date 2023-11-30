package es1;

public class Dipendente {
    private static double stipendioBase = 1000;
    private String numeroMatricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.numeroMatricola = matricola;
        this.dipartimento = dipartimento;
        this.importoOrarioStraordinario = 30;
    }

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello,
                      Dipartimento dipartimento) {
        this.numeroMatricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("Informazioni Dipendente 1: Matricola: " + getMatricola() + ", Stipendio: " + getStipendio()
                + ", Livello: " + getLivello() + ", Dipartimento: " + getDipartimento());
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }

    public String getMatricola() {
        return numeroMatricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public static double getStipendioBase() {
        return stipendioBase;
    }

    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO:
                this.livello = Livello.IMPIEGATO;
                System.out.println("Il dipendente è stato promosso a IMPIEGATO.");
                break;
            case IMPIEGATO:
                this.livello = Livello.QUADRO;
                stipendioBase *= 1.2;
                System.out.println("Il dipendente è stato promosso a QUADRO.");
                break;
            case QUADRO:
                this.livello = Livello.DIRIGENTE;
                stipendioBase *= 1.5;
                System.out.println("Il dipendente è stato promosso a DIRIGENTE.");
                break;
            case DIRIGENTE:
                stipendioBase *= 2;
                System.out.println("Il dipendente è già un DIRIGENTE e non può essere promosso ulteriormente.");
                break;
            default:
                System.out.println("Errore: Livello sconosciuto.");
                break;
        }

        return this.livello;
    }

    public static double calcolaPaga(Dipendente dipendente){
        return dipendente.stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente, int oreDiStraordinario){
        return (dipendente.importoOrarioStraordinario * oreDiStraordinario) + dipendente.stipendio;
    }
}


