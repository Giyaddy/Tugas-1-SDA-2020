import java.util.*;

public class Tugas1{

    private ArrayList<String> words;

    public Tugas1(){
       words = new ArrayList<>();
    }

    public void acakKata(){
        Collections.shuffle(words);
    }

    public void masukkanKata(String kata){
        words.add(kata);
    }

    //method pengurutan gelembung
    public void bubbleSort(){

        for (int i=0; i<words.size(); i++){
            for (int j=i+1; j<words.size(); j++){
                if ((words.get(i)).compareTo(words.get(j)) > 0){ //tanda > jika diurutkan secara menaik, < untuk menurun
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }
        for (int i=0; i<words.size(); i++){
            System.out.println(words.get(i));
        }
    }

    public void insertionSort(){
        for (int i=1; i<words.size(); i++){
            String temp = words.get(i);
            int j = i-1;

            while (j>=0 && temp.compareTo(words.get(j)) >= 0){
                words.set(j+1, words.get(j));
                j=j-1;
            }
            words.set(j+1, temp);
        }
        for (int i=0; i<words.size(); i++){
            System.out.println(words.get(i));
        }
    }
}