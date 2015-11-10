/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

import br.ifes.leticia.cafeteriabwsingleton.cdp.ICafe;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Ingrediente;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public abstract class CafeAbstrato implements ICafe{
    
    @Override
    public abstract float getPreco();

}
