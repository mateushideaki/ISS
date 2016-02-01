/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.bean;

import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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
    
    public ClienteWebBean() {
    }

    
    public String cadastrarClienteWeb(){
        clienteWebDao.cadastrarClienteWeb(clienteWeb);
        clienteWeb.setNome(null);
        clienteWeb.setEmail(null);
        clienteWeb.setTelefone(null);
        clienteWeb.setSenha(null);
        clienteWeb.setCpf(null);
        clienteWeb.setEndereco(null);
        
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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.clienteWeb);
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
        final ClienteWebBean other = (ClienteWebBean) obj;
        if (!Objects.equals(this.clienteWeb, other.clienteWeb)) {
            return false;
        }
        return true;
    }
    
    
    
}
