/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENAMPILKAN DAFTAR FILM YANG SEDANG TAYANG
 */

public class Film {
    public String nama;
    public String genre;
    public double rating;
    public int durasi;
    
    public void sedangTayang(){
        System.out.println();
        System.out.println("Judul Film  : " + this.nama);
        System.out.println("Genre Film  : " + this.genre);
        System.out.println("Rating Film : " + this.rating);
        System.out.println("Duration Film : " + this.durasi + "Menit");
} 
}
