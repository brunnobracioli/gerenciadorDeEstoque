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

import java.util.Calendar;

public class Perecivel extends Produto {
    private String validade;
    private boolean refrigerado;
    private boolean vencido;
    
    public Perecivel(String nome, String fabricante, int codigo, float valorUnitario,
                     int quantidade, String validade, boolean refrigerado)
    {
        super (nome, fabricante, codigo, valorUnitario, quantidade);
        this.validade = validade;
        this.refrigerado = refrigerado;
        
    }
    
    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
    
    public String imprimir(){
        return super.imprimir() + " \n" +
        "Validade: " + this.validade + " \n" +
        "Refrigerado: " + this.refrigerado + " \n";
    }
}
