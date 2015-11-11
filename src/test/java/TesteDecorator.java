
import br.ifes.leticia.cafeteriadecorator.cdp.Cafe;
import br.ifes.leticia.cafeteriadecorator.cdp.ICafe;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteChantili;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteChocolate;
import br.ifes.leticia.cafeteriadecorator.util.ComponenteCremeLaranja;
import br.ifes.leticia.cafeteriadecorator.util.FabricaCafe;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticia
 */
public class TesteDecorator {
    private final FabricaCafe fabricaCafe = FabricaCafe.getInstance(null);
    
    public TesteDecorator() {
    }
    
        
    @Test
    public void testFactoryCafeNormal() 
    {
        ICafe cafeFeito = fabricaCafe.criarCafe("CafeNormal");
        cafeFeito = new ComponenteChocolate((Cafe) cafeFeito);
        Assert.assertSame(cafeFeito.getPreco(), 2.5);
    }
    
    //@Test
    public void testFactoryCafeCappuccino() 
    {
        
        ICafe cafe = fabricaCafe.criarCafe("CafeCappuccino");
        cafe = new ComponenteChantili((Cafe) cafe);
        Assert.assertSame((float)cafe.getPreco(), 6.0);
    }
    
    //@Test
    public void testFactoryCafeDescafeinado() 
    {
        
        ICafe cafe = fabricaCafe.criarCafe("CafeDescafeinado");
        cafe = new ComponenteCremeLaranja((Cafe) cafe);
        Assert.assertSame((float)cafe.getPreco(), 4.5);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
