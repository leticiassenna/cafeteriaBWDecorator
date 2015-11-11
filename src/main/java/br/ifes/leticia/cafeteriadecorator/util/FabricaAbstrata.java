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
public abstract class FabricaAbstrata {
    
    
    public abstract ArrayList<Ingrediente> criarIngrediente();
    public abstract Cafe criarCafe(String nome);
    
}
