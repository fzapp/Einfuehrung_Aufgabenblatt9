package p1;
import java.util.Random;
import java.util.stream.*;

public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] randomArray(int x) {
		int [] randArray = new int[x];
		Random randInts = new Random();
		for(int i=0; i<randArray.length; i++) {
			randArray[i] = randInts.nextInt();
		}
		return randArray;
	}
	
	public static int[] randomArray2(int x) {
		int[] randArray = new int[x];
		Random generator = new Random();
		IntStream randIntsStream = generator.ints(0, x);
		int[] randInts = randIntsStream.toArray();
		for(int i=0; i<randArray.length; i++) {
			randArray[i] = randInts[i];
		}
		return randArray;
	}
	
	public static int[] randomArray3() {
		int[] randArray = new int[6];
		Random generator = new Random();
		IntStream randIntsStream = generator.ints(55, 76);
		int[] randInts = randIntsStream.toArray();
		for(int i=0; i<randArray.length; i++) {
			randArray[i] = randInts[i];
		}
		return randArray;
	}
	
	public static int[] randomArray4(int n) {
		int[] randArray = new int[n+1];
		Random generator = new Random();
		IntStream randIntsStream = generator.ints(1, 51);
		int[] randInts = randIntsStream.toArray();
		for(int i=0; i<randArray.length -1; i++) {
			randArray[i] = randInts[i];
		}
		int sum = 0;
		for(int i=0; i<randArray.length -1; i++) {
			sum += randArray[i];
		}
		randArray[n] = sum/n;
		return randArray;
	}

}
