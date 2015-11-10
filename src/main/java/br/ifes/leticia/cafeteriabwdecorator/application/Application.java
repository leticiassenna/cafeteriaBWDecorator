/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.application;

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.util.ComponenteChocolate;
import br.ifes.leticia.cafeteriabwsingleton.util.FabricaCafe;


/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String [] xxx) 
    {
        FabricaCafe fabricaCafe = FabricaCafe.getInstance(null);
        Cafe cafeFeito = fabricaCafe.criarCafe("CafeNormal");
        
        //cafeFeito = new ComponenteChocolate(cafeFeito);
    }
            
        
    
}
