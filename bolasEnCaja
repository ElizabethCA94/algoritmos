 public static void main(final String[] args) throws Exception {
        /*
         * Distribuya N bolas negras entre 10 cajas para que cada dos cajas tengan un
         * número diferente de bolas (puede poner 0 bolas en alguna caja si lo desea).
         */ 
         int cajas[] = {0,0,0,0,0,0,0,0,0,0}; int numeroBolas= 135;
         sumatoria(numeroBolas, cajas); 
         mostrar(cajas);
         }
         public static void sumatoria(final int numeroBolas, final int cajas[]) {
              int i;
              int inicial = 0;
              if (numeroBolas >= inicial) {
                  int suma = 0;
                  for (i = 0; i < cajas.length; i++) {
                      inicial += i;
                      if (i == cajas.length - 1) {
                          cajas[i] = numeroBolas - suma;

                      } else {
                          cajas[i] = i;
                          suma += cajas[i];
                      }
                  }
              }
          }

          public static void mostrar(final int cajas[]) {
              for (int x = 0; x <= cajas.length; x++)
                  System.out.println(cajas[x]);
          }
 }
