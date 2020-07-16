public class App {
    public final static int INF = 9999;
    public static void main(String[] args) throws Exception {
        int numCalorias=6;
        int numPlatos[] = { 3,5,10,20};
        int caloriasAConsumir=17;
        int matrizCalorias[][] = new int[numCalorias][caloriasAConsumir];
        devolverCalorias(matrizCalorias, numPlatos, numCalorias, caloriasAConsumir);
        mostrar(matrizCalorias, numPlatos, numCalorias, caloriasAConsumir);
    }   


    public static void devolverCalorias(int matrizCalorias[][], int numPlatos[], int numCalorias, int caloriasAConsumir){
        for(int i=0; i<numCalorias; i++){
            matrizCalorias[i][0]=0;
        }
        for(int i=1; i<numCalorias; i++){
            for(int j=1; j<caloriasAConsumir; j++){
                if(i==1 && j < numPlatos[i]){
                    matrizCalorias[i][j] = INF;
                }
                else if(i>1 && j < numPlatos[i]){
                    matrizCalorias[i][j] = matrizCalorias[i-1][j];
                }
                else if(i==1 && j >= numPlatos[i]){
                    matrizCalorias[i][j] = 1 + matrizCalorias[i][j-numPlatos[i]];
                }
                else{
                    matrizCalorias[i][j] = minimo(1 + matrizCalorias[i][j-numPlatos[i]], matrizCalorias[i-1][j]);
                }
            }
        }
    }


    public static int minimo(int a, int b){
        if(a<b)
            return a;
        else
            return b;
    }

    public static void mostrar(int matrizCalorias[][], int numPlatos[], int numCalorias, int caloriasAConsumir){
        for (int i = 0; i < numCalorias; i++) {
            for (int j = 0; j < caloriasAConsumir; j++) {
                System.out.print(matrizCalorias[i][j]+" ");

            }
            System.out.println("");
        } 
        System.out.println("la cantidad de calorias mínima que se puede consumir es: " + matrizCalorias[numCalorias-1][caloriasAConsumir-1]);
    }
}
