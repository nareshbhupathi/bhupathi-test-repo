
public class MySingleton {
	
	private MySingleton() {}
	
	private static volatile MySingleton myInstance;
	
	public static MySingleton getInstance() {
		
		synchronized (myInstance) {
			if(myInstance == null) {
				myInstance = new MySingleton();
			}
		}
		
		System.out.println("Hi Mama!");
		
		return myInstance;
	}
	
	
}
