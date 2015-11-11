/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.application;

import br.ifes.leticia.cafeteriadecorator.cdp.Cafe;
import br.ifes.leticia.cafeteriadecorator.cdp.ICafe;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteChantili;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteChocolate;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteCremeLaranja;
import br.ifes.leticia.cafeteriadecorator.util.FabricaCafe;


/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String [] xxx) 
    {
        FabricaCafe fabricaCafe = FabricaCafe.getInstance(null);
        
        Cafe cafe = fabricaCafe.criarCafe("CafeNormal");
        ICafe cafeFeito = cafe;
        cafe.getInformacao();
        
        cafeFeito = new ComponenteChocolate((Cafe) cafeFeito);
        System.out.println(""+cafeFeito.toString());
        
        cafeFeito = new ComponenteChantili((Cafe) cafeFeito);
        System.out.println(""+cafeFeito.toString());
        
        cafeFeito = new ComponenteCremeLaranja((Cafe) cafeFeito);
        System.out.println(""+cafeFeito.toString());
    }
        
    
}
