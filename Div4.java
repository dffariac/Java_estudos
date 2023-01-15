public  class Div4 {

   static int contador = 1;

    public static void main (String [] args) {

        while ( contador <=200) {
            if ( contador % 4 == 0) {
                System.out.print("\t" + contador);
                contador = contador + 1;
            }
            else {
                contador = contador + 1;
            }

        }
    }
    
}
