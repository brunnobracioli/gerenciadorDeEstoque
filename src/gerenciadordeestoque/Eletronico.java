/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeestoque;

/**
 *
 * @author Brunno
 */
public class Eletronico extends Produto {
    private String voltagem;
    private int potencia;
    private char classeEficiencia;

    public Eletronico(String nome, String fabricante, int codigo, float valorUnitario,
                      int quantidade, String voltagem, int potencia,char classeEficiencia)
    {
        super(nome, fabricante, codigo, valorUnitario, quantidade);
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.classeEficiencia = classeEficiencia;
    }
   
    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public char getClasseEficiencia() {
        return classeEficiencia;
    }

    public void setClasseEficiencia(char classeEficiencia) {
        this.classeEficiencia = classeEficiencia;
    }
    
    public String imprimir(){
        return super.imprimir() + " \n" +
        "Votltagem: " + this.voltagem  + " \n" +
        "Potencia: " + this.potencia + " \n" +
        "Classe Eficiencia: " + this.classeEficiencia + " \n";
    }
}
