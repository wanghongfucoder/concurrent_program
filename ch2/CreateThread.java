
public class CreateThread  implements Runnable {
	public static void main(String[] args) {
		Thread t=new Thread(new CreateThread());
		t.start();
	}
	public void run()
	{
		System.out.println("oh,I am Runnable");
	}
}