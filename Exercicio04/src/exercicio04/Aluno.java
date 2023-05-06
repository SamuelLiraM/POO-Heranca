/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio04;

/**
 *
 * @author Samuel Lira M
 */
public class Aluno extends Turma {
    public String idade;

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     *
     * @return
     */
    @Override
    public String getSemestre() {
        return semestre;
    }

    /**
     *
     * @param semestre
     */
    @Override
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     *
     * @return
     */
    @Override
    public String getAno() {
        return ano;
    }

    /**
     *
     * @param ano
     */
    @Override
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     *
     * @return
     */
    @Override
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    @Override
    public String getSigla() {
        return sigla;
    }

    /**
     *
     * @param sigla
     */
    @Override
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Aluno{" +"Nome"+nome+ ",idade=" + idade +",Ano:"+ano+",Semestre:"+semestre+ '}';
    }
    
    
}
