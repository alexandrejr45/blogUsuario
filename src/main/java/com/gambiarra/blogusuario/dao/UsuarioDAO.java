
package com.gambiarra.blogusuario.dao;

import com.gambiarra.blogusuario.entidade.Usuario;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UsuarioDAO {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
        createEntityManagerFactory("default");
        
        EntityManager em = emf.createEntityManager();
        
        Usuario usuario = new Usuario();
        
        Date data = new Date("07-09-2009");
        
        usuario.setNome("Marquinhos");
        usuario.setDataNascimento(data);
        usuario.setTelefone("91201921");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(usuario);
        tx.commit();
        
        em.close();
        emf.close();
        
        
        
        
    }
}
