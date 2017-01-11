package p401;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    private static final Map VEREDICTS = new HashMap();
    private static final Map MIRROR = new HashMap();
    
    private static void addMirror(char c1, char c2) {
        MIRROR.put(c1, c2);
        MIRROR.put(c2, c1);
    }
    private static void addMirror(char c) {
        addMirror(c, c);
    }
    
    static {
        VEREDICTS.put("falsefalse", "not a palindrome");
        VEREDICTS.put("falsetrue", "a mirrored string");
        VEREDICTS.put("truefalse", "a regular palindrome");
        VEREDICTS.put("truetrue", "a mirrored palindrome");
        
        addMirror('A');
        addMirror('E', '3');
        addMirror('H');
        addMirror('I');
        addMirror('J', 'L');
        addMirror('M');
        addMirror('O');
        addMirror('S', '2');
        addMirror('T');
        addMirror('U');
        addMirror('V');
        addMirror('W');
        addMirror('X');
        addMirror('Y');
        addMirror('Z', '5');
        addMirror('1');
        addMirror('8');

    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String linha;
        
        while ( (linha = in.readLine()) != null ) {
            boolean isPalindrome = true;
            boolean isMirrored = true;
            for (int i = 0, j = linha.length() - 1; i <= j; i++, j--) {
                char c1 = linha.charAt(i);
                char c2 = linha.charAt(j);
                if (c1 != c2) {
                    isPalindrome = false;
                }
                Character mirror = (Character) MIRROR.get(c1);
                if (mirror == null || mirror.charValue() != c2) {
                    isMirrored = false;
                }
            }

            String key = String.valueOf(isPalindrome) + String.valueOf(isMirrored);
            
            System.out.println(linha + " -- is " + VEREDICTS.get(key) + ".\n");
        }
        
    }


}
