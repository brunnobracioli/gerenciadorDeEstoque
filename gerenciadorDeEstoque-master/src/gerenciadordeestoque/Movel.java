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
public class Movel extends Produto {
    private String tipoMaterial;
    private String cor;

    public Movel(String nome, String fabricante, int codigo, float valorUnitario,
                 int quantidade, String tipoMaterial, String cor)
    {
        super(nome, fabricante, codigo, valorUnitario, quantidade);
        this.tipoMaterial = tipoMaterial;
        this.cor = cor;
    }
    
    
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String imprimir(){
        return super.imprimir() + " \n" +
        "Tipo Material: " + this.tipoMaterial + " \n" +
        "Cor: " + this.cor + " \n";
    }
}
