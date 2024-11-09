package juegogato;

/**
 * Clase con elementos necesarios para crear un juego del gato, en dónde el
 * usuario puede jugar contra la computadora.
 */
import java.util.Random;
import java.util.Scanner;

public class Gato {

    private int renglon;
    private int columna;
    private final char x = 'x';
    private final char o = 'o';
    private Random r = new Random();
    private char[][] tablero = new char[5][5];

    /**
     * Constructor por omisión de la clase Gato , que inicializa la matriz
     *
     */
    public Gato() {

        for (int i = 0; i < 5; i++) {
            tablero[1][i] = '-';
        }
        for (int i = 0; i < 5; i++) {
            tablero[3][i] = '-';
        }
        tablero[0][1] = '|';
        tablero[2][1] = '|';
        tablero[0][3] = '|';
        tablero[2][3] = '|';
        tablero[4][1] = '|';
        tablero[4][3] = '|';

    }

    /**
     * Metodo para elegir de manera aleatoria la columna
     * @return int - La eleccion hecha por la computadora
     */
    public int columnaAleatoria() {

        columna = r.nextInt(3);
        if (columna == 0) {
            columna = 1;
        } else if (columna == 1) {
            columna = 2;
        } else {
            columna = 3;
        }
        return columna;

    }

    /**
     * Metodo para elegir de manera aleatoria el renglón
     * @return int - La elección hecha por la computadora
     */
    public int renglonAleatorio() {

        renglon = r.nextInt(3);

        if (renglon == 0) {
            renglon = 1;
        } else if (renglon == 1) {
            renglon = 2;
        } else {
            renglon = 3;
        }
        return renglon;

    }

    /**
     * Método que nos dice si la computadora ganó, es decir si hizo un tres en
     * raya.
     * @param char - el arma elegida por la computadora
     * @return boolean - true si gano o false en otro caso
     */
    public boolean ganaCompu(char a) {
        if (a == tablero[0][0] && a == tablero[0][2] && a == tablero[0][4]) {
            return true;
        } else if (a == tablero[2][0] && a == tablero[2][2] && a == tablero[2][4]) {
            return true;
        } else if (a == tablero[4][0] && a == tablero[4][2] && a == tablero[4][4]) {
            return true;
        } else if (a == tablero[0][0] && a == tablero[2][0] && a == tablero[4][0]) {
            return true;
        } else if (a == tablero[0][2] && a == tablero[2][2] && a == tablero[4][2]) {
            return true;
        } else if (a == tablero[0][4] && a == tablero[2][4] && a == tablero[4][4]) {
            return true;
        } else if (a == tablero[0][0] && a == tablero[2][2] && a == tablero[4][4]) {
            return true;
        } else if (a == tablero[0][4] && a == tablero[2][2] && a == tablero[4][0]) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que nos dice si el usuario gano
     *
     * @param char - el arma elegida por el usuario
     * @return boolean - true si gano o false en otro caso
     */
    public boolean ganaUsuario(char a) {
        if (a == tablero[0][0] && a == tablero[0][2] && a == tablero[0][4]) {
            return true;
        } else if (a == tablero[2][0] && a == tablero[2][2] && a == tablero[2][4]) {
            return true;
        } else if (a == tablero[4][0] && a == tablero[4][2] && a == tablero[4][4]) {
            return true;
        } else if (a == tablero[0][0] && a == tablero[2][0] && a == tablero[4][0]) {
            return true;
        } else if (a == tablero[0][2] && a == tablero[2][2] && a == tablero[4][2]) {
            return true;
        } else if (a == tablero[0][4] && a == tablero[2][4] && a == tablero[4][4]) {
            return true;
        } else if (a == tablero[0][0] && a == tablero[2][2] && a == tablero[4][4]) {
            return true;
        } else if (a == tablero[0][4] && a == tablero[2][2] && a == tablero[4][0]) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que nos llena una casilla del tablero con el arma elegida
     *
     * @param a - un caracter que indica el tipo de arma
     * @param r - un int que indica el numero de renglon
     * @param c- un int que indica el numero de columna
     */
    public void tiro(char a, int r, int c) {
        if (r == 1) {
            r = 0;
            if (c == 1) {
                c = 0;
            } else if (c == 3) {
                c = 4;
            } else {
            }
            tablero[r][c] = a;
        } else if (r == 3) {
            r = 4;
            if (c == 1) {
                c = 0;
            } else if (c == 3) {
                c = 4;
            } else {
            }
            tablero[r][c] = a;
        } else {
            if (c == 1) {
                c = 0;
            } else if (c == 3) {
                c = 4;
            } else {
            }
            tablero[r][c] = a;
        }

    }

    /**
     * Metodo que nos dice si el tablero ya esta lleno
     *
     * @return boolean - true si los nueve casillas del tablero donde puedes
     * tirar estan ocupados false en otro caso
     */
    public boolean estaLleno() {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tablero[j][i] == x || tablero[j][i] == o || tablero[j][i] == '|' || tablero[j][i] == '-') {
                    contador = contador + 1;
                } else {
                }
            }
        }
        if (contador == 25) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Metodo que nos dice si una casilla del gato esta ocupada
     *
     * @param r - el renglón o fila
     * @param c - la columna
     * @return boolean - true si la casilla ya esta ocupada false en otro caso
     */
    public boolean estaOcupada(int r, int c) {
        if (r == 1) {
            r = 0;
            if (c == 1) {
                c = 0;
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            } else if (c == 3) {
                c = 4;
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            }
        } else if (r == 3) {
            r = 4;
            if (c == 1) {
                c = 0;
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            } else if (c == 3) {
                c = 4;
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            if (c == 1) {
                c = 0;
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            } else if (c == 3) {
                c = 4;
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (tablero[r][c] == x || tablero[r][c] == o) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

    /**
     * Metodo que imprime el tablero como una cadena
     *
     * @return String - el tablero en formato de cadena
     */
    public String toString() {
        String tableron = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                tableron += tablero[i][j];

            }
            tableron += "\n";
        }
        return tableron;
    }
    
    
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        char arma;
        char armac;
        int columna;
        int renglon;
        int victoriasCp = 0;
        int victoriasUs = 0;
        int empates = 0;
        boolean ganoUser = false;
        boolean ganoCompu = false;
        boolean lleno;
        String opcion;
        String aux;

        do {
            Gato gato = new Gato();
            do {
                System.out.print("Escoge \"x\" ó \"o\" para tirar:  ");
                aux = t.next();
            } while (aux.equals("x") == false && aux.equals("o") == false);

            arma = aux.charAt(0);

            if (arma == 'x' || arma == 'X' ) {
                armac = 'o';
            } else {
                armac = 'x';
            }

            System.out.println(gato);
            do {
                do {
                    do {
                        System.out.print("\nEscriba la COLUMNA dónde desea tirar: ");
                        columna = t.nextInt();
                    } while (columna < 1 || columna > 3);

                    do {
                        System.out.print("\nEscriba el RENGLÓN dónde desea tirar: ");
                        renglon = t.nextInt();
                    } while (renglon < 1 || renglon > 3);

                } while (gato.estaOcupada(renglon, columna) == true);

                gato.tiro(arma, renglon, columna);
                System.out.println(gato);
                ganoUser = gato.ganaUsuario(arma);
                lleno = gato.estaLleno();

                if (lleno == true || ganoUser == true) {
                } else {
                    System.out.println("\nTurno de la computadora");

                    do {
                        columna = gato.columnaAleatoria();
                        renglon = gato.renglonAleatorio();
                    } while (gato.estaOcupada(renglon, columna) == true);

                    gato.tiro(armac, renglon, columna);

                    System.out.println(gato);
                    ganoCompu = gato.ganaCompu(armac);
                    lleno = gato.estaLleno();
                }

            } while (ganoCompu == false && ganoUser == false && lleno == false);

            if (ganoUser == true) {
                System.out.println("Has ganado el juego");
                victoriasUs = victoriasUs + 1;
            } else if (ganoCompu == true) {
                System.out.println("La computadora ha ganado el juego.");
                victoriasCp = victoriasCp + 1;
            } else {
                System.out.println("Nadie ganó. Empate");
                empates = empates + 1;
            }

            System.out.println("¿Deseas seguir jugando? (s/n).");
            opcion = t.next();
        } while (opcion.equals("n") == false);

        System.out.println("Estadísticas de los juegos");
        System.out.println("----------------------------");
        int noJuegos = empates + victoriasCp + victoriasUs;
        System.out.println("Total de juegos: " + noJuegos + ".");
        System.out.println("Juegos ganados por el usuario: " + victoriasUs + ".");
        System.out.println("Juegos ganados por la computadora: " + victoriasCp + ".");
        System.out.println("Empates: " + empates + ".");
      
        

    }

}
