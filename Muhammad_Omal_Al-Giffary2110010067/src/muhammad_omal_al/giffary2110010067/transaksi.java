package muhammad_omal_al.giffary2110010067;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Horizz
 */
import java.util.Date;

public class transaksi {
    
    private int id_transaksi;
    private barang barang;
    private kasir kasir;
    private pelanggan pelanggan;
    private Date tanggal_transaksi;
    private int jumlah_barang;
    private double total_harga;

    public transaksi(int id_transaksi, barang barang, kasir kasir, pelanggan pelanggan,
                     Date tanggal_transaksi, int jumlah_barang, double total_harga) {
        this.id_transaksi = id_transaksi;
        this.barang = barang;
        this.kasir = kasir;
        this.pelanggan = pelanggan;
        this.tanggal_transaksi = tanggal_transaksi;
        this.jumlah_barang = jumlah_barang;
        this.total_harga = total_harga;
    }

    // Getter and Setter methods

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public barang getbarang() {
        return barang;
    }

    public void setbarang(barang barang) {
        this.barang = barang;
    }

    public kasir getkasir() {
        return kasir;
    }

    public void setkasir(kasir kasir) {
        this.kasir = kasir;
    }

    public pelanggan getpelanggan() {
        return pelanggan;
    }

    public void setpelanggan(pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Date gettanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void settanggal_transaksi(Date tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }
    
}
