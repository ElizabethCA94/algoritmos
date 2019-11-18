#include <stdio.h>

#define MAX 20
#define INF 99999
typedef int Matriz[MAX][MAX];

void iniciar(Matriz mat)
{
    for (int i = 0; i < MAX; i++)
    {
        mat[i][0] = 0;
    }
}
void obtener(int objetos[], int numeroObjetos, int tamanoMochila, Matriz mat, int valores[])
{
    for (int i = 0; i < numeroObjetos; i++)
    {
        for (int j = 1; j <= tamanoMochila; j++)
        {
            if (objetos[i] > j && i == 0)
            {
                mat[i][j] = INF;
            }
            else if (i == 0)
            {
                mat[i][j] = valores[i];
            }
            else if (objetos[i] > j)
            {
                mat[i][j] = mat[i - 1][j];
            }
            else
            {
                if (mat[i - 1][j] > (mat[i - 1][j - objetos[i]] + valores[i]))
                {
                    mat[i][j] = mat[i - 1][j];
                }
                else
                {
                    mat[i][j] = mat[i - 1][j - objetos[i]] + valores[i];
                }
            }
        }
    }
}

void mostrar(Matriz mat, int tamanoMochila, int numObjetos)
{
    for (int i = 0; i < numObjetos; i++)
    {
        printf("%d", i + 1);
        for (int j = 0; j < tamanoMochila; j++)
        {
            printf("%10d", mat[i][j]);
        }
    }
}

int main()
{
    Matriz mat;
    int objetos[] = {1, 4, 3, 1}, numObjetos = 4;
    int valores[] = {1500, 3000, 2000, 2000};
    int tamanoMochila = 4;
    iniciar(mat);
    obtener(objetos, numObjetos, tamanoMochila, mat, valores);
    mostrar(mat, tamanoMochila, numObjetos);
}
