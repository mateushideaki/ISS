/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.bean;

import dao.ClienteDao;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Cliente;
import web.dao.ClienteWebDao;
import web.model.ClienteWeb;

/**
 *
 * @author lucas
 */
@ManagedBean
@SessionScoped
public class ClienteWebBean {

    /**
     * Creates a new instance of ClienteWebBean
     */
    
    private ClienteWeb clienteWeb = new ClienteWeb();
    private ClienteWebDao clienteWebDao = new ClienteWebDao();
    private Cliente cliente = new Cliente();
    private ClienteDao clienteDao = new ClienteDao();
    private List<Cliente> listaClientes;
    
    public ClienteWebBean() {
    }

    public String verificarCpf(String cpf){
        this.listaClientes = clienteDao.listarClientesCpf(cpf);
        if(listaClientes.isEmpty()){
            return "cpf não está no banco de dados";
        }else{
            return "cpf está no banco de dados";
        }
        
    }
    
    
    public String cadastrarClienteWeb(){
        clienteWebDao.cadastrarClienteWeb(clienteWeb);
        clienteWeb.setSenha(null);
        clienteWeb.setEmail(null);
        clienteWeb.setLogin(null);
        return "index";
    }
    
    public String removerClienteWeb(){
        clienteWebDao.removerClienteWeb(clienteWeb);
        return "removido";
    }
    
    public ClienteWeb getClienteWeb() {
        return clienteWeb;
    }

    public void setClienteWeb(ClienteWeb clienteWeb) {
        this.clienteWeb = clienteWeb;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.clienteWeb);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteWebBean other = (ClienteWebBean) obj;
        if (!Objects.equals(this.clienteWeb, other.clienteWeb)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
