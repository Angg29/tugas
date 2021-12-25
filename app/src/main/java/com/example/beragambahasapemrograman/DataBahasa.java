package com.example.beragambahasapemrograman;

public class DataBahasa {
    private String nama, deskripsi, logo, contohKode, readMore;
    public  DataBahasa(String nama, String deskripsi, String readMore, String contohKode, String logo){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.readMore = readMore;
        this.contohKode = contohKode;
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getReadMore() {
        return readMore;
    }

    public void setReadMore(String readMore) {
        this.readMore = readMore;
    }

    public String getContohKode() {
        return contohKode;
    }

    public void setContohKode(String contohKode) {
        this.contohKode = contohKode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
