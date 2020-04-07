package concurrencia.pilar;

public class ConcurrentOrder extends Thread {
	int[] vector;
	 int inicio,fin;
	 int numberOfOperations;
	 public ConcurrentOrder(int[] vector,int i,int j){
	 this.vector = vector;
	 inicio = i;
	 fin = j;
	 }
	 public void run() {
	 
	 numberOfOperations= OrdenarVector.Ordenar(vector, inicio, fin);
	 
}
	 public int getNumberOfOperations(){
		 return numberOfOperations;
	 }
}
