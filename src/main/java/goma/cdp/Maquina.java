/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goma.cdp;

import goma.cdp.maqState.*;

/**
 *
 * @author IzabelyFurtado
 */
public class Maquina {
    private int quantGomas;
    private MaquinaState meuEstado;
    
    public Maquina(){
        this.quantGomas = 100;
    }
    
    public Maquina(int moeda){
        this.quantGomas = 10;
        
        if(this.quantGomas > 0){
            this.meuEstado = new SemMoeda(this);
        }
        else{
            this.meuEstado = new GomasAcabaram(this);
        }
        this.solicitaGoma(moeda);
    }

    public void setMaisGomas(int quantGomas){
        if (quantGomas > 0){
            this.quantGomas += quantGomas;
        }
        else{
            throw new UnsupportedOperationException("Sai dessa vida");
        }
    }
    
    public void setEstado(MaquinaState estado){
        this.meuEstado = estado;
    }
    
    public void getGoma(){
        System.out.println("Pegue sua Goma");
        //alterando o status da maquina
        this.quantGomas -= 1;        
        if (quantGomas > 0) this.meuEstado = new SemMoeda(this);
        else this.meuEstado = new GomasAcabaram(this);
    }
    
    public void solicitaGoma(int moeda) {
        this.meuEstado.solicitaGoma(moeda);
        System.out.println(this.meuEstado.toString());
    }
}