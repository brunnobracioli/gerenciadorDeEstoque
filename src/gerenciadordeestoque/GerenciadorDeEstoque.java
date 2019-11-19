/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeestoque;

import java.util.Calendar;
import java.util.Scanner;



/**
 *
 * @author Brunno
 */
public class GerenciadorDeEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Produto prod1 = new Produto("testeprod1", "testeFab", 001, 1.99f, 0);
        //System.out.format("%.2f \n",prod1.Vender(1));
        prod1.comprar(5);
        //System.out.println(prod1.imprimir());
        Eletronico eletro1 = new Eletronico("testeEletro1", "testeFab", 002, 1.99f, 0, "220v", 1, 'a');
        Eletronico eletro2 = new Eletronico("testeEletro2", "testeFab2", 003, 1.99f, 4, "220v", 1, 'b');
        //System.out.println("");
        //System.out.println(eletro1.imprimir());
        Movel movel1 = new Movel("testeMovel", "testeFab", 003, 3.40f, 0, "madeira", "marrom");
        //System.out.println(movel1.imprimir());
        Perecivel perecivel1 = new Perecivel("TestePerecivel", "testeFab", 004, 5.87f, 10, "27/10/2019", true);
        //System.out.println(perecivel1.imprimir());
        
       //Calendar c = Calendar.getInstance();
       //System.out.println(c.get(Calendar.DAY_OF_MONTH)+ "/" + (c.get(Calendar.MONTH)+ 1) + "/" + c.get(Calendar.YEAR));
       GerenciarProduto gerenciador = new GerenciarProduto();
       //gerenciador.adicionar(new Produto(in.nextLine(), in.nextLine(), in.nextInt(), in.nextFloat(), in.nextInt()));
       
       gerenciador.adicionar(prod1);
       gerenciador.adicionar(eletro1);
       gerenciador.adicionar(eletro2);
       gerenciador.adicionar(movel1);
       gerenciador.adicionar(perecivel1);
       /*
       gerenciador.produtos.forEach(t -> System.out.println(t.getNome()));
       if(gerenciador.remover(002))
            System.out.println("Produto removido");
       else
            System.out.println("Produto não encontrado");
       gerenciador.produtos.forEach(t -> System.out.println(t.getNome()));
        */
        /*try{
            System.out.println(gerenciador.buscarPorCodigo(002).getNome());
        }catch(Exception ex){
            System.out.println("Produto não encotrado");
        }
        */
        System.out.println(gerenciador.listarPorFabricante("testeFab2"));
    }

    
}
