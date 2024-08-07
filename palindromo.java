import java.util.*;
public class palindromo {
    public static void main(String[] args) {
        String palavra, inverso = "";
        System.out.println("Digite a palavra:");
        Scanner s = new Scanner(System.in);
        palavra = s.next();
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inverso = inverso+palavra.charAt(i);
        }

        if(palavra.equals(inverso)){
            System.out.println("A palavra '"+palavra+"' é um palindromo");
        }else{
            System.out.println("A palavra '"+palavra+"' não é um palindromo.");
        }
    }
}