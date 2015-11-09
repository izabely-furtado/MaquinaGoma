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
public class GomaVendida extends MaquinaState{

    public GomaVendida(Maquina GVMaquina) {
        super(GVMaquina);
    }
    
    @Override
    public void solicitaGoma(int moeda) {
        this._maquina.getGoma();
        
        this._maquina.solicitaGoma(moeda);
    }
    
    @Override
    public String toString(){
        return "Goma Vendida";
    }
}
