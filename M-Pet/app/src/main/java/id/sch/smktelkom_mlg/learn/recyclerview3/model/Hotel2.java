package id.sch.smktelkom_mlg.learn.recyclerview3.model;


import java.io.Serializable;

/**
 * Created by Mokleters on 31/10/2016.
 */
public class Hotel2 implements Serializable {
    public String judul2;
    public String deskripsi2;
    public String detail2;
    public String lokasi2;
    public String foto2;

    public Hotel2(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul2 = judul;
        this.deskripsi2 = deskripsi;
        this.detail2 = detail;
        this.lokasi2 = lokasi;
        this.foto2 = foto;

    }
}