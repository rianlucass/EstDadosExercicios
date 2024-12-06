package ifma.lista02;

public class Matriz {
    public static void main(String[] args) {
        q01();
        System.out.println("-------");
        q02();
        System.out.println("-------");
        q03();
        System.out.println("-------");
        q04();
        System.out.println("-------");
        q05();
        System.out.println("-------");
        q06();
        System.out.println("-------");
        q07();
        System.out.println("-------");
        q08();
        System.out.println("-------");
        q09();
        System.out.println("-------");
        q10();
        System.out.println("-------");
        q11();
        System.out.println("-------");
        q12();
        System.out.println("-------");
        q13();
        System.out.println("-------");
        q14();
        System.out.println("-------");
        q15();
        System.out.println("-------");
        q16();
        System.out.println("-------");
        q17();
        System.out.println("-------");
        q18();

    }

    public static int[][] matriz() {
        return new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    public static void q01() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q02() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j == mat.length - 1) {
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q03() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j == mat.length - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q04() {
        int[][] mat = matriz();
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j == mat.length - 1) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal secundária: " + soma);
    }

    public static void q05() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j >= mat.length - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q06() {
        int[][] mat = matriz();
        int soma = 0, contador = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j >= mat.length - 1) {
                    soma += mat[i][j];
                    contador++;
                }
            }
        }
        double media = (double) soma / contador;
        System.out.printf("Média dos elementos: %.1f%n", media);
    }

    public static void q07() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j > mat.length - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q08() {
        int[][] mat = matriz();
        int maior = 0;
        boolean primeiroValor = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j > mat.length - 1) {
                    if (primeiroValor) {
                        maior = mat[i][j];
                        primeiroValor = false;
                    } else if (mat[i][j] > maior) {
                        maior = mat[i][j];
                    }
                }
            }
        }
        System.out.println("Maior valor abaixo da diagonal secundária: " + maior);
    }

    public static void q09() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j <= mat.length - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q10() {
        int[][] mat = matriz();
        int menor = 0;
        boolean primeiroValor = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j <= mat.length - 1) {
                    if (primeiroValor) {
                        menor = mat[i][j];
                        primeiroValor = false;
                    } else if (mat[i][j] < menor) {
                        menor = mat[i][j];
                    }
                }
            }
        }
        System.out.println("Menor valor da diagonal secundária e acima: " + menor);
    }

    public static void q11() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j < mat.length - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q12() {
        int[][] mat = matriz();
        int produto = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j < mat.length - 1) {
                    produto *= mat[i][j];
                }
            }
        }
        System.out.println("Produto dos elementos acima da diagonal secundária: " + produto);
    }

    public static void q13() {
        int[][] mat = matriz();
        int[][] b = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0) {
                    b[i][j] = mat[i][j] * mat[i][j];
                } else {
                    b[i][j] = mat[i][j] * mat[i][j] * mat[i][j];
                }
            }
        }
        for (int[] linha : b) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void q14() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        int[][] rotacionada = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                rotacionada[j][tamanho - 1 - i] = mat[i][j];
            }
        }
        for (int[] linha : rotacionada) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void q15() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        int[][] rotacionada = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                rotacionada[tamanho - 1 - i][tamanho - 1 - j] = mat[i][j];
            }
        }
        for (int[] linha : rotacionada) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void q16() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        int[][] rotacionada = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                rotacionada[tamanho - 1 - j][i] = mat[i][j];
            }
        }
        System.out.println("Matriz rotacionada 270°:");
        for (int[] linha : rotacionada) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void q17() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        System.out.println("Elementos destacados:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j || i + j == tamanho - 1 || (i == 1 && j == 1)) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public static void q18() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int linhas = mat.length;
        int colunas = mat[0].length;
        int[][] transposta = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = mat[i][j];
            }
        }
        System.out.println("Matriz Transposta:");
        for (int[] linha : transposta) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }



}
