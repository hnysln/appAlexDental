/**
 * Doctor.java
 * 07/12/2015
 */
package org.dental.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
@Entity
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findByIddoctor", query = "SELECT d FROM Doctor d WHERE d.iddoctor = :iddoctor"),
    @NamedQuery(name = "Doctor.findByIdentificaciondoctor", query = "SELECT d FROM Doctor d WHERE d.identificaciondoctor = :identificaciondoctor"),
    @NamedQuery(name = "Doctor.findByNombresdoctor", query = "SELECT d FROM Doctor d WHERE d.nombresdoctor = :nombresdoctor"),
    @NamedQuery(name = "Doctor.findByApellidosdoctor", query = "SELECT d FROM Doctor d WHERE d.apellidosdoctor = :apellidosdoctor"),
    @NamedQuery(name = "Doctor.findByMaildoctor", query = "SELECT d FROM Doctor d WHERE d.maildoctor = :maildoctor"),
    @NamedQuery(name = "Doctor.findByCelulardoctor", query = "SELECT d FROM Doctor d WHERE d.celulardoctor = :celulardoctor"),
    @NamedQuery(name = "Doctor.findByTelefonodoctor", query = "SELECT d FROM Doctor d WHERE d.telefonodoctor = :telefonodoctor"),
    @NamedQuery(name = "Doctor.findByFecharegistro", query = "SELECT d FROM Doctor d WHERE d.fecharegistro = :fecharegistro")})
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDOCTOR")
    private Integer iddoctor;
    @Basic(optional = false)
    @Column(name = "IDENTIFICACIONDOCTOR")
    private String identificaciondoctor;
    @Basic(optional = false)
    @Column(name = "NOMBRESDOCTOR")
    private String nombresdoctor;
    @Basic(optional = false)
    @Column(name = "APELLIDOSDOCTOR")
    private String apellidosdoctor;
    @Column(name = "MAILDOCTOR")
    private String maildoctor;
    @Column(name = "CELULARDOCTOR")
    private String celulardoctor;
    @Column(name = "TELEFONODOCTOR")
    private String telefonodoctor;
    @Basic(optional = false)
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecharegistro;
    @OneToMany(mappedBy = "iddoctor")
    private List<Usuario> usuarioList;

    public Doctor() {
    }

    public Doctor(Integer iddoctor) {
        this.iddoctor = iddoctor;
    }

    public Doctor(Integer iddoctor, String identificaciondoctor, String nombresdoctor, String apellidosdoctor, Date fecharegistro) {
        this.iddoctor = iddoctor;
        this.identificaciondoctor = identificaciondoctor;
        this.nombresdoctor = nombresdoctor;
        this.apellidosdoctor = apellidosdoctor;
        this.fecharegistro = fecharegistro;
    }

    public Integer getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(Integer iddoctor) {
        this.iddoctor = iddoctor;
    }

    public String getIdentificaciondoctor() {
        return identificaciondoctor;
    }

    public void setIdentificaciondoctor(String identificaciondoctor) {
        this.identificaciondoctor = identificaciondoctor;
    }

    public String getNombresdoctor() {
        return nombresdoctor;
    }

    public void setNombresdoctor(String nombresdoctor) {
        this.nombresdoctor = nombresdoctor;
    }

    public String getApellidosdoctor() {
        return apellidosdoctor;
    }

    public void setApellidosdoctor(String apellidosdoctor) {
        this.apellidosdoctor = apellidosdoctor;
    }

    public String getMaildoctor() {
        return maildoctor;
    }

    public void setMaildoctor(String maildoctor) {
        this.maildoctor = maildoctor;
    }

    public String getCelulardoctor() {
        return celulardoctor;
    }

    public void setCelulardoctor(String celulardoctor) {
        this.celulardoctor = celulardoctor;
    }

    public String getTelefonodoctor() {
        return telefonodoctor;
    }

    public void setTelefonodoctor(String telefonodoctor) {
        this.telefonodoctor = telefonodoctor;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
}
