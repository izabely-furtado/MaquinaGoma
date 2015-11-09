/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goma.cdp.maqState;

import goma.cdp.Maquina;
import java.util.Scanner;

/**
 *
 * @author IzabelyFurtado
 */
public class RecebeMoeda extends MaquinaState{

    public RecebeMoeda(Maquina RMMaquina) {
        super(RMMaquina);
    }
    
    @Override
    public void solicitaGoma(int moeda) {
        
        if (moeda == 1){
            System.out.println("Acione a Lavanca");
            this._maquina.setEstado(new GomaVendida(this._maquina));
            this._maquina.solicitaGoma(moeda);
        }
        else{
            System.out.println("Moeda inadequada inserida");
            this._maquina.setEstado(new SemMoeda(this._maquina));
            this._maquina.solicitaGoma(moeda);
        }
    }
    
    @Override
    public String toString(){
        return "Recebe Moeda";
    }
}
