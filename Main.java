import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
    
        String fileName = "words.txt" ;
        Tugas1 listKata = new Tugas1();
        TimeInterval timer = new TimeInterval(); //import class TimeInterval untuk hitung waktu

        System.out.println("Sedang memuat file. Harap tunggu...");
        try{
            // membaca file
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);
            
            // baca isi file
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                listKata.masukkanKata(data); //masukkan data disini
            }
        }catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
        
        timer.startTiming();
        listKata.bubbleSort();
        timer.endTiming();
        System.out.println("\nWaktu eksekusi Bubble Sort : "+timer.getElapsedTime()+" detik\n");

        listKata.acakKata();

        timer.startTiming();
        listKata.insertionSort();
        timer.endTiming();
        System.out.println("\nWaktu eksekusi Insertion Sort : "+timer.getElapsedTime()+" detik\n");



    }

}