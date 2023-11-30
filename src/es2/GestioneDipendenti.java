package es2;

import es1.Dipartimento;
import es1.Dipendente;
import es1.Livello;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("D001", 1500, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("D002", 1600, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente("D003", 1200, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
        Dipendente d4 = new Dipendente("D004", 1500, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);

        d1.promuovi();
        d2.promuovi();

        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
        d3.stampaDatiDipendente();
        d4.stampaDatiDipendente();

        double[] sommaStipendi = {
                Dipendente.calcolaPaga(d1, 5),
                Dipendente.calcolaPaga(d2, 3),
                Dipendente.calcolaPaga(d3, 10),
                Dipendente.calcolaPaga(d4, 1)};

        for (int i = 0; i < sommaStipendi.length; i++) {
            System.out.println("Stipendio dipendente " + (i + 1) + " " + sommaStipendi[i]);
        }
    }
}
