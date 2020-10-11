package com.example.tubes;


public class Tshirt {
    public String namaItem;
    public String detail;
    public String ukuran;
    public int harga;
    public String fotoItem;

    public Tshirt(String namaItem, String detail, String ukuran, int harga, String fotoItem) {
        this.namaItem = namaItem;
        this.detail = detail;
        this.ukuran = ukuran;
        this.harga = harga;
        this.fotoItem = fotoItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getFotoItem() {
        return fotoItem;
    }

    public void setFotoItem(String fotoItem) {
        this.fotoItem = fotoItem;
    }
}
