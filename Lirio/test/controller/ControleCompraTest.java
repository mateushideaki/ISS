/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CompraDao;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import model.Compra;
import model.Fornecedor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ControleCompraTest {
    
    private Compra compra;
    private CompraDao compraDao = new CompraDao();
    private List<Compra> listaCompras = compraDao.listarCompras("");
    private List<Compra> listaComprasEfetuadas = compraDao.listarComprasEfetuadas("");
    private ControleFornecedor controleF = new ControleFornecedor();
    private Fornecedor fornecedor = controleF.listarFornecedores("Adidas").get(0);
    

    /**
     * Test of listarCompras method, of class ControleCompra.
     */
    @Test
    public void testListarCompras() {
        System.out.println("listarCompras");
        String busca = "";
        List<Compra> expResult = listaCompras;
        List<Compra> result = compraDao.listarCompras(busca);
        assertEquals(expResult, result); 
    }

    /**
     * Test of listarComprasEfetuadas method, of class ControleCompra.
     */
    @Test()
    public void testListarComprasEfetuadas() {
        System.out.println("listarComprasEfetuadas");
        String busca = "";
        ControleCompra instance = new ControleCompra();
        List<Compra> expResult = listaComprasEfetuadas;
        List<Compra> result = instance.listarComprasEfetuadas(busca);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmarCompra method, of class ControleCompra.
     */
    @Test
    public void testConfirmarCompra() {
        System.out.println("confirmarCompra");
        ControleCompra instance = new ControleCompra();
        int id = 1;
        String nome = "Adidas";
        float total = 150;
        Fornecedor forn = fornecedor;
        Date d = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(d);
        Date dataCompra = d;
        Date dataRecebimento = d;
        instance.confirmarCompra(id, nome, total, forn, dataCompra, dataRecebimento);
    }
    
}
