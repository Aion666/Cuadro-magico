/*

Cuadro magico

Inteligencia Artificial 


Equipo:
 Miguel Angel Santos Gonzalez
Jose Alejandro Palacios Lopez
Domingo Uriel Mendez Ruiz 

*/
 


public class Matriz {
	
    public static void main(String[] puzzle) {
    	
        int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,0}};
        int[][] found = new int[mat.length * mat[0].length][];
        int f = -1;
        int cont = 0 ;
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                System.out.print(String.format(" %s ",mat[i][j]));
            }
            System.out.println();
        }
		
        for(f = 0; f < found.length && found[f] != null; f++) {
            for(int linea1 = 0; linea1 < mat[found[f][0]].length; linea1++) {
                mat[found[f][0]][linea1] = 0;
                cont++;
            }
            for(int linea = 0; linea < mat.length; linea++) {
                mat[linea][found[f][1]] = 0;
                cont++;
            }
        }
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
               if(mat[i][j] == 0) {
                   found[++f] = new int[]{i, j};
               }
               cont++;
            }
        }
        
        System.out.println("\n Número de movimientos " + cont );
    }
}
