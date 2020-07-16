public class App {
    public static void main(String[] args) throws Exception {
        int px1=0, py1=0, px2=0, py2=0;
        int mat[][] = new int[4][4];
        inicializar(mat);
    }

    public static void inicializar(int mat[][]){
        int cont=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                mat[i][j]=cont++;
                System.out.print(" "+ mat[i][j]);
            }
            System.out.println(" ");
        }
        
    }

    /*public static boolean factible(int mat[][], int px1, int py1, int camino[]){
        if(px1>=0 && px1<mat.length && py1>=0 && py1<mat.length){
            return 
        }
    }*/

    public static void tablero(int mat[][], int px1, int py1, int px2, int py2, int camino[]){
        if(px1>=0 && px1<mat.length && py1>=0 && py1<mat.length){
            while(px1!=px2 || py1!=py2){
                for(int i=0; i<4; i++){
                    for(int j=0; j<4; j++){
                        int suma= mat[i][j];
                    }
                }
            }
        }

    }

}
