/*

Cuadro magico

Inteligencia Artificial 


Equipo:
 Miguel Angel Santos Gonzalez
Jose Alejandro Palacios Lopez
Domingo Uriel Mendez Ruiz 

*/



public class Puzzle {

	public static void main(String[] puzzle) {

		int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,0}};
		int[] list = new int[(mat.length * mat[0].length) * 2 ];
		int cont = 0;

		System.out.println("\n A Matriz: \n");
		int x = 0;
		for (int linea = 0; linea < mat.length; linea++) {
			for (int col = 0; col < mat[0].length; col++) {
				if (mat[linea][col] == 0) {
					list[x] = linea + 1;
					x++;
					list[x] = col + 1;
					x++;
				}
				System.out.printf(" %d ", mat[linea][col]);
				cont++;
			}
			System.out.println();
		}

		for (int i = 0; i <= list.length - 1 && list[i] != 0; i = i + 2) {
				for (int y = 0; y < mat.length; y++) {
					mat[y][list[i + 1] - 1] = 0;
					mat[list[i] - 1][y] = 0;
					cont++;
				}
		}

		System.out.println("\nA Matriz  : \n");
		for (int linea = 0; linea < mat.length; linea++) {
			for (int col = 0; col < mat[0].length; col++) {
				if (mat[linea][col] == 0) {
				}
				System.out.printf(" %d ", mat[linea][col]);
			}
			System.out.println();
		}
		System.out.println("\n Número de movimientos " + cont);
	}
}
