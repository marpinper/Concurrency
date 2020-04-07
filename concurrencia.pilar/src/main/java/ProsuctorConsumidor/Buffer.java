package ProsuctorConsumidor;

import java.util.ArrayList;
import java.util.List;

public class Buffer { //creat testsssss
	
	private int[] buffer;
	private int size;
	private int numberOfElements;
	private int numberOfHoles;
	private int nextHole;
	private int nextElement;
	
	public Buffer(int bufferSize){
		size=bufferSize;
		buffer=new int[size];
		numberOfElements=0;
		numberOfHoles=size;
		nextHole=0;
		nextElement=0;
	}
	
	//definir q hace cada clase!!!!!!!!!!Elemento digo xd
	synchronized public void put (int element){
		buffer[nextHole]=element;
		nextHole=(nextHole+1)%size;//para hacerlo circular
		
	}
	synchronized public int get(){// aqui hay un problema porque el buffer esta compart en put y get, ponemos synchronized en ambos!!
		int value= buffer[nextElement];
		nextElement=(nextElement+1)%size;
		return value;
	}
	public int getNumberOfElements(){
		return numberOfElements;
	}
	public int getNumberOfHoles(){
		return numberOfHoles;
		
	}
	public int getCapacity(){
		return 0;
	}
	
}
