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
 * @author 20111BSI0161
 */
public abstract class ComponenteAbstrato extends CafeAbstrato{
    protected ICafe decoratedCafe;
    
    public ComponenteAbstrato (ICafe cafe){        
        decoratedCafe = cafe;      
    }

    public ICafe getDecoratedCafe() {
        return decoratedCafe;
    }

    public void setDecoratedCafe(ICafe decoratedCafe) {
        this.decoratedCafe = decoratedCafe;
    }
    

    @Override
    public final float getPreco() {
        return (float) (decoratedCafe.getPreco()+ preco);
    }

    @Override
    public abstract String getNome() ;

    @Override
    public abstract ArrayList<Ingrediente> getIngredientes() ;

    @Override
    public abstract void getInformacao() ;


}
