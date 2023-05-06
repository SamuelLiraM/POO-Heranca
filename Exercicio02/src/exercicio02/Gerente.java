/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author Samuel Lira M
 */
public class Gerente extends Empregado{
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente{" +"Nome:"+nome+",Idade:"+idade+",Matricula:"+matricula+ ",nomeGerencia=" + nomeGerencia + '}';
    }
    
    
}
