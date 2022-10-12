/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Lucas
 */
public class Computador {
    
    private String idComputador;
    private String Tipo;
    private String Empresa;
    private String Sala;
    private boolean HD;
    private boolean PlacaMae;
    private boolean PlacaVideo;
    private boolean PlacaRede;
    private boolean Drive;
    private boolean Fonte;
    private boolean RAM;
    private boolean Processador;

    public String getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(String idComputador) {
        this.idComputador = idComputador;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }

    public boolean getHD() {
        return HD;
    }

    public void setHD(boolean HD) {
        this.HD = HD;
    }

    public boolean getPlacaMae() {
        return PlacaMae;
    }

    public void setPlacaMae(boolean PlacaMae) {
        this.PlacaMae = PlacaMae;
    }

    public boolean getPlacaVideo() {
        return PlacaVideo;
    }

    public void setPlacaVideo(boolean PlacaVideo) {
        this.PlacaVideo = PlacaVideo;
    }

    public boolean getPlacaRede() {
        return PlacaRede;
    }

    public void setPlacaRede(boolean PlacaRede) {
        this.PlacaRede = PlacaRede;
    }

    public boolean getDrive() {
        return Drive;
    }

    public void setDrive(boolean Drive) {
        this.Drive = Drive;
    }

    public boolean getFonte() {
        return Fonte;
    }

    public void setFonte(boolean Fonte) {
        this.Fonte = Fonte;
    }

    public boolean getRAM() {
        return RAM;
    }

    public void setRAM(boolean RAM) {
        this.RAM = RAM;
    }

    public boolean getProcessador() {
        return Processador;
    }

    public void setProcessador(boolean Processador) {
        this.Processador = Processador;
    }
    
    
    
}
