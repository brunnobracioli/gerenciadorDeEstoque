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
public class Produto {
    private String nome;
    private String fabricante;
    private int codigo;
    private float valorUnitario;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }
      
    public double Vender( int quantidade){
        if (this.quantidade <= 0 || this.quantidade < quantidade){
            return 1;
        }
        this.quantidade -= quantidade;
        return this.valorUnitario * quantidade;
    }
    public void comprar(int quantidade) {
        this.quantidade += quantidade;
    }
    public Produto(String nome, String fabricante, int codigo, float valorUnitario, int quantidade){
        this.nome = nome;
        this.fabricante = fabricante;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
    public String imprimir(){
        return "Nome: " + this.nome + " \n" +
        "Fabricante: " + this.fabricante + " \n" +
        "Código: " + this.codigo + " \n" +
        "Valor unitário: " + this.valorUnitario + " \n" +
        "Quantidade: " + this.quantidade;
    }
}
