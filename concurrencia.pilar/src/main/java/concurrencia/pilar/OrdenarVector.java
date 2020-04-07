package concurrencia.pilar;

import java.util.Random;

public class OrdenarVector {

	public static int Ordenar(int[] vector, int inicio, int fin) {
		int numOperBasicas = 0;
		for (int i = inicio; i < fin; i++) {
			for (int j = i + 1; j < fin; j++) {
				if (vector[i] > vector[j]) {
					numOperBasicas++;
					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
		return numOperBasicas;

	}

	public static void main(String[] args) {
		int[] vector = new int[100000];
		Random r = new Random(5);
		for (int i = 0; i < vector.length; i++) {
			vector[i] = r.nextInt(50000);
		}

		//System.out.println("Vector desordenado: ");
		//for (int i = 0; i < vector.length; i++) {
		//	System.out.print(vector[i] + " ");
		//}
		//System.out.println();
		OrdenarVector ordering = new OrdenarVector();
		
		//System.out.println("Vector ordenado:");
		for (int i = 0; i < vector.length; i++) {
			//System.out.print(vector[i] + " ");

		}
		System.out.println();
		
		long initTime= System.currentTimeMillis();
		int n = ordering.Ordenar(vector, 0, vector.length );
		long computingTime= System.currentTimeMillis() - initTime;
		System.out.println("Operaciones básicas:\n" + n);
		System.out.println("Tiempo ordenacion:" + computingTime);
		
		
	}

}
