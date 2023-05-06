/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Samuel Lira M
 */
public class Administrador extends Empregado {
    public float ajudaDeCusto;
    
    public float calcularSalario(float salarioBase, float ajudaDeCusto){
        return salarioBase + ajudaDeCusto;
    }

    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
}
