package uts;
import java.util.Scanner;
public class Nomor1 {
    public static void ShellSort(int[]arr){
        int n=arr.length;
        int C,M;
        int jarak,i,j,kondisi;
        boolean Sudah=true;
        int temp;
        C=0;
        M=0;
        jarak=n;
        while (jarak>=1){
            jarak=jarak/2;
            Sudah = true;
            while(Sudah){
                Sudah=false;
                for(j=0;j<n-jarak;j++){
                    i=j+jarak;
                    C++;
                    if(arr[j]>arr[i]){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        Sudah=true;
                    }
                }
            }
        }
    }    
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        System.out.println("Sifa Nuzul Wulan");
        System.out.println();
        int A[]={3, 10, 4, 2, 8, 13};
        Nomor1.tampil(A);
        Nomor1.ShellSort(A);
        Nomor1.tampil(A);  
    
    
        int B [] = {3, 10, 4, 2, 8, 13};
        int cari ;
        int IndeksAwal = 0; // 0
        int IndeksAkhir = B.length-1;
        int ketemu = 0;
        int point = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        cari = scan.nextInt();
        System.out.println();
        
        while ((IndeksAwal <= IndeksAkhir && (ketemu == 0))){
            point = (IndeksAwal + IndeksAkhir) / 2;
            System.out.println("Indeks Pointer : " + point);
            if(cari == B[point]){ 
                ketemu = 1;
                System.out.println("Data " +
                        cari + " Telah ditemukan pada indeks ke - " + point);
            
            }
            else if(cari < B[point]){
                System.out.println("Cari di kiri ");
                IndeksAkhir = point-1;
            }
            else{
                IndeksAwal = point + 1;
                System.out.println("Cari di kanan");
            }
        }  
        if(ketemu == 1)
            System.out.println("Kesimpulan : Data ditemukan");
        else
            System.out.println("Kesimpulan : Data tidak ditemukan");       
        System.out.println("Sifa Nuzul Wulan");
        
    }  
}

