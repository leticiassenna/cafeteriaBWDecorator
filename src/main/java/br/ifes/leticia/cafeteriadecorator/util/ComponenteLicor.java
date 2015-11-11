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
public class ComponenteLicor extends ComponenteAbstrato{

    public ComponenteLicor(Cafe cafe) {
        super(cafe);
    }

    @Override
    public float getPreco() {
        return (float) (decoratedCafe.getPreco()+ 2.5);
    }

    @Override
    public String toString() {
        decoratedCafe.toString();
        return "Adicao de licor, Preco final = " + this.getPreco();
        
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
