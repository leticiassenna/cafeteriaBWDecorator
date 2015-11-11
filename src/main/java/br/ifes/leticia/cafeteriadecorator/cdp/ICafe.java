/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriadecorator.cdp;

import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public interface ICafe {
    public float getPreco();
    public String getNome();
    public ArrayList<Ingrediente> getIngredientes();
    public void getInformacao();
}
