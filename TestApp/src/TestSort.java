
public class TestSort {
	
	public static void main(String[] args) {
		
		System.out.println("Test message..");
		
		int[] myInts = {200, -102, 1, 50005, -1};
		
		for(int i=0; i<myInts.length; i++) {
			for (int j = 0; j < myInts.length-i-1; j++) {
				int temp;
				if(myInts[j] > myInts[j+1]) {
					temp = myInts[j];
					myInts[j] = myInts[j+1];
					myInts[j+1] = temp;
				}
			}
		}
		
		for(int t : myInts)
			System.out.println(t);
	}
}
