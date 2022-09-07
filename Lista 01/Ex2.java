/* 
Exemplo 1
Wanderlei Malaquias Pereira Junior
*/

public class Ex2 {
    public static void main(String args[]) {
        int y = 10;
        int fatorial;

        for (int x = 1; x < y + 1; x++) {
            fatorial = 1;
            for (int m = x; m > 0; m--) {
                fatorial *= m;  
            }
            System.out.println("Fatorial de " + x + " é " + fatorial);
        }
    }
}