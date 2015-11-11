/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.cdp;


import br.ifes.leticia.cafeteriadecorator.util.FabricaCafe;
import br.ifes.leticia.cafeteriadecorator.view.TelaPromocao;


/**
 *
 * @author Leticia
 */
public class Promocao {
    TelaPromocao telaProm = new TelaPromocao();
    private int diaSemana;
    FabricaCafe fabricaCafe;
     
     
    public FabricaCafe promocao(int dia) {
        fabricaCafe = FabricaCafe.getInstance(fabricaCafe) ;
        setDiaSemana(dia);
        
        try{
            if(getDiaSemana() == 1 || getDiaSemana() == 3 || getDiaSemana() == 5){
                
                Cafe cafeFeito =  fabricaCafe.criarCafe("CafeNormal");
                float novoPreco = cafeFeito.getPreco()/2;
                cafeFeito.setPreco(novoPreco);
                cafeFeito.getInformacao();
                
            }
            if(getDiaSemana() == 2 || getDiaSemana() == 4 || getDiaSemana() == 6){
                Cafe cafeFeito = fabricaCafe.criarCafe("CafeDescafeinado");
                float novoPreco = cafeFeito.getPreco()/2;
                cafeFeito.setPreco(novoPreco);
                cafeFeito.getInformacao();
                 
            }
            if(getDiaSemana() == 7){
                Cafe cafeFeito = fabricaCafe.criarCafe("CafeCappuccino");
                float novoPreco = cafeFeito.getPreco()/2;
                cafeFeito.setPreco(novoPreco);
                cafeFeito.getInformacao();
            }
            return fabricaCafe;
        }
        catch (Exception e) {
            System.out.println("exception");
            //throw new Exception("Invalido");
        }
        return fabricaCafe;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
}
