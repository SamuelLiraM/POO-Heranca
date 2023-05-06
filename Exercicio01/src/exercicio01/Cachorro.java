/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author Samuel Lira M
 */
public class Cachorro extends Animal {
    private String raca;

    public String getRaça() {
        return raca;
    }

    public void setRaça(String raça) {
        this.raca = raça;
    }

    @Override
    public String toString() {
        return "Cachorro{"+ "Nome:"+nome+",Peso:"+peso+ ",raca=" + raca + '}';
    }
     
}
