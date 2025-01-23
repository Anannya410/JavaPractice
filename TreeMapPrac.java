import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapPrac {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input sentence");

        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        for(String word: words){
            map.put(word.toLowerCase(), map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Number of "+e.getKey()+" in the sentence are: "+e.getValue());
        }

        File myFile = new File("SongFile.txt");
        String lyrics = "";
        try{
            sc = new Scanner(myFile);
            while(sc.hasNext()){
                lyrics = lyrics.concat(sc.nextLine());
                lyrics = lyrics.concat(" ");
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File with name "+myFile.getName()+" not found");
            throw new RuntimeException(e);
        }

        TreeMap<String,Integer> lyricsMap = new TreeMap<>();

        words = lyrics.split(" ");
        for(String word: words){
            lyricsMap.put(word.toLowerCase(), lyricsMap.getOrDefault(word, 0) + 1);
        }

        System.out.println();
        System.out.println("Word count for song "+myFile.getName());
        for(Map.Entry<String, Integer> e: lyricsMap.entrySet()){
            System.out.println("Number of "+e.getKey()+" in the song are: "+e.getValue());
        }
    }
}
