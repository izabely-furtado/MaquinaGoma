/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goma.cdp.maqState;

import goma.cdp.Maquina;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author IzabelyFurtado
 */
public class SemMoeda extends MaquinaState{

    public SemMoeda(Maquina SMMaquina) {
        super(SMMaquina);
    }
    
    @Override
    public void solicitaGoma(int moeda) {
        try {
            System.out.println("Insira moeda de 1");
        
        Scanner ler = new Scanner(System.in);
        int moeda2 = ler.nextInt();
        this._maquina.setEstado(new RecebeMoeda(this._maquina));
        this._maquina.solicitaGoma(moeda2);
        }
        catch(InputMismatchException e){
            System.err.println("Inserção inválida");
        }
    }
    
    
    @Override
    public String toString(){
        return "Sem Moeda";
    }
}
