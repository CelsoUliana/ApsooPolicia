/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author PCDOMILHAO
 */
import java.util.Collection;

public class Ocorrencia {

    private int codOcorrencia;
    
    private String descricao;

    private String descricaoCrime;

    public Cidadao cidadaoDenuncia;

    public Collection<Local> locais;

    public Collection<Usuario> equipe;

    public Delegacia delegacia;

    public Usuario delegadoResponsavel;

    public Collection<Evidencia> evidencias;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCrime() {
        return descricaoCrime;
    }

    public void setDescricaoCrime(String descricao_crime) {
        this.descricaoCrime = descricao_crime;
    }

    public Cidadao getCidadaoDenuncia() {
        return cidadaoDenuncia;
    }

    public void setCidadaoDenuncia(Cidadao cidadaoDenuncia) {
        this.cidadaoDenuncia = cidadaoDenuncia;
    }

    public Collection<Local> getLocais() {
        return locais;
    }

    public void setLocais(Collection<Local> locais) {
        this.locais = locais;
    }

    public Collection<Usuario> getEquipe() {
        return equipe;
    }

    public void setEquipe(Collection<Usuario> equipe) {
        this.equipe = equipe;
    }

    public Delegacia getDelegacia() {
        return delegacia;
    }

    public void setDelegacia(Delegacia delegacia) {
        this.delegacia = delegacia;
    }

    public Usuario getDelegadoResponsavel() {
        return delegadoResponsavel;
    }

    public void setDelegadoResponsavel(Usuario delegadoResponsavel) {
        this.delegadoResponsavel = delegadoResponsavel;
    }

    public Collection<Evidencia> getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(Collection<Evidencia> evidencias) {
        this.evidencias = evidencias;
    }

    public int getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(int cod_ocorrencia) {
        this.codOcorrencia = cod_ocorrencia;
    }

}
