/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Anthony Mendieta
 */
@Entity
@Table(name = "vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")
    , @NamedQuery(name = "Vehiculo.findByIdvehiculo", query = "SELECT v FROM Vehiculo v WHERE v.idvehiculo = :idvehiculo")
    , @NamedQuery(name = "Vehiculo.findByA\u00f1o", query = "SELECT v FROM Vehiculo v WHERE v.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Vehiculo.findByNpasajeros", query = "SELECT v FROM Vehiculo v WHERE v.npasajeros = :npasajeros")
    , @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca")
    , @NamedQuery(name = "Vehiculo.findByCilindraje", query = "SELECT v FROM Vehiculo v WHERE v.cilindraje = :cilindraje")
    , @NamedQuery(name = "Vehiculo.findByFabricacion", query = "SELECT v FROM Vehiculo v WHERE v.fabricacion = :fabricacion")
    , @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa")
    , @NamedQuery(name = "Vehiculo.findByConcesionario", query = "SELECT v FROM Vehiculo v WHERE v.concesionario = :concesionario")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvehiculo")
    private Integer idvehiculo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "a\u00f1o")
    private String año;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "npasajeros")
    private String npasajeros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cilindraje")
    private String cilindraje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fabricacion")
    private String fabricacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "concesionario")
    private String concesionario;

    public Vehiculo() {
    }

    public Vehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public Vehiculo(Integer idvehiculo, String año, String npasajeros, String modelo, String marca, String cilindraje, String fabricacion, String placa, String concesionario) {
        this.idvehiculo = idvehiculo;
        this.año = año;
        this.npasajeros = npasajeros;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.fabricacion = fabricacion;
        this.placa = placa;
        this.concesionario = concesionario;
    }

    public Integer getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getNpasajeros() {
        return npasajeros;
    }

    public void setNpasajeros(String npasajeros) {
        this.npasajeros = npasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(String concesionario) {
        this.concesionario = concesionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvehiculo != null ? idvehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.idvehiculo == null && other.idvehiculo != null) || (this.idvehiculo != null && !this.idvehiculo.equals(other.idvehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Vehiculo[ idvehiculo=" + idvehiculo + " ]";
    }
    
}
