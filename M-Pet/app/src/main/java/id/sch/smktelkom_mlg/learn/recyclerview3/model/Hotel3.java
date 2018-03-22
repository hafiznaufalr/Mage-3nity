package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

public class Hotel3 implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;
    public String baru;

    public Hotel3(String judul, String deskripsi, String detail, String lokasi, String foto,String baru) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
        this.baru = baru;
    }
}