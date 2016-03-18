package myPackage;
import java.util.Arrays;


public class Triangle {
	public static String test(double a, double b, double c){
		double[] arr = new double[]{a, b, c};
		Arrays.sort(arr);
		if (arr[0] + arr[1] <= arr[2]){
			return "Not a triangle";
		}
		else if (arr[0] == arr[1] && arr[1] == arr[2]){
			return "Equilateral";
		}
		else if (arr[0] == arr[1] || arr[1] == arr[2]){
			return "Isosceles";
		}
		else{
			return "Scalene";
		}
	}
}
