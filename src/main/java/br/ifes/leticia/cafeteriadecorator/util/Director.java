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
public interface Director {
    public Cafe fazerCafe(BuilderAbstrato atendente, String cafe);
}
