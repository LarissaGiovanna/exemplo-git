public class palindromoFrase {
    public static void main(String[] args) {
        String frase="a sacada da casa", inverso = "", fraseInvertida="";
        // System.out.println("Digite a frase:");
        // Scanner s = new Scanner(System.in);
        // frase = s.nextLine();
        System.out.println(frase);
        String[] fraseSeparada = frase.split("");
        // System.out.println(fraseSeparada);

        for (String item : fraseSeparada) {
            System.out.println(item);
            inverso += item;
        }
        for (int i = frase.length() - 1; i <= 0; i--) {
            inverso.charAt(i);
            fraseInvertida +=inverso.charAt(i);
        }

        if (fraseInvertida.equals(frase)) {
            System.out.println("A frase '" + frase + "' é um palindromo");
        } else {
            System.out.println("A frase '" + frase + "' não é um palindromo.");
        }

        // for (int i = 0; i < frase.length(); i++) {
        // System.out.println(fraseSeparada[i]);
        // for (int j = fraseSeparada[i].length() - 1; j >= 0; j--) {
        // inverso = inverso + frase.charAt(j);
        // System.out.println(inverso);
        // }
        // }

    }
}