/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Samuel Lira M
 */
public class Vendedor extends Empregado {
    public float valorVendas;
    public float atbComissao;
    
    public float calcularSalario(float salarioBase,float atbComissao){
        return salarioBase+atbComissao;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getAtbComissao() {
        return atbComissao;
    }

    public void setAtbComissao(float atbComissao) {
        this.atbComissao = atbComissao;
    }
    
}