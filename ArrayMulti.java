import java.util.*;
class ArrayMulti{
	public static void main(String... args){
		int a[][]=new int[2][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;

		for(int[] ar : a){
			System.out.print(Arrays.toString(ar));
		}
	}
}