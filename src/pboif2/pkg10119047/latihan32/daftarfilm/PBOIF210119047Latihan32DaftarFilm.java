/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan32.daftarfilm;

import data.Film;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENAMPILKAN DAFTAR FILM YANG SEDANG TAYANG
 */

public class PBOIF210119047Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Daftar Film Sedang Tayang ===");
        
        Film film1 = new Film();
        film1.nama = "Venom";
        film1.genre = "Action, Horror, Scifi";
        film1.rating = 8.5;
        film1.durasi = 120;
        film1.sedangTayang();
        
        Film film2 = new Film();
        film2.nama = "Small Foot";
        film2.genre = "Animation";
        film2.rating = 9.0;
        film2.durasi = 96;
        film2.sedangTayang();
        
        Film film3 = new Film();
        film3.nama = "Crazy Rich Asian";
        film3.genre = "Comedy";
        film3.rating = 7.8;
        film3.durasi = 119;
        film3.sedangTayang();
        
        Film film4 = new Film();
        film4.nama = "Asih";
        film4.genre = "Horror";
        film4.rating = 6.0;
        film4.durasi = 100;
        film4.sedangTayang();
        
    }
    
}
