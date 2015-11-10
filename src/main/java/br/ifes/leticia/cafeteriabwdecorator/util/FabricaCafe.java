package br.ifes.leticia.cafeteriabwsingleton.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Ingrediente;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class FabricaCafe extends FabricaAbstrata{
    private FabricaCafe instance;
    private Cafe cafe;
    private FabricaAbstrata fabrica;
    
    
    public synchronized static FabricaCafe getInstance(FabricaCafe instance) {
        if(instance==null){
            instance = new FabricaCafe();
        }
        return instance;
    }

    private FabricaCafe() {
        
    }
    
    @Override
    public  Cafe criarCafe(String nome){
        
        if ("CafeNormal".equals(nome)){
            fabrica= new FabricaCafeNormal();
            
        }

        if ("CafeDescafeinado".equals(nome)){
            fabrica = new FabricaCafeDescafeinado();
            
            
        }
        if ("CafeCappuccino".equals(nome)){
            fabrica = new FabricaCafeCappuccino();
            
        }
        
        cafe = fabrica.criarCafe(nome);
        cafe.setIngredientes(fabrica.criarIngrediente());        
        
        return cafe;
    }

    

    @Override
    public ArrayList<Ingrediente> criarIngrediente() {
        return fabrica.criarIngrediente();
        
    }
    
}