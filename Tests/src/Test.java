public class Test{
public static void main(String[] args){
		int[] array1 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
System.out.println(array1[0]);
System.out.println(array1[array1[2]] );
System.out.println(array1[4 + array1[1]] );
System.out.println(array1[array1[array1[2]]]);
System.out.println(array1[8] + 5 + " ");
	}
}