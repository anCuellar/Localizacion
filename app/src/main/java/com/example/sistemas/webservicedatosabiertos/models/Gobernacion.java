package com.example.sistemas.webservicedatosabiertos.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sun.jndi.toolkit.ctx.Continuation;

/**
 * Created by sistemas on 23/10/17.
 */

public class Gobernacion {

    @SerializedName("c_digo_de_habilitaci_n")
    @Expose
    private String cDigoDeHabilitaciN;
    @SerializedName("c_digo_dpto")
    @Expose
    private String cDigoDpto;
    @SerializedName("c_digo_municipio")
    @Expose
    private String cDigoMunicipio;
    @SerializedName("correo_electr_nico")
    @Expose
    private String correoElectrNico;
    @SerializedName("direcci_n")
    @Expose
    private String direcciN;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("nombre_de_sede_o_ps")
    @Expose
    private String nombreDeSedeOPs;
    @SerializedName("tel_fono")
    @Expose
    private String telFono;
    @SerializedName("zona")
    @Expose
    private String zona;

    public String getCDigoDeHabilitaciN() {
        return cDigoDeHabilitaciN;
    }

    public void setCDigoDeHabilitaciN(String cDigoDeHabilitaciN) {
        this.cDigoDeHabilitaciN = cDigoDeHabilitaciN;
    }

    public String getCDigoDpto() {
        return cDigoDpto;
    }

    public void setCDigoDpto(String cDigoDpto) {
        this.cDigoDpto = cDigoDpto;
    }

    public String getCDigoMunicipio() {
        return cDigoMunicipio;
    }

    public void setCDigoMunicipio(String cDigoMunicipio) {
        this.cDigoMunicipio = cDigoMunicipio;
    }

    public String getCorreoElectrNico() {
        return correoElectrNico;
    }

    public void setCorreoElectrNico(String correoElectrNico) {
        this.correoElectrNico = correoElectrNico;
    }

    public String getDirecciN() {
        return direcciN;
    }

    public void setDirecciN(String direcciN) {
        this.direcciN = direcciN;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombreDeSedeOPs() {
        return nombreDeSedeOPs;
    }

    public void setNombreDeSedeOPs(String nombreDeSedeOPs) {
        this.nombreDeSedeOPs = nombreDeSedeOPs;
    }

    public String getTelFono() {
        return telFono;
    }

    public void setTelFono(String telFono) {
        this.telFono = telFono;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }


    public short getIps() {
        return 0;
    }


    public com.sun.jndi.toolkit.ctx.Continuation getModelo() {
        return null;
    }

    public Continuation getPropiedad() {
        return null;
    }

    public Continuation getPlaca() {
        return null;
    }


    public Continuation getMarca() {
        return null;
    }

    public Continuation getTipo() {
        return null;
    }
}

