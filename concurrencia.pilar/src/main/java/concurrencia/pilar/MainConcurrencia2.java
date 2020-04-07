package concurrencia.pilar;

import java.util.Random;

public class MainConcurrencia2 {
	private static final int SIZE=100000;
	
	public static void main(String[] args) throws InterruptedException {
	int[] unorderedVector = new int[SIZE];
	int[] orderedVector = new int[SIZE];
	
	Random r = new Random(5);
	 
	 for (int i = 0; i<unorderedVector.length; i++){
	 unorderedVector[i] = r.nextInt(50000);
	 }
/*
	 System.out.println("Vector desordenado");
	 for (int l = 0; l<unorderedVector.length; l++){
	 System.out.print(unorderedVector[l]+" ");
	 }
	 */
	 
	 long initTime= System.currentTimeMillis();
	 ConcurrentOrder o1 = new ConcurrentOrder(unorderedVector,0,unorderedVector.length/ 2);
	 ConcurrentOrder o2 = new ConcurrentOrder(unorderedVector, unorderedVector.length/ 2,unorderedVector.length);
	 
	 o1.start();
	 o2.start();
     o1.join();
     o2.join();
	 
	
	
	 int index=0;
	 
	 int i = 0;
	 int j = unorderedVector.length/2;
	 while ((i< unorderedVector.length/2) && (j < unorderedVector.length)){
	  if (unorderedVector[i]<= unorderedVector[j]){
	 // System.out.print(unorderedVector[z] + " ");
		  orderedVector[index++]=unorderedVector[i];
	  i++;
	  } else {
	 // System.out.print(unorderedVector[j] + " ");
		  orderedVector[index++]=unorderedVector[j];
	  j++;
	  }
	  }
	  while (i< unorderedVector.length/2) {
	  //System.out.print(unorderedVector[z] + " ");
		  orderedVector[index++]=unorderedVector[i];
	  i++;
	  }
	  while (j < unorderedVector.length){
		  orderedVector[index++]=unorderedVector[j];
	//  System.out.print(unorderedVector[j] + " ");
		  j++;
	  
	  }
	  long computingTime= System.currentTimeMillis() - initTime;
	  System.out.println("Tiempo ordenacion:" + computingTime);
	  System.out.println("Ordered vector");
	  System.out.println("number of operations:"+ o1.getNumberOfOperations() +o2.getNumberOfOperations());
	  for (int value: orderedVector){
		  System.out.print(value+"");
	  }
	  

}
}
