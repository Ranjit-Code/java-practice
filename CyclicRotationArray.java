import java.util.*;
public class CyclicRotationArray{
	
	public static void rotate(int[] arr, int n){
		while(n > 0){
			int[] tempArr = new int[arr.length];
			tempArr[0] = 0; // default set to 0
			for(int i=0; i<arr.length; i++){
				if(i==arr.length-1){
					tempArr[0] = arr[i];
				}else{
					tempArr[i+1] = arr[i]; // tempArr[]{3,1,2}
				}
			}
			arr = tempArr.clone();
			Arrays.stream(arr).forEach(element -> System.out.print(element));
			System.out.println();
			n--;
		}
	}
	
	public static void main(String args[]){
		rotate(new int[]{1,2,3}, 2);
	}
}