/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goma.cdp.maqState;

import goma.cdp.Maquina;

/**
 *
 * @author IzabelyFurtado
 */
public class GomasAcabaram extends MaquinaState{
    
    public GomasAcabaram(Maquina GAMaquina){
        super(GAMaquina);
    }
    
    @Override
    public void solicitaGoma(int moeda) {
        throw new UnsupportedOperationException("Acabaram as Gomas :/ Dicupa");
    }
 
    @Override
    public String toString(){
        return "Gomas Acabaram";
    }
}
