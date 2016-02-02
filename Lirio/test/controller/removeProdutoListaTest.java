/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ReservaDao;
import java.util.List;
import model.Reserva;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class removeProdutoListaTest {
    
    private ReservaDao controle = new ReservaDao();
    private List<Reserva> listaReservas = controle.listarReservas("");
    private Reserva reserva;
    public removeProdutoListaTest() {
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
     * Test of listarReservas method, of class ControleReserva.
     */
    @Test
    public void testRemoveProdutoListaTest() {
        System.out.println("RemoveProdutoLista");
        ControleReserva instance = new ControleReserva();
        List<Reserva> list = instance.listarReservas("");
        int idproduto = 0;
        int qntSelecionada = 1;
        int qntNaLista = 1;
        String expResult = "ERRO:Selecione um produto";
        String result = instance.removeProdutoLista(idproduto,qntSelecionada,qntNaLista,list);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveProdutoListaTest2() {
        System.out.println("RemoveProdutoLista");
        ControleReserva instance = new ControleReserva();
        List<Reserva> list = instance.listarReservas("");
        int idproduto = 1;
        int qntSelecionada = 0;
        int qntNaLista = 1;
        String expResult = "ERRO:Quantidade menor que 1";
        String result = instance.removeProdutoLista(idproduto,qntSelecionada,qntNaLista,list);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveProdutoListaTest3() {
        System.out.println("RemoveProdutoLista");
        ControleReserva instance = new ControleReserva();
        List<Reserva> list = instance.listarReservas("");
        int idproduto = 1;
        int qntSelecionada = 2;
        int qntNaLista = 1;
        String expResult = "ERRO:Quantidade a ser removida é maior que quantidade na lista";
        String result = instance.removeProdutoLista(idproduto,qntSelecionada,qntNaLista,list);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveProdutoListaTest4() {
        System.out.println("RemoveProdutoLista");
        ControleReserva instance = new ControleReserva();
        List<Reserva> list = instance.listarReservas("");
        int idproduto = 1;
        int qntSelecionada = 1;
        int qntNaLista = 1;
        String expResult = "Produto Removido";
        String result = instance.removeProdutoLista(idproduto,qntSelecionada,qntNaLista,list);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveProdutoListaTest5() {
        System.out.println("RemoveProdutoLista");
        ControleReserva instance = new ControleReserva();
        List<Reserva> list = instance.listarReservas("");
        int idproduto = 1;
        int qntSelecionada = 1;
        int qntNaLista = 2;
        String expResult = "Quantidade decrementada";
        String result = instance.removeProdutoLista(idproduto,qntSelecionada,qntNaLista,list);
        assertEquals(expResult, result);
    }
}
