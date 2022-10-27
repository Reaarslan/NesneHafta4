package Diziler;

public class InitArray {

	public static void main(String[] args) {
		
		int x=0,length=9;
		int[]array = {32,27,64,18,95,14,90,70,60,37};
		System.out.printf("%s%8s%n", "Index","Value");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
		
		for(int counter = 0; counter < 5; counter++) {
			x=array[length];
			array[length]=array[counter];
			array[counter]=x;
			length--;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
	}
}
