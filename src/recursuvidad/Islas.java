package recursuvidad;

import java.util.Random;

public class Islas {

    static int largo = 5;
    static int ancho = 10;
    static int[][] mapa = new int[largo][ancho];

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        llenarMapa(mapa);
        escribirMatris(mapa);
        buscarIsla(mapa);

    }

    public static void llenarMapa(int[][] mapa) {

        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                mapa[i][j] = 0;
            }
        }

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int fila = random.nextInt(largo);
            int columna = random.nextInt(ancho);
            mapa[fila][columna] = 1;
        }
    }

    public static void escribirMatris(int[][] matris) {
        for (int i = 0; i < largo; i++) {
            System.out.println("");
            for (int j = 0; j < ancho; j++) {
                System.out.print("|" + matris[i][j] + "|");
            }
        }
        System.out.println("");
    }

    public static void buscarIsla(int[][] matris) {
        int isla = 1;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (matris[i][j] == 1) {
                    System.out.print("\nIsla " + isla + "  ");
                    isla++;
                    coordenadas(matris, i, j);
                }
            }

        }
    }

    public static void coordenadas(int[][] matris, int i, int j) {
        System.out.print("|" + i + "," + j + "|");
        matris[i][j] = 0;
// Ezquinas
        if (i == 0 && j == 0) {
            if (matris[i + 1][j] == 1) {
                coordenadas(matris, i + 1, j);
            }
            if (matris[i][j + 1] == 1) {
                coordenadas(matris, i, j + 1);
            }
        } else if (i == 0 && j == ancho - 1) {
            if (matris[i + 1][j] == 1) {
                coordenadas(matris, i + 1, j);
            }
            if (matris[i][j - 1] == 1) {
                coordenadas(matris, i, j - 1);
            }

        } else if (i == largo - 1 && j == 0) {
            if (matris[i - 1][j] == 1) {
                coordenadas(matris, i - 1, j);
            }
            if (matris[i][j + 1] == 1) {
                coordenadas(matris, i, j + 1);
            }
        } else if (i == largo - 1 && j == ancho - 1) {
            if (matris[i - 1][j] == 1) {
                coordenadas(matris, i - 1, j);
            }
            if (matris[i][j - 1] == 1) {
                coordenadas(matris, i, j - 1);
            }
//costados
        } else if (i == 0 && j > 0) {
            if (matris[i + 1][j] == 1) {
                coordenadas(matris, i + 1, j);
            }
            if (matris[i][j + 1] == 1) {
                coordenadas(matris, i, j + 1);
            }
            if (matris[i][j - 1] == 1) {
                coordenadas(matris, i, j - 1);
            }
        } else if (i > 0 && j == 0) {
            if (matris[i + 1][j] == 1) {
                coordenadas(matris, i + 1, j);
            }
            if (matris[i - 1][j] == 1) {
                coordenadas(matris, i - 1, j);
            }
            if (matris[i][j + 1] == 1) {
                coordenadas(matris, i, j + 1);
            }

        } else if (i == largo - 1 && j > 0) {
            if (matris[i - 1][j] == 1) {
                coordenadas(matris, i - 1, j);
            }
            if (matris[i][j + 1] == 1) {
                coordenadas(matris, i, j + 1);
            }
            if (matris[i][j - 1] == 1) {
                coordenadas(matris, i, j - 1);
            }

        } else if (i > 0 && j == ancho - 1) {
            if (matris[i + 1][j] == 1) {
                coordenadas(matris, i + 1, j);
            }
            if (matris[i - 1][j] == 1) {
                coordenadas(matris, i - 1, j);
            }
            if (matris[i][j - 1] == 1) {
                coordenadas(matris, i, j - 1);
            }

// centrales
        } else if (i > 0 && j > 0) {

            if (matris[i + 1][j] == 1) {
                coordenadas(matris, i + 1, j);
            }
            if (matris[i - 1][j] == 1) {
                coordenadas(matris, i - 1, j);
            }
            if (matris[i][j + 1] == 1) {
                coordenadas(matris, i, j + 1);
            }
            if (matris[i][j - 1] == 1) {
                coordenadas(matris, i, j - 1);
            }

        }
    }
}
