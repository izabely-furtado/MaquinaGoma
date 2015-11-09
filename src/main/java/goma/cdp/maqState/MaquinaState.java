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
public abstract class MaquinaState implements IMaquinaState{
    protected Maquina _maquina;
    
    public MaquinaState(Maquina GAMaquina){
        this._maquina = GAMaquina;
    }
    
    @Override
    public abstract void solicitaGoma(int moeda);
    
    
}
