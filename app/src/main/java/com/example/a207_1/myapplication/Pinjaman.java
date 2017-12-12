package com.example.a207_1.myapplication;

/**
 * Created by 207-1 on 11/12/2017.
 */

public class Pinjaman {
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;
    private String id_members;
    private String id;

    private String[][] data = new String[][] {
            {"0001","05 Desember 2017","12 Desember 2017","bk1"},
            {"0002","20 Desember 2017","25 Desember 2017","bk2"}
    };

    public Pinjaman(String id_members) {
        this.id_members = id_members;
        this.login();
    }

    private void login() {
        for (int i = 0; i < this.data.length; i++) {
            if (this.id_members.equals(this.data[i][0])) {
                this.tanggalPinjam = this.data[i][1];
                this.tanggalKembali = this.data[i][2];
                this.buku = new Buku(data[i][3]);
                this.id ="1";
                break;
            }else {
                this.id = "0";
            }

        }
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getId_members() {
        return id_members;
    }

    public void setId_members(String id_members) {
        this.id_members = id_members;
    }


    //tambahan

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
