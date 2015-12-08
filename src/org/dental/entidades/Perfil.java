/**
 * Perfil.java
 * 07/12/2015
 */
package org.dental.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
@Entity
@Table(name = "perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p"),
    @NamedQuery(name = "Perfil.findByIdperfil", query = "SELECT p FROM Perfil p WHERE p.idperfil = :idperfil"),
    @NamedQuery(name = "Perfil.findByNombreperfil", query = "SELECT p FROM Perfil p WHERE p.nombreperfil = :nombreperfil"),
    @NamedQuery(name = "Perfil.findByDescripcionperfil", query = "SELECT p FROM Perfil p WHERE p.descripcionperfil = :descripcionperfil")})
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPERFIL")
    private Integer idperfil;
    @Basic(optional = false)
    @Column(name = "NOMBREPERFIL")
    private String nombreperfil;
    @Column(name = "DESCRIPCIONPERFIL")
    private String descripcionperfil;
    @OneToMany(mappedBy = "idperfil")
    private List<Usuario> usuarioList;

    public Perfil() {
    }

    public Perfil(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public Perfil(Integer idperfil, String nombreperfil) {
        this.idperfil = idperfil;
        this.nombreperfil = nombreperfil;
    }

    public Integer getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombreperfil() {
        return nombreperfil;
    }

    public void setNombreperfil(String nombreperfil) {
        this.nombreperfil = nombreperfil;
    }

    public String getDescripcionperfil() {
        return descripcionperfil;
    }

    public void setDescripcionperfil(String descripcionperfil) {
        this.descripcionperfil = descripcionperfil;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
}
