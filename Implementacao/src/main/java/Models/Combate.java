package Models;

import Models.Enumerations.Fase;
import Models.Enumerations.TipoVitoria;

public class Combate
{
    private final Prova prova;
    private final Fase fase;
    private final Atleta atleta1;
    private final Atleta atleta2;
    private int pontosAtleta1;
    private int pontosAtleta2;
    private Atleta vencedor;
    private TipoVitoria tipoVitoria;
    private boolean finalizado;

    //Tapete Incompleto
    public Combate(Prova prova, Fase fase, Atleta atleta1) {
        this.prova = prova;
        this.fase = fase;
        this.atleta1 = atleta1;
        this.atleta2 = null;
        vencedor = atleta1;
        pontosAtleta1 = 0;
        pontosAtleta2 = 0;
        tipoVitoria = TipoVitoria.TAPETEIMCOMPLETO;
        finalizado = true;
    }

    //Tapete Completo
    public Combate(Prova prova, Fase fase, Atleta atleta1, Atleta atleta2) {
        this.prova = prova;
        this.fase = fase;
        this.atleta1 = atleta1;
        this.atleta2 = atleta2;
        finalizado = false;
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
        if (!isFinalizado() && vencedor != null)
            this.vencedor = vencedor;
    }

    public TipoVitoria getTipoVitoria() {
        return tipoVitoria;
    }

    public void setTipoVitoria(TipoVitoria tipoVitoria) {
        if (!isFinalizado())
            this.tipoVitoria = tipoVitoria;
    }

    public int getPontosAtleta1() {
        return pontosAtleta1;
    }

    public void setPontosAtleta1(int pontosAtleta1) {
        if (!isFinalizado())
            this.pontosAtleta1 = pontosAtleta1;
    }

    public int getPontosAtleta2() {
        return pontosAtleta2;
    }

    public void setPontosAtleta2(int pontosAtleta2) {
        if (!isFinalizado())
            this.pontosAtleta2 = pontosAtleta2;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        if (!isFinalizado() && finalizado)
            this.finalizado = true;
    }
}
