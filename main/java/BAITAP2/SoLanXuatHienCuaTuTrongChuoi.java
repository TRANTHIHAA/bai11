package BAITAP2;

import java.util.*;

public class SoLanXuatHienCuaTuTrongChuoi {
    public static void main(String[] args) {
        String paragraph = "toi ten la Ha";
        System.out.println(paragraph);
        System.out.println("so lan xuat hien cua tu:");
        Map<String,Integer> wordMap = countWords(paragraph);
        for(String key : wordMap.keySet()){
            System.out.println(key + " "+ wordMap.get(key));
        }
    }

    private static void addWord(Map<String,Integer> wordMap, StringBuilder sb){
        String word = sb.toString();
        if (word.length() == 0){
            return;
        }
        if (wordMap.containsKey(word)){
            int count = wordMap.get(word) +1;
            wordMap.put(word,count);
        } else {
            wordMap.put(word,1);
        }
    }

    private static Map<String,Integer> countWords(String paragraph){
        Map<String,Integer> wordMap= new TreeMap<>();
           if (paragraph == null){
               return wordMap;
           }
           int size = paragraph.length();
           StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (paragraph.charAt(i)!= ' ' && paragraph.charAt(i)!= '\t' && paragraph.charAt(i)!= '\n'){
                sb.append(paragraph.charAt(i));
            }else {
                addWord(wordMap,sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordMap, sb);
        return wordMap;

    }
}
