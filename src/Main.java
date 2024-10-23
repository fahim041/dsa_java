import ds.DynamicArray;

public class Main {
	public static void main(String[] args) {
		DynamicArray arr = new DynamicArray();
		arr.push(4);
		arr.push(7);
		arr.push(6);
		arr.push(9);
		arr.push(2);
		
		arr.pop();
		arr.pop();
		
		System.out.println(arr.getSize());
	}
}
