package Models;

import Models.Enumerations.Cinturao;

import java.util.Date;
import java.util.LinkedList;

public class Atleta {
    private String primeiroNome;
    private String ultimoNome;
    private Date dataNascimento;
    private String pais;
    private Cinturao cinturao;
    private float peso;
    private String telefone;
    private LinkedList<Inscricao> inscricoes;

    public Atleta(String primeiroNome, String ultimoNome, Date dataNascimento,
                  String pais, Cinturao cinturao, float peso, String telefone, LinkedList<Inscricao> inscricoes) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataNascimento = dataNascimento;
        this.pais = pais;
        this.cinturao = cinturao;
        this.peso = peso;
        this.telefone = telefone;
        this.inscricoes = inscricoes;
    }

    public Atleta(String primeiroNome, String ultimoNome, Date dataNascimento,
                  String pais, Cinturao cinturao, float peso, String telefone)
    {
        this(primeiroNome, ultimoNome, dataNascimento, pais, cinturao, peso, telefone, new LinkedList<Inscricao>());
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Cinturao getCinturao() {
        return cinturao;
    }

    public void setCinturao(Cinturao cinturao) {
        this.cinturao = cinturao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LinkedList<Inscricao> getInscricoes() {
        return inscricoes;
    }
}
