/**
 * Enfermedad.java
 * 09/12/2015
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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
@Entity
@Table(name = "enfermedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enfermedad.findAll", query = "SELECT e FROM Enfermedad e"),
    @NamedQuery(name = "Enfermedad.findByIdenfermedad", query = "SELECT e FROM Enfermedad e WHERE e.idenfermedad = :idenfermedad"),
    @NamedQuery(name = "Enfermedad.findByNombreenfermedad", query = "SELECT e FROM Enfermedad e WHERE e.nombreenfermedad = :nombreenfermedad"),
    @NamedQuery(name = "Enfermedad.findByObservacionenfermedad", query = "SELECT e FROM Enfermedad e WHERE e.observacionenfermedad = :observacionenfermedad")})
public class Enfermedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDENFERMEDAD")
    private Integer idenfermedad;
    @Basic(optional = false)
    @Column(name = "NOMBREENFERMEDAD")
    private String nombreenfermedad;
    @Column(name = "OBSERVACIONENFERMEDAD")
    private String observacionenfermedad;
    @ManyToMany(mappedBy = "enfermedadList")
    private List<Paciente> pacienteList;

    public Enfermedad() {
    }

    public Enfermedad(Integer idenfermedad) {
        this.idenfermedad = idenfermedad;
    }

    public Enfermedad(Integer idenfermedad, String nombreenfermedad) {
        this.idenfermedad = idenfermedad;
        this.nombreenfermedad = nombreenfermedad;
    }

    public Integer getIdenfermedad() {
        return idenfermedad;
    }

    public void setIdenfermedad(Integer idenfermedad) {
        this.idenfermedad = idenfermedad;
    }

    public String getNombreenfermedad() {
        return nombreenfermedad;
    }

    public void setNombreenfermedad(String nombreenfermedad) {
        this.nombreenfermedad = nombreenfermedad;
    }

    public String getObservacionenfermedad() {
        return observacionenfermedad;
    }

    public void setObservacionenfermedad(String observacionenfermedad) {
        this.observacionenfermedad = observacionenfermedad;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenfermedad != null ? idenfermedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enfermedad)) {
            return false;
        }
        Enfermedad other = (Enfermedad) object;
        if ((this.idenfermedad == null && other.idenfermedad != null) || (this.idenfermedad != null && !this.idenfermedad.equals(other.idenfermedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.dental.entidades.Enfermedad[ idenfermedad=" + idenfermedad + " ]";
    }

}
