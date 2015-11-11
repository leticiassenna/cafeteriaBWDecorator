/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.util;

import br.ifes.leticia.cafeteriadecorator.cdp.Cafe;

/**
 *
 * @author Leticia
 */
public abstract class BuilderAbstrato implements Builder {
    
    protected Cafe cafe = new Cafe();
    protected FabricaAbstrata fabrica;
    protected FabricaCafe fabricaCafe = FabricaCafe.getInstance(null);;
    
    @Override
    public void prepararIngredientes(){
        cafe.setIngredientes(fabricaCafe.criarIngrediente());
    }
    @Override
    public Cafe servirCafe(String nomeCafe){
        cafe = fabricaCafe.criarCafe(nomeCafe);
        return cafe;
    }
    
    
}
