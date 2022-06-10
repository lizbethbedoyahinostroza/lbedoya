package edu.ilp.lbedoya.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table(name = "direccion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Direccion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion", length = 10)
    private Long idDireccion;

    @Column(name = "calle", length = 50, nullable = false)
    private String calle;

    @Column(name = "ciudad", length = 50, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 50, nullable = false)
    private String estado;

    @Column(name = "codigopostal", length = 50, nullable = false)
    private String codigopostal;

    @Column(name = "pais", length = 50, nullable = false)
    private String pais;
    

    public Direccion() {
    }

    public Direccion(Long idDireccion, String calle, String ciudad, String estado, String codigopostal, String pais, Persona persona) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;

    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}
