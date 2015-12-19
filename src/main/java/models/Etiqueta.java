/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fernanda
 */
@Entity
@Table(name = "ETIQUETA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etiqueta.findAll", query = "SELECT e FROM Etiqueta e"),
    @NamedQuery(name = "Etiqueta.findByIdEtiqueta", query = "SELECT e FROM Etiqueta e WHERE e.idEtiqueta = :idEtiqueta"),
    @NamedQuery(name = "Etiqueta.findByFecha", query = "SELECT e FROM Etiqueta e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Etiqueta.findByEstado", query = "SELECT e FROM Etiqueta e WHERE e.estado = :estado"),
    @NamedQuery(name = "Etiqueta.findByNombreUsEtiqueta", query = "SELECT e FROM Etiqueta e WHERE e.nombreUsEtiqueta = :nombreUsEtiqueta")})
public class Etiqueta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ETIQUETA")
    private Integer idEtiqueta;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "NOMBRE_US_ETIQUETA")
    private String nombreUsEtiqueta;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @JoinColumn(name = "ID_FOTO", referencedColumnName = "ID_FOTO")
    @ManyToOne(optional = false)
    private Foto idFoto;

    public Etiqueta() {
    }

    public Etiqueta(Integer idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public Integer getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(Integer idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreUsEtiqueta() {
        return nombreUsEtiqueta;
    }

    public void setNombreUsEtiqueta(String nombreUsEtiqueta) {
        this.nombreUsEtiqueta = nombreUsEtiqueta;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Foto getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Foto idFoto) {
        this.idFoto = idFoto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEtiqueta != null ? idEtiqueta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etiqueta)) {
            return false;
        }
        Etiqueta other = (Etiqueta) object;
        if ((this.idEtiqueta == null && other.idEtiqueta != null) || (this.idEtiqueta != null && !this.idEtiqueta.equals(other.idEtiqueta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Etiqueta[ idEtiqueta=" + idEtiqueta + " ]";
    }
    
}
