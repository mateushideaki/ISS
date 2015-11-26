/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.ClienteDao;
import java.util.List;
import java.util.Objects;
import model.Cliente;

/**
 *
 * @author lucas
 */
public class ControleCliente {
    private Cliente cliente = new Cliente();
    private ClienteDao clienteDao = new ClienteDao();
    private List<Cliente> listaClientes;
    
    public List<Cliente> listarClientes(String busca){
        this.listaClientes = clienteDao.listarClientes(busca);
        return this.listaClientes;
    }
    
    public void cadastrarCliente(Cliente c){
        clienteDao.cadastrarCliente(c);
    }
    
    public void excluirCliente(Cliente c){
        clienteDao.excluirCliente(c);
    }
    
    public void carregarCliente(Cliente c) {
        this.cliente = c;
    }
    
    public void alterarCliente(Cliente c){
        clienteDao.alterarCliente(c);
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControleCliente other = (ControleCliente) obj;
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }

    
}
