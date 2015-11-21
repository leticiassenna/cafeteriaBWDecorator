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
public abstract class CafeAbstrato implements ICafe{
    float preco;
    
    @Override
    public abstract float getPreco();
    

    @Override
    public abstract String getNome() ;

    @Override
    public abstract ArrayList<Ingrediente> getIngredientes() ;

    @Override
    public abstract void getInformacao() ;

    
}
