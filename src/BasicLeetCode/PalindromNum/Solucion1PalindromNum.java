package BasicLeetCode.PalindromNum;

public class Solucion1PalindromNum {
    public static void main (String [] args) {
       int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {

        if (x < 0) { // si es menor que 0 no es un palindromo nunca ya que esta el simbolo
                        // - delante
            return false;
        }
        int original = x;// el número introducido
        int reversed = 0;// inicializamos la vuelta del numero
        while (x != 0) {
            int lastDigit = x % 10;// si divides un numero entre 10 el resto de la division
                                    // va a ser la ultima cifra
            reversed = reversed * 10 + lastDigit;// al multiplicar * 10 vas consiguiendo que se mueva el digito
            x /= 10;
        }
        return original == reversed;
    }
}
