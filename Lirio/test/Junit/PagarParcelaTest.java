/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

import classesTeste.PagarParcela;
import model.ParcelaVenda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mateus
 */
public class PagarParcelaTest {
    
    public PagarParcelaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pagarParcela method, of class PagarParcela.
     */
    @Test
    public void testPagarParcela() {
        System.out.println("pagarParcela");
        ParcelaVenda parcela = new ParcelaVenda();
        PagarParcela instance = new PagarParcela();
        String expResult = "sucesso";
        String result = instance.pagarParcela(parcela);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPagarParcela2() {
        System.out.println("pagarParcela");
        ParcelaVenda parcela = new ParcelaVenda();
        parcela.setStatus("Pago");
        PagarParcela instance = new PagarParcela();
        String expResult = "parcelaPaga";
        String result = instance.pagarParcela(parcela);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPagarParcela3() {
        System.out.println("pagarParcela");
        ParcelaVenda parcela = new ParcelaVenda();
        parcela.setStatus("123");
        PagarParcela instance = new PagarParcela();
        String expResult = "Erro, status inconsistente.";
        String result = instance.pagarParcela(parcela);
        assertEquals(expResult, result);
    }
    
}
