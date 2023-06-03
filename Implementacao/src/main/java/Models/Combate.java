package Models;

import Models.Enumerations.Fase;
import Models.Enumerations.TipoVitoria;

public class Combate
{
    private Prova prova;
    private Fase fase;
    private Atleta atleta1;
    private Atleta atleta2;
    private Atleta vencedor;
    private TipoVitoria tipoVitoria;

    public Combate(Prova prova, Fase fase, Atleta atleta1) {
        this.prova = prova;
        this.fase = fase;
        this.atleta1 = atleta1;
    }

    public Combate(Prova prova, Fase fase, Atleta atleta1, Atleta atleta2) {
        this.prova = prova;
        this.fase = fase;
        this.atleta1 = atleta1;
        this.atleta2 = atleta2;
    }
}
