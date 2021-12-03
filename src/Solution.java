
import java.io.*;
import java.util.*;

// Suma Matrius:

/* Donades dues taules numèriques enteres de dimensió n, crea una matriu nova i guarda-hi la seva suma. La suma de les taules s'efectua assignant a cada element de la nova taula la suma dels elements que ocupen la mateix fila i la mateixa columna.

Per exemple: si tenim les dues matrius introduïdes en A i B, i la matriu resultat és C, llavors calcularem la suma de cada posició de la següent manera (exemple per la posició 0,0):

C[0][0] = A[0][0] + B[0][0];
Input Format

Introduïm N i M: enters i donen tamany a la matriu. Introduim els NxM valors enters de la matriu.

Constraints

No n'hi ha.

Output Format

Imprimeix la matriu resultant de sumar les dues matrius anteriors.

Sample Input 0

3 3
1 1 1
2 2 2
3 3 3
3 3
10 10 10
11 11 11
12 12 12
Sample Output 0

11 11 11
13 13 13
15 15 15
Sample Input 1

4 4
1 2 3 4
2 4 5 3
2 3 2 1
2 3 3 4
4 4
100 0 0 0
0 100 0 0
0 0 100 0
0 0 0 100
Sample Output 1

101 2 3 4
2 104 5 3
2 3 102 1
2 3 3 104

 */




public class Solution
{
    public static void main(String[] args)
    {
        int m, n, c, d, m2, n2;
        Scanner in = new Scanner(System.in);

        m = in.nextInt();
        n  = in.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        for (c = 0 ; c < m ; c++)
            for (d = 0 ; d < n ; d++)
                first[c][d] = in.nextInt();
        m2 = in.nextInt();
        n2 = in.nextInt();

        for ( c = 0 ; c < m2 ; c++ )
            for ( d = 0 ; d < n2 ; d++ )
                second[c][d] = in.nextInt();
        for ( c = 0 ; c < m2 ; c++ )
            for ( d = 0 ; d < n2 ; d++ )
                sum[c][d] = first[c][d] + second[c][d];


        for ( c = 0 ; c < m2 ; c++ ) {
            for ( d = 0 ; d < n2 ; d++ )
                System.out.print(sum[c][d]+"\t");
            System.out.println();
        }
    }
}
