/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.util;

import br.ifes.leticia.cafeteriadecorator.cdp.ICafe;
import br.ifes.leticia.cafeteriadecorator.cdp.Ingrediente;
import java.util.ArrayList;
/**
 *
 * @author Leticia
 */
public class ComponenteChocolate extends ComponenteAbstrato{

    public ComponenteChocolate(ICafe cafe) {
        super(cafe);
        this.preco = (float)0.5;
    }
    
   
    
    @Override
    public String toString() {
        return "Adicao de chocolate, Preco final = " + this.getPreco();
                
    }

    
    
    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Ingrediente> getIngredientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getInformacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    
}
