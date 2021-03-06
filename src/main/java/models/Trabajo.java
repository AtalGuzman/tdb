/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fernanda
 */
@Entity
@Table(name = "TRABAJO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajo.findAll", query = "SELECT t FROM Trabajo t"),
    @NamedQuery(name = "Trabajo.findByIdTrabajo", query = "SELECT t FROM Trabajo t WHERE t.idTrabajo = :idTrabajo"),
    @NamedQuery(name = "Trabajo.findByDireccion", query = "SELECT t FROM Trabajo t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Trabajo.findByNombreLocal", query = "SELECT t FROM Trabajo t WHERE t.nombreLocal = :nombreLocal"),
    @NamedQuery(name = "Trabajo.findByNumero", query = "SELECT t FROM Trabajo t WHERE t.numero = :numero"),
    @NamedQuery(name = "Trabajo.findByComuna", query = "SELECT t FROM Trabajo t WHERE t.comuna = :comuna"),
    @NamedQuery(name = "Trabajo.findByLatitud", query = "SELECT t FROM Trabajo t WHERE t.latitud = :latitud"),
    @NamedQuery(name = "Trabajo.findByLongitud", query = "SELECT t FROM Trabajo t WHERE t.longitud = :longitud")})
public class Trabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TRABAJO")
    private Integer idTrabajo;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "NOMBRE_LOCAL")
    private String nombreLocal;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "COMUNA")
    private String comuna;
    @Column(name = "LATITUD")
    private Long latitud;
    @Column(name = "LONGITUD")
    private Long longitud;
    @OneToMany(mappedBy = "idTrabajo")
    private Collection<Usuario> usuarioCollection;

    public Trabajo() {
    }

    public Trabajo(Integer idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Integer getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Integer idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Long getLatitud() {
        return latitud;
    }

    public void setLatitud(Long latitud) {
        this.latitud = latitud;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajo != null ? idTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajo)) {
            return false;
        }
        Trabajo other = (Trabajo) object;
        if ((this.idTrabajo == null && other.idTrabajo != null) || (this.idTrabajo != null && !this.idTrabajo.equals(other.idTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Trabajo[ idTrabajo=" + idTrabajo + " ]";
    }
    
}
