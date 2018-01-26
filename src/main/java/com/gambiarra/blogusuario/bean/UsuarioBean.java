
package com.gambiarra.blogusuario.bean;

import com.gambiarra.blogusuario.entidade.Usuario;
import com.gambiarra.blogusuario.util.JPAUtil;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

@ManagedBean
public class UsuarioBean {
    
    private Usuario usuario = new Usuario();
    private String data = new String();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
   
    public void salvar(Usuario usuario){
        Date datanas = new Date(data);
        usuario.setDataNascimento(datanas);
        
        
        EntityManager em = JPAUtil.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }
}
