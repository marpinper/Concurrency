package concurrencia.pilar;

import java.util.Random;

public class MainConcurrencia {
	
	public static void main(String[] args) {
	int[] vector = new int[20];
	
	Random r = new Random();
	 
	 for (int i = 0; i<vector.length; i++){
	 vector[i] = r.nextInt(20);
	 }

	 System.out.println("Vector desordenado");
	 for (int i = 0; i<vector.length; i++){
	 System.out.print(vector[i]+" ");
	 }
	 System.out.println();
	 OrdenarVector.Ordenar(vector, 0, vector.length/ 2);
	 OrdenarVector.Ordenar(vector, vector.length/ 2, vector.length);
	 System.out.println("segundo intento");
	 
	 int i = 0;
	 int j = vector.length/2;
	 while ((i< vector.length/2) && (j < vector.length)){
	  if (vector[i]<= vector[j]){
	  System.out.print(vector[i] + " ");
	  i++;
	  } else {
	  System.out.print(vector[j] + " ");
	  j++;
	  }
	  }
	  while (i< vector.length/2) {
	  System.out.print(vector[i] + " ");
	  i++;
	  }
	  while (j < vector.length){
	  System.out.print(vector[j] + " ");j++;
	  }

}
}
