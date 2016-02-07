/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.bean;

import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Reserva;
import model.ReservaProduto;
import model.Produto;
import dao.ProdutoDao;
import dao.ReservaProdutoDao;
import dao.ReservaDao;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usuario
 */
@ManagedBean
@SessionScoped
public class ReservaBean {
    
    private ReservaDao rd = new ReservaDao();
    private ReservaProdutoDao rpd = new ReservaProdutoDao();
    private Reserva r = new Reserva();
    private ProdutoDao pd = new ProdutoDao();
    private Produto p = new Produto();
    private ReservaProduto rp = new ReservaProduto();
    private List<Reserva> listaR= rd.listarReservas("");
    private List<ReservaProduto> listaRP= rpd.listarRP(r);
    private List<Produto> listaP= pd.listarProdutos("");
    
    
}
