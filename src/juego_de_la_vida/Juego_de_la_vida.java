
package juego_de_la_vida;


/**
 *
 * @author Sebastian Baldion
 */
public class Juego_de_la_vida {

    public static void main(String[] args) {

        int N = 100;
        int M[][] = new int[N][N];
        int Contador;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }
        while (true) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    Contador = M[(i - 1 + N) % N][(j - 1 + N) % N] + M[(i - 1 + N) % N][j] + M[(i - 1 + N) % N][(j + 1) % N] 
                               + M[i][(j - 1 + N) % N] + M[i][(j + 1) % N] + M[(i + 1) % N][(j - 1 + N) % N] + M[(i + 1) % N][j]
                               + M[(i + 1) % N][(j + 1) % N];
                    if (M[i][j] == 1) {
                        if (Contador > 3 || Contador < 2) {
                            M[i][j] = 0;
                        } else {
                            if (Contador == 3) {
                                M[i][j] = 1;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
