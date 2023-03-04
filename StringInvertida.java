public class StringIvertida {
    public static void main(String[] args) {
        String palavra = "exemplo"; // string a ser invertida
        String resultado = ""; // string que armazenará a palavra invertida

        for (int i = palavra.length() - 1; i >= 0; i--) {
            resultado += palavra.charAt(i);
        }

        System.out.println(resultado);
    }
}
