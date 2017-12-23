/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Cipher {
 int key;
 int secretKey;
 public Cipher(int secretKey){
     key = secretKey % 26;
     this.secretKey = secretKey;
 }   
    private String replaceCharAt(String s, int i, char c) {
        StringBuffer buf = new StringBuffer(s);
        buf.setCharAt(i, c);
        return buf.toString();
    }
    
    private String encryptLocal(String s, int key) {
     // for (char c : s.toCharArray()) {  // alternative for each loop
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char)('A' + (c - 'A' + key) % 26);
                } else {
                    c = (char)('a' + (c - 'a' + key) % 26);
                }
                s = replaceCharAt(s, i, c);
            }
        }
        return s;
    }
    //this adds the augustus encrypt to the caesar encrypt
    private String otherEncrypt(String s, int key){
        String Key = ""+ key;
              for (int x = 0; x < s.length(); x++) {
                //this creates a loop that moves through the  number once each time
                     int k = Integer.valueOf(Key.substring(x%Key.length(), x%Key.length()+1));
                     char c = s.charAt(x);
                     if (Character.isLetter(c)) {
                     if (Character.isUpperCase(c)) {
                     c = (char)('A' + (c - 'A' + k) %26);
                     } else {
                     c = (char)('a' + (c - 'a' + k) %26);
                      }
                     s = replaceCharAt(s, x, c);
                     }
                  }
             
        return s;
    }
    // this is the reverse of the augustus encrypt
    private String otherDecrypt(String s, int key){
        String Key = ""+ key;
              for (int x = 0; x < s.length(); x++) {
       //this creates a loop with in the number itself to move through the number once each time.
                     int k = Integer.valueOf(Key.substring(x%Key.length(), x%Key.length()+1));
                     
                     char c = s.charAt(x);
                     if (Character.isLetter(c)) {
                     if (Character.isUpperCase(c)) {
                     c = (char)('A' + (c - 'A' + (26 - (k%26))) %26);
                     } else {
                     c = (char)('a' + (c - 'a' +(26 - (k%26))) %26);
                      }
                     s = replaceCharAt(s, x, c);
                     }
                  }
            
        return s;
    }
 public String caesarEncrypt(String s){
     // calling the encrypt method to get it to cipher your message
     return encryptLocal(s, key);
 }
 public String caesarDecrypt(String s){
     // calls the encrypt to reverse the message.
     return encryptLocal(s,26- key);
 }
 public String augustusEncrypt(String s){
     //calls the encrypt of caesar to get first step of Augustus encrypt
     String e = caesarEncrypt(s);
     // creates the second step to get official augustus encrypt
     return otherEncrypt(e, secretKey);
 }
 public String augustusDecrypt(String s){
     //reverses augustus encrypt to what the caesar enccrypt would be at
     String e = otherDecrypt(s,  secretKey );
     // reverses the augustus encrypt to original message
     return caesarDecrypt(e);
 }
}
