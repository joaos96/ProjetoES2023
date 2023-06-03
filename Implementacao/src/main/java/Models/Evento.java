package Models;

import Models.Enumerations.CategoriaPesoFeminino;
import Models.Enumerations.CategoriaPesoMasculino;
import Models.Enumerations.EscalaoEtario;

import java.util.*;

public class Evento {
    private Date dataInicio;
    private Date dataFim;
    private String nome;
    private String local;
    private String pais;
    private final LinkedList<Inscricao> inscritos;
    private final HashMap<EscalaoEtario, HashMap<CategoriaPesoMasculino, ProvaMasculino>> provasMasculinas;
    private final HashMap<EscalaoEtario, HashMap<CategoriaPesoFeminino, ProvaFeminino>> provasFemininas;
    private boolean finalizado;

    public Evento(Date dataInicio, Date dataFim, String nome, String local, String pais) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nome = nome;
        this.local = local;
        this.pais = pais;
        inscritos = new LinkedList<>();
        provasMasculinas = new HashMap<>();
        provasFemininas = new HashMap<>();
        finalizado = false;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        if (!isFinalizado())
            this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        if (!isFinalizado())
            this.dataFim = dataFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!isFinalizado())
            this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if (!isFinalizado())
            this.local = local;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (!finalizado)
            this.pais = pais;
    }

    public LinkedList<Inscricao> getInscritos() {
        return new LinkedList<>(inscritos);
    }

    public HashMap<EscalaoEtario, HashMap<CategoriaPesoMasculino, ProvaMasculino>> getProvasMasculinas() {
        return new HashMap<>(provasMasculinas);
    }

    public HashMap<EscalaoEtario, HashMap<CategoriaPesoFeminino, ProvaFeminino>> getProvasFemininas() {
        return new HashMap<>(provasFemininas);
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        if (!isFinalizado() && finalizado)
            this.finalizado = true;
    }
}
