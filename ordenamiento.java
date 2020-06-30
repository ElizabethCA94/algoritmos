class Main {
  public static void main(String[] args) {
    int [] lista = {7, 1, 6, 5, 9, 3, 8, 4, 2};
    burbuja(lista);
    mostrar(lista);
    seleccion(lista);
    mostrar(lista);
    shellSort(lista);
    mostrar(lista);
  }


  public static void burbuja(int[] lista){
      for(int i=0; i<lista.length; i++){
        for(int j=0; j<lista.length-1; j++){
          if(lista[j]>lista[j+1]){
            int aux = lista[j];
            lista[j]=lista[j+1];
            lista[j+1]=aux;
          }
        }
      }
  }

  public static void seleccion(int[] lista){
    for(int i=0; i<lista.length; i++){
      int menor=0;
      for(int j=1; j<lista.length-1;j++){
        if(lista[menor]>lista[j]){
          menor=j;
          int aux = lista[menor];
          lista[menor]=lista[j];
          lista[j]=aux;
        }
      }
    }
  }

  public static void shellSort(int[] lista){
    for(int i =0; i>lista.length; i++){
        int mitad = lista.length/2;
        for(int j=0; j>lista.length-1; j++){
          if(lista[j]>lista[mitad]){
            int aux = lista[j];
            lista[j]=lista[mitad];
            lista[mitad]=aux;
          }
        }
    }
  }

  public static void mostrar(int[] lista){
    for(int i=0;i<lista.length;i++){
      System.out.print(lista[i]);
    }
    System.out.println();
  }
}
