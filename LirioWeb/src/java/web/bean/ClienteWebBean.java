/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.bean;

import dao.ClienteDao;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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
    private List<ClienteWeb> listaClientesWeb;
    private String confirmaSenha;
    
    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
    private String loginMessage;
    
    public ClienteWebBean() {
        this.loginMessage = "";
             
    }

    public String verificarCpf(){
        
        this.listaClientes = clienteDao.listarClientesCpf(clienteWeb.getLogin());
        if(this.listaClientes.isEmpty()){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Este CPF não está no banco de dados."));
            return "fail";
        }else{
            this.listaClientesWeb = clienteWebDao.verificarCpf(clienteWeb.getLogin());
            if (this.listaClientesWeb.isEmpty()){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "CPF Cadastrado."));
                return "sucess";
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error!", "CPF já está cadastrado."));
                return "fail";
            }
        }       
    }
    
    public String verificarConta(){
        this.listaClientesWeb = clienteWebDao.verificarConta(clienteWeb.getLogin(),clienteWeb.getSenha());
        if (this.listaClientesWeb.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage("Erro",
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou senha inválidos!", "Erro!"));
            this.loginMessage = "Login ou senha inválidos";
            return "logar";
        }else if(listaClientesWeb.get(0).getLogin().equals(clienteWeb.getLogin()) && listaClientesWeb.get(0).getSenha().equals(clienteWeb.getSenha())){
            this.loginMessage = "";
            return "logado";
        }else{
            this.loginMessage = "Login ou senha inválidos";
            return "logar";
        }     
    }
    
    public void limparFaceContext(){
        FacesContext context = FacesContext.getCurrentInstance();
        Iterator<FacesMessage> it = context.getMessages();
        while ( it.hasNext() ) {
            it.next();
            it.remove();
        }
    }
    
    public String cancelar(){
        clienteWeb.setSenha(null);
        clienteWeb.setEmail(null);
        clienteWeb.setLogin(null);
        clienteWeb.setPergunta(null);
        clienteWeb.setResposta(null);
        return "logar";      
    }
    
    public String cadastrarClienteWeb(){
        this.limparFaceContext();
        String retorno = this.verificarCpf();
        if(retorno.equals("sucess")){
            clienteWebDao.cadastrarClienteWeb(clienteWeb);
            clienteWeb.setSenha(null);
            clienteWeb.setEmail(null);
            clienteWeb.setLogin(null);
            clienteWeb.setPergunta(null);
            clienteWeb.setResposta(null);
            return "logar";
        }else{
            return null;
        }        
    }
    
    public ClienteWeb getClienteWeb() {
        return clienteWeb;
    }

    public void setClienteWeb(ClienteWeb clienteWeb) {
        this.clienteWeb = clienteWeb;
    }
    
    public String getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(String message) {
        this.loginMessage = message;
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
