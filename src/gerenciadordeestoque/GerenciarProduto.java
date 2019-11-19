/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeestoque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



/**
 *
 * @author lab210
 */
public class GerenciarProduto {
    ArrayList <Produto> produtos = new ArrayList();
    
    public void adicionar(Produto p){
        produtos.add(p);
        boolean a = p instanceof Eletronico;
    }
    public boolean remover(int codigo){
        try{
            this.produtos.remove(produtos.stream().filter(t -> t.getCodigo() == codigo).findFirst().get());
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    public Produto buscarPorCodigo(int codigo){
        return this.produtos.stream().filter(t -> t.getCodigo() == codigo).findFirst().get();
    }
    public String listarEletronicos(){
        String eletronicos = "";
        for(Produto a : this.produtos.stream().filter(t -> t instanceof Eletronico).collect(Collectors.toList())){
            eletronicos += a.imprimir() + "\n";
        }
        return eletronicos;
    }
    public String listarPerecivel(){
        String pereciveis = "";
        for(Produto a : this.produtos.stream().filter(t -> t instanceof Perecivel).collect(Collectors.toList())){
            pereciveis += a.imprimir() + "\n";
        }
        return pereciveis;
    }
    public String listarMovel(){
        String moveis = "";
        for(Produto a : this.produtos.stream().filter(t -> t instanceof Movel).collect(Collectors.toList())){
            moveis += a.imprimir() + "\n";
        }
        return moveis;
    }
    public String listarEstoqueMenorQue(int quantidadeMinima){
        String estoqueMenor = "";
        for(Produto a : this.produtos.stream().filter(t -> t.getQuantidade() < quantidadeMinima).collect(Collectors.toList())){
            estoqueMenor += a.imprimir() + "\n";
        }
        return estoqueMenor;
    }
    public String listarEstoqueVazio(){
        String estoqueVazio = "";
        for(Produto a : this.produtos.stream().filter(t -> t.getQuantidade() == 0).collect(Collectors.toList())){
            estoqueVazio += a.imprimir() + "\n";
        }
        return estoqueVazio;
    }
    public String listarPorFabricante(String fabricante){
        String listarPorFabricante = "";
        for(Produto a : this.produtos.stream().filter(t -> t.getFabricante() == fabricante).collect(Collectors.toList())){
            listarPorFabricante += a.imprimir() + "\n";
        }
        return listarPorFabricante;
    }
    public String listarPorValidade(String validade){
        return validade;//verificar local date para criar o metodo.
    }
   
}

