/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;

/**
 *
 * @author Leticia
 */
public class ComponenteChocolate extends ComponenteAbstrato{

    public ComponenteChocolate(Cafe cafe) {
        super(cafe);
    }

    
    @Override
    public final float getPreco() {
        return (float) (decoratedCafe.getPreco()+ 0.50);
    }
  
    
}
