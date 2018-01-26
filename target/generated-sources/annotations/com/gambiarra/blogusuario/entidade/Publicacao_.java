package com.gambiarra.blogusuario.entidade;

import com.gambiarra.blogusuario.entidade.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-26T11:43:35")
@StaticMetamodel(Publicacao.class)
public class Publicacao_ { 

    public static volatile SingularAttribute<Publicacao, String> texto;
    public static volatile SingularAttribute<Publicacao, Date> dataAtualizacao;
    public static volatile SingularAttribute<Publicacao, String> titulo;
    public static volatile SingularAttribute<Publicacao, Integer> id;
    public static volatile SingularAttribute<Publicacao, Date> dataCadastro;
    public static volatile SingularAttribute<Publicacao, Usuario> usuarioId;

}