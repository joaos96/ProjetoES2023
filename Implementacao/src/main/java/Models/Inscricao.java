package Models;

import java.util.Date;

public class Inscricao {
    private Evento evento;
    private Atleta atleta;
    private Date dataInscricao;

    //nullable
    private ResultadoProva resultadoProva;

    public Inscricao(Evento evento, Atleta atleta, Date dataInscricao) {
        this.evento = evento;
        this.atleta = atleta;
        this.dataInscricao = dataInscricao;
    }

    public Evento getEvento() {
        return evento;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public ResultadoProva getResultadoProva() {
        return resultadoProva;
    }

    public void setResultadoProva(ResultadoProva resultadoProva) {
        if (this.resultadoProva != null)
            this.resultadoProva = resultadoProva;
    }
}
