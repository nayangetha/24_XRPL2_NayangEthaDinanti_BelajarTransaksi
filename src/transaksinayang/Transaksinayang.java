/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksinayang;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class Transaksinayang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("<<<<<<<<<<Selamat Datang di Warung Murah>>>>>>>>>>");
        System.out.println("Apakah Anda ingin memesan makanan? (Ya/Tidak)");
        System.out.print("Jawab : ");
        String jawab = input.next();
        System.out.println("");
        
        if(jawab.equalsIgnoreCase("Ya")){
            
            System.out.println("Silahkan Memilih Menu");
            System.out.println("___________________________________________________________________");
            
            String menu[] ={"Sate","Soto","Mie","Bakso","Gorengan"};
            int[]harga = {5000,6000,7000,4000,2000};
            
            for (int i = 0; i <menu.length; i++)
            System.out.println(i+"."+menu[i]+" ---> Rp."+harga[i]);
            
            System.out.println("___________________________________________________________________");
            
            System.out.print("Angka Menu Pilihan : ");
            int pilihan = input.nextInt();
            int jumlah;
            double total;
            
            if(pilihan==0){
                System.out.println("Menu pilihan anda adalah "+menu[0]+" seharga Rp."+harga[0]); 
            } else if(pilihan==1){
                System.out.println("Menu pilihan anda adalah "+menu[1]+" seharga Rp."+harga[1]); 
            } else if(pilihan==2){
                System.out.println("Menu pilihan anda adalah "+menu[2]+" seharga Rp."+harga[2]);
            } else if(pilihan==3){
                System.out.println("Menu pilihan anda adalah "+menu[3]+" seharga Rp."+harga[3]);  
            } else if(pilihan==4){
                System.out.println("Menu pilihan anda adalah "+menu[4]+" seharga Rp."+harga[4]);
            }
        System.out.println("___________________________________________________________________");
        System.out.print("Jumlah Pesanan "+menu[pilihan]+" = ");
        jumlah = input.nextInt();
        
        total = harga[pilihan]*jumlah;
        System.out.println("Total Harga Pembelian "+menu[pilihan]+" = Rp."+total);
        
        System.out.println("Silahkan Lanjutkan Transaksi Anda");
        System.out.println("___________________________________________________________________");
        
        System.out.println("Pesanan = "+menu[pilihan]);
        System.out.println("Harga = "+harga[pilihan]);
        System.out.println("Jumlah Pesanan = "+jumlah);
        System.out.println("Total Pembayaran = "+total);
        System.out.print("Masukkan Uang Anda = Rp.");
        int uang = input.nextInt();
        
        String nama;
            
            if(uang==total){
                
                System.out.println("___________________________________________________________________");
                System.out.println("***************************Nota Pembayaran*************************");

                System.out.print("Nama Pelanggan = ");
                nama = input.next();
                
                System.out.println("Pesanan = "+menu[pilihan]);
                System.out.println("Harga = "+harga[pilihan]);
                System.out.println("Jumlah Pesanan = "+jumlah);
                System.out.println("Total Pembayaran = "+total);
                System.out.println("Tunai = "+uang);
                System.out.println("Kembali = Rp.0");
                System.out.println("*******************Selamat Menikmati Makanan Anda*******************");
            
            }else if(uang>total){
                
                double kembali = uang-total;
                System.out.println("Kembali = Rp."+kembali);
                
                System.out.println("___________________________________________________________________");
                System.out.println("***************************Nota Pembayaran*************************");
               
                System.out.print("Nama Pelanggan = ");
                nama = input.next();
                
                System.out.println("Pesanan = "+menu[pilihan]);
                System.out.println("Harga = "+harga[pilihan]);
                System.out.println("Jumlah Pesanan = "+jumlah);
                System.out.println("Total Pembayaran = "+total);
                System.out.println("Tunai = "+uang);
                System.out.println("Kembali = Rp."+kembali);
                System.out.println("*******************Selamat Menikmati Makanan Anda*******************");
                
            }else if(uang<total){
                
                System.out.println("MAAF UANG ANDA TIDAK CUKUP, SILAHKAN MASUKKAN KEMBALI");
                System.out.print("Masukkan Uang Anda = Rp.");
                uang = input.nextInt();
                       
                if(uang==total){
                       
                       System.out.println("___________________________________________________________________");
                       System.out.println("***************************Nota Pembayaran*************************");
                       
                       System.out.print("Nama Pelanggan = ");
                       nama = input.next();
                       
                       System.out.println("Pesanan = "+menu[pilihan]);
                       System.out.println("Harga = "+harga[pilihan]);
                       System.out.println("Jumlah Pesanan = "+jumlah);
                       System.out.println("Total Pembayaran = "+total);
                       System.out.println("Tunai = "+uang);
                       System.out.println("Kembali = Rp.0");
                       System.out.println("*******************Selamat Menikmati Makanan Anda*******************");
            
                }else if(uang>total){
                       
                       double kembali = uang-total;
                       System.out.println("Kembali = Rp."+kembali);
                       
                       System.out.println("___________________________________________________________________");
                       System.out.println("***************************Nota Pembayaran*************************");
                       
                       System.out.print("Nama Pelanggan = ");
                       nama = input.next();
                       
                       System.out.println("Pesanan = "+menu[pilihan]);
                       System.out.println("Harga = "+harga[pilihan]);
                       System.out.println("Jumlah Pesanan = "+jumlah);
                       System.out.println("Total Pembayaran = "+total);
                       System.out.println("Tunai = "+uang);
                       System.out.println("Kembali = Rp."+kembali);
                       System.out.println("*******************Selamat Menikmati Makanan Anda*******************");
            }
            
        }   
        }else if(jawab.equalsIgnoreCase("Tidak")){
            System.out.println("Silahkan Datang Kembali Lain Waktu");
        }      
    }
}
    

        
    

                
        

