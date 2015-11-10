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
public class ComponenteChantili extends ComponenteAbstrato{

    public ComponenteChantili(Cafe cafe) {
        super(cafe);
    }

    @Override
    public float getPreco() {
        return (float) (decoratedCafe.getPreco()+ 1.00);
    }

    
}
