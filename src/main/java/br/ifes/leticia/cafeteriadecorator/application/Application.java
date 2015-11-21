/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.application;

import br.ifes.leticia.cafeteriadecorator.cdp.Cafe;
import br.ifes.leticia.cafeteriadecorator.cdp.ICafe;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteAbstrato;
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
        ComponenteAbstrato cafeComponente ;
        cafe.getInformacao();
        
        cafeComponente = new ComponenteChocolate(cafeFeito);
        System.out.println(""+cafeComponente.toString());
        
        cafeComponente = new ComponenteChantili(cafeComponente);
        System.out.println(""+cafeComponente.toString());
        
        cafeComponente = new ComponenteCremeLaranja(cafeComponente);
        System.out.println(""+cafeComponente.toString());
    }
        
    
}
