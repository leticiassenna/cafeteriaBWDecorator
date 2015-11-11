/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.util;

import br.ifes.leticia.cafeteriadecorator.cdp.Cafe;
import br.ifes.leticia.cafeteriadecorator.cdp.Ingrediente;
import java.util.ArrayList;
/**
 *
 * @author Leticia
 */
public class ComponenteChantili extends ComponenteAbstrato{

    public ComponenteChantili(Cafe cafe) {
        super(cafe);
    }

    @Override
    public float getPreco() {
        return (float) (decoratedCafe.getPreco()+ 1);
    }

    @Override
    public String toString() {
        return "Adicao de chantili, Preco final = " + this.getPreco();
        
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
