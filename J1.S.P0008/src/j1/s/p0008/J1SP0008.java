/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Acer
 */
public class J1SP0008 {
    
    private Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();
    
//    static void countCharacter(String text){
//        
//        Map<Character, Integer> countChar = new HashMap<>();
//        
//        for(int i = 0; i < text.length(); i++){
//            
//            if(Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i))){
//                
//                if(!countChar.containsKey(text.charAt(i))){
//                    countChar.put(text.charAt(i), 1);
//                } else{
//                    
//                    countChar.put(text.charAt(i), countChar.get(text.charAt(i)) + 1);
//                }
//            }
//        }
//        
//        System.out.println(countChar.toString());
//    }
//    
//    static void countWord(String text){
//        
//        String[] textW = text.split(" ");
//        Map<String, Integer> countStr = new HashMap<>();
//        for(String o : textW){
//            if(!o.isEmpty()){
//                if(!countStr.containsKey(o)) {
//                    countStr.put(o, 1);
//                }else{
//                    countStr.put(o, countStr.get(o) + 1);
//                }
//            }
//        }
//        System.out.println(countStr.toString());
//    }
    
    public void analyzeString(String text){
        if(!text.isEmpty()){
            for(char ch : text.toCharArray()){
             if(Character.isSpaceChar(ch)) continue;
                if(!charCounter.containsKey(ch)){
                charCounter.put(ch, 1);
            }else{
                charCounter.put(ch, charCounter.get(ch) + 1);
            }
        }
            
            StringTokenizer tokenizer = new StringTokenizer(text);
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                if(!wordCounter.containsKey(token)){
                    wordCounter.put(token, 1);
                    
                }else{
                    wordCounter.put(token, wordCounter.get(token) + 1);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        J1SP0008 counter = new J1SP0008();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String text = sc.nextLine().toLowerCase().replaceAll("[^A-Za-z\\s]"," ");
        counter.analyzeString(text);
        System.out.println(counter.wordCounter);
        System.out.println(counter.charCounter);
        
        
    }
    
}
