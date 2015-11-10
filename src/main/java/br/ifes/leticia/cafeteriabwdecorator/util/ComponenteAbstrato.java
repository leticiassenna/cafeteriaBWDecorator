/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Ingrediente;
import java.util.ArrayList;

/**
 *
 * @author 20111BSI0161
 */
public abstract class ComponenteAbstrato extends CafeAbstrato{
    protected Cafe decoratedCafe;
    
    public ComponenteAbstrato (Cafe cafe){
        cafe.getPreco();
        decoratedCafe = cafe;
    }

    @Override
    public abstract float getPreco() ;

    
}
