/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.cafeteriadecorator.cdp.Cafe;
import br.ifes.leticia.cafeteriadecorator.util.BuilderAbstrato;
import br.ifes.leticia.cafeteriadecorator.util.CafeCappuccinoBuilder;
import br.ifes.leticia.cafeteriadecorator.util.CafeDescafeinadoBuilder;
import br.ifes.leticia.cafeteriadecorator.util.CafeNormalBuilder;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author Leticia
 */
public class TesteBuilder {
    private BuilderAbstrato cafeteria;
    private Cafe cafe;
    
    
    public TesteBuilder() {
    }
    
    @Test
    public void testBuilderCafeNormal() 
    {
        
        cafeteria = new CafeNormalBuilder();
        cafe = cafeteria.servirCafe("CafeNormal");
        Assert.assertSame(cafe.getNome(), "Normal");
    }
    
    @Test
    public void testBuilderCafeCappuccino() 
    {
        cafeteria = new CafeCappuccinoBuilder();
        cafe = cafeteria.servirCafe("CafeCappuccino");
        Assert.assertSame(cafe.getNome(), "Cappuccino");
    }
    
   @Test
    public void testBuilderCafeDescafeinado() 
    {
        cafeteria = new CafeDescafeinadoBuilder();
        cafe = cafeteria.servirCafe("CafeDescafeinado");
        Assert.assertSame(cafe.getNome(), "Descafeinado");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
