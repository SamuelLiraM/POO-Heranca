/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author Samuel Lira M
 */
public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "Cliente{"+ "Nome:"+nome+",Idade:"+idade+",Sexo"+sexo+ ",valorDivida=" + valorDivida + ", anoNascim=" + anoNascim + '}';
    }
    
    
}
