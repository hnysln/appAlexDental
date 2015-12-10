/**
 * Paciente.java
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByIdpaciente", query = "SELECT p FROM Paciente p WHERE p.idpaciente = :idpaciente"),
    @NamedQuery(name = "Paciente.findByCedulapaciente", query = "SELECT p FROM Paciente p WHERE p.cedulapaciente = :cedulapaciente"),
    @NamedQuery(name = "Paciente.findByNombrespaciente", query = "SELECT p FROM Paciente p WHERE p.nombrespaciente = :nombrespaciente"),
    @NamedQuery(name = "Paciente.findByApellidospaciente", query = "SELECT p FROM Paciente p WHERE p.apellidospaciente = :apellidospaciente"),
    @NamedQuery(name = "Paciente.findByFechanacimiento", query = "SELECT p FROM Paciente p WHERE p.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Paciente.findByMailpaciente", query = "SELECT p FROM Paciente p WHERE p.mailpaciente = :mailpaciente"),
    @NamedQuery(name = "Paciente.findByNumerohistoriaclinica", query = "SELECT p FROM Paciente p WHERE p.numerohistoriaclinica = :numerohistoriaclinica"),
    @NamedQuery(name = "Paciente.findByCelularpaciente", query = "SELECT p FROM Paciente p WHERE p.celularpaciente = :celularpaciente"),
    @NamedQuery(name = "Paciente.findByTelefonopaciente", query = "SELECT p FROM Paciente p WHERE p.telefonopaciente = :telefonopaciente"),
    @NamedQuery(name = "Paciente.findByFecharegistro", query = "SELECT p FROM Paciente p WHERE p.fecharegistro = :fecharegistro")})
public class Paciente implements Serializable {

    @Lob
    @Column(name = "IMAGENPACIENTE")
    private byte[] imagenpaciente;
    @JoinTable(name = "enfermedad_paciente", joinColumns = {
        @JoinColumn(name = "IDPACIENTE", referencedColumnName = "IDPACIENTE")}, inverseJoinColumns = {
        @JoinColumn(name = "IDENFERMEDAD", referencedColumnName = "IDENFERMEDAD")})
    @ManyToMany
    private List<Enfermedad> enfermedadList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPACIENTE")
    private Integer idpaciente;
    @Column(name = "CEDULAPACIENTE")
    private String cedulapaciente;
    @Basic(optional = false)
    @Column(name = "NOMBRESPACIENTE")
    private String nombrespaciente;
    @Basic(optional = false)
    @Column(name = "APELLIDOSPACIENTE")
    private String apellidospaciente;
    @Basic(optional = false)
    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Column(name = "MAILPACIENTE")
    private String mailpaciente;
    @Basic(optional = false)
    @Column(name = "NUMEROHISTORIACLINICA")
    private String numerohistoriaclinica;
    @Column(name = "CELULARPACIENTE")
    private String celularpaciente;
    @Column(name = "TELEFONOPACIENTE")
    private String telefonopaciente;
    @Basic(optional = false)
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecharegistro;
    @JoinColumn(name = "IDSEXO", referencedColumnName = "IDSEXO")
    @ManyToOne
    private Sexo idsexo;

    public Paciente() {
    }

    public Paciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Paciente(Integer idpaciente, String nombrespaciente, String apellidospaciente, Date fechanacimiento, String numerohistoriaclinica, Date fecharegistro) {
        this.idpaciente = idpaciente;
        this.nombrespaciente = nombrespaciente;
        this.apellidospaciente = apellidospaciente;
        this.fechanacimiento = fechanacimiento;
        this.numerohistoriaclinica = numerohistoriaclinica;
        this.fecharegistro = fecharegistro;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getCedulapaciente() {
        return cedulapaciente;
    }

    public void setCedulapaciente(String cedulapaciente) {
        this.cedulapaciente = cedulapaciente;
    }

    public String getNombrespaciente() {
        return nombrespaciente;
    }

    public void setNombrespaciente(String nombrespaciente) {
        this.nombrespaciente = nombrespaciente;
    }

    public String getApellidospaciente() {
        return apellidospaciente;
    }

    public void setApellidospaciente(String apellidospaciente) {
        this.apellidospaciente = apellidospaciente;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getMailpaciente() {
        return mailpaciente;
    }

    public void setMailpaciente(String mailpaciente) {
        this.mailpaciente = mailpaciente;
    }

    public String getNumerohistoriaclinica() {
        return numerohistoriaclinica;
    }

    public void setNumerohistoriaclinica(String numerohistoriaclinica) {
        this.numerohistoriaclinica = numerohistoriaclinica;
    }

    public String getCelularpaciente() {
        return celularpaciente;
    }

    public void setCelularpaciente(String celularpaciente) {
        this.celularpaciente = celularpaciente;
    }

    public String getTelefonopaciente() {
        return telefonopaciente;
    }

    public void setTelefonopaciente(String telefonopaciente) {
        this.telefonopaciente = telefonopaciente;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public Sexo getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(Sexo idsexo) {
        this.idsexo = idsexo;
    }

    public byte[] getImagenpaciente() {
        return imagenpaciente;
    }

    public void setImagenpaciente(byte[] imagenpaciente) {
        this.imagenpaciente = imagenpaciente;
    }

    @XmlTransient
    public List<Enfermedad> getEnfermedadList() {
        return enfermedadList;
    }

    public void setEnfermedadList(List<Enfermedad> enfermedadList) {
        this.enfermedadList = enfermedadList;
    }
}
