/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Scanner;
/**
 *
 * @author Matt
 */
public class CipherTester {
    public static void main(String[] args){
        Cipher cipher = new Cipher(13);
        System.out.println("Cipher expected:Caesar: Uryyb!, Hello!, Augustus: Vuzbc!, Hello!");
        System.out.println("Actual: ");
        String y = cipher.caesarEncrypt("Hello!");
        System.out.println("Caesar encrypt: " + y);
        String a = cipher.caesarDecrypt(y);
        System.out.println("Caesar decrypt: " +a);
        String s = cipher.augustusEncrypt("Hello!");
        System.out.println("Augustus encrypt: " +s);
        String x = cipher.augustusDecrypt(s);
        System.out.println("Augustus decrypt: " +x);
       /** Cipher code = new Cipher(1257);
        System.out.println(code.augustusDecrypt( "lfh ke jrp FYVwuWlvD ewco wj lzb dsuwpr afwjo bqdffqv);"));
        **/
        Cipher cipherA = new Cipher(1227);//5
        System.out.println("Cipher expected: Caesar: N jfy gfpji lttix.  ,I eat baked goods., "
                + "Augustus: O lmz imqlk mvvpy. ,I eat baked goods. ");
        System.out.println("Actual: ");
        String d = cipherA.caesarEncrypt("I eat baked goods.");
        System.out.println("Caesar Encrypt: " + d);
        String b = cipherA.caesarDecrypt(d);
        System.out.println("Caesar decrypt: " +b);
        String w = cipherA.augustusEncrypt(b);
        System.out.println("Augustus encrypt: " +w);
        String z = cipherA.augustusDecrypt(w);
        System.out.println("Augustus decrypt: " +z);
        
        Cipher cipherB = new Cipher(158);//2
        System.out.println("Cipher expected: Caesar: Vjgug ctg xqygnu: C,g,k,Q,w:),"
                + "These are vowels: A,e,i,O,u:), "
                + "Augustus: Woovl dyo cyzlvv: D,o,p,R,e:) ,These are vowels: A,e,i,O,u:)");
        System.out.println("Actual: ");
        String db = cipherB.caesarEncrypt("These are vowels: A,e,i,O,u:)");
        System.out.println("Caesar Encrypt: " + db);
        String bb = cipherB.caesarDecrypt(db);
        System.out.println("Caesar decrypt: " +bb);
        String wb = cipherB.augustusEncrypt(bb);
        System.out.println("Augustus encrypt: " +wb);
        String zb = cipherB.augustusDecrypt(wb);
        System.out.println("Augustus decrypt: " +zb);
      /**  
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to encrypt your own string? (yes or no): ");
        String u = in.next();
        char ch = u.charAt(0);
        
        if(ch == 'y'){
            System.out.println("What is your key number: ");
            int key = in.nextInt();
            System.out.println("What is your message to encode: ");
            String code = in.nextLine();
            Cipher cipherC = new Cipher(key);
            System.out.println("Caesar encrypt: " + cipherC.caesarEncrypt(code));
            System.out.println("Caesar decrypt: " + cipherC.caesarDecrypt(cipherC.caesarEncrypt(code)));
            System.out.println("Augustus encrypt: " + cipherC.augustusEncrypt(code));
            System.out.println("Augustus decrypt: " + cipherC.augustusDecrypt(cipherC.augustusEncrypt(code)));
            System.out.println("End of program");
        }
        else
            System.out.println("End of program");
            * */
    }
}
