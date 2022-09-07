/* 
Exemplo 1
Wanderlei Malaquias Pereira Junior
*/

public class Ex1 {
    public static void main(String args[]) {
        int y = 100;
        int div = 3;
        int resto;

        for (int x = 0; x < y; x++) {
            resto = x % div;
            if (resto == 0) {
                System.out.println(x);
            }
        }
    }
}