package com.example.a207_1.myapplication;

/**
 * Created by 207-1 on 11/12/2017.
 */

public class Buku {
    private String id_buku;
    private String judul;
    private String author;
    private String publisher;

    private String[][] data = new String[][] {
            {"bk1","Java Skript","Mohammad Sofyan","KHARISMA Publishing"},
            {"bk2","Belajar Coding","James burn","Anggara Publishing"}
    };

    public Buku (String id_buku){
        this.id_buku = id_buku;
        this.login();
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
        this.login();
    }

    private void login() {
        for (int i = 0; i < this.data.length; i++) {
            if (this.id_buku.equals(this.data[i][0])) {
                this.judul = this.data[i][1];
                this.author = this.data[i][2];
                this.publisher = this.data[i][3];
            }

        }
    }

    public String getId_buku() {
        return id_buku;

    }



    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
