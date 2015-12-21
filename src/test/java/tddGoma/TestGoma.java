package tddGoma;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import goma.cdp.Maquina;
import goma.cdp.maqState.GomasAcabaram;
import goma.cdp.maqState.SemMoeda;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author IzabelyFurtado
 */
public class TestGoma {
    
    public TestGoma() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void getGomaQuantGomas(){
        Maquina maq = new Maquina();
        maq.getGoma();
        assertEquals(99, maq.getQuantGomas());
    }
    
    @Test
    public void getGomaEstado(){
        Maquina maq = new Maquina();
        maq.getGoma();
        assertEquals(new SemMoeda(maq).toString(), maq.getEstado().toString());
    }
    
    @Test
    public void getGomaEstadoAcabou(){
        Maquina maq = new Maquina();
        for(int i = 0; i <=100; i++){
            maq.getGoma();
        }
        assertEquals(new GomasAcabaram(maq).toString(), maq.getEstado().toString());
    }
    
    @Test
    public void getGomaEstadoAcabou2(){
        Maquina maq = new Maquina();
        for(int i = 0; i <100; i++){
            maq.getGoma();
        }
        assertEquals(new GomasAcabaram(maq).toString(), maq.getEstado().toString());
    }
    @Test
    public void getGomaEstadoNaoAcabou(){
        Maquina maq = new Maquina();
        for(int i = 0; i <=50; i++){
            maq.getGoma();
        }
        assertEquals(new SemMoeda(maq).toString(), maq.getEstado().toString());
    }
    
    @Test
    public void getGomaEstadoNaoAcabou1(){
        Maquina maq = new Maquina();
        for(int i = 0; i <=1; i++){
            maq.getGoma();
        }
        assertEquals(new SemMoeda(maq).toString(), maq.getEstado().toString());
    }
    
    @Test
    public void getGomaEstadoNaoAcabou2(){
        Maquina maq = new Maquina();
        for(int i = 0; i <99; i++){
            maq.getGoma();
        }
        assertEquals(new SemMoeda(maq).toString(), maq.getEstado().toString());
    }
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
