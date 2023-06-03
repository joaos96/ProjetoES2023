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

    //Tapete Incompleto
    public Combate(Prova prova, Fase fase, Atleta atleta1) {
        this.prova = prova;
        this.fase = fase;
        this.atleta1 = atleta1;
    }

    //Tapete Completo
    public Combate(Prova prova, Fase fase, Atleta atleta1, Atleta atleta2) {
        this.prova = prova;
        this.fase = fase;
        this.atleta1 = atleta1;
        this.atleta2 = atleta2;
    }

    public Prova getProva() {
        return prova;
    }

    public Fase getFase() {
        return fase;
    }

    public Atleta getAtleta1() {
        return atleta1;
    }

    public Atleta getAtleta2() {
        return atleta2;
    }

    public Atleta getVencedor() {
        return vencedor;
    }

    public void setVencedor(Atleta vencedor) {
        this.vencedor = vencedor;
    }

    public TipoVitoria getTipoVitoria() {
        return tipoVitoria;
    }

    public void setTipoVitoria(TipoVitoria tipoVitoria) {
        this.tipoVitoria = tipoVitoria;
    }
}
