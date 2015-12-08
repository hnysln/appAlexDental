/**
 * Sexo.java
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
@Table(name = "sexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sexo.findAll", query = "SELECT s FROM Sexo s"),
    @NamedQuery(name = "Sexo.findByIdsexo", query = "SELECT s FROM Sexo s WHERE s.idsexo = :idsexo"),
    @NamedQuery(name = "Sexo.findByNombresexo", query = "SELECT s FROM Sexo s WHERE s.nombresexo = :nombresexo")})
public class Sexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDSEXO")
    private Integer idsexo;
    @Basic(optional = false)
    @Column(name = "NOMBRESEXO")
    private String nombresexo;
    @OneToMany(mappedBy = "idsexo")
    private List<Paciente> pacienteList;

    public Sexo() {
    }

    public Sexo(Integer idsexo) {
        this.idsexo = idsexo;
    }

    public Sexo(Integer idsexo, String nombresexo) {
        this.idsexo = idsexo;
        this.nombresexo = nombresexo;
    }

    public Integer getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(Integer idsexo) {
        this.idsexo = idsexo;
    }

    public String getNombresexo() {
        return nombresexo;
    }

    public void setNombresexo(String nombresexo) {
        this.nombresexo = nombresexo;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }
}
