/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.cdp;

import br.ifes.leticia.cafeteriabwsingleton.util.CafeAbstrato;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class Cafe extends CafeAbstrato{
    private String nome;
    private float preco;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();


    @Override
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

   
    public void setIngredientes(ArrayList<Ingrediente> ingrediente) {
        this.ingredientes = ingrediente;
    }
    
    public void getInformacao() {
        String quebraLinha = System.getProperty("line.separator");
        System.out.println(quebraLinha+ "Cafe {" + "tipo = " + getNome() + 
                 ", preco = " + getPreco() + '}');
        System.out.println("Ingredientes: ");
        for (Ingrediente ingrediente: ingredientes)
            System.out.println( ingrediente.getNome()+ " qtd = "+ ingrediente.getQuantidade());
    }
    
     
    
}
