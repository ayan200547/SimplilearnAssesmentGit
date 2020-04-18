import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {
	public static void main(String[] args) {
		//createThreadUsingAnonymousClass();
		
	///	createThreadUsingLambda();
		List<String> studentList = new ArrayList<String>();
		studentList.add("Ayan");
		studentList.add("Nachiket");
		studentList.add("tarun");
		//Instances of Functional Interface can be created by Using lambda expression
		studentList.forEach(( t)-> System.out.println(t));
		//Instances of Functional Interface can be created by Using Method Reference
		studentList.forEach(System.out::println);

		
	}
	//Using Lambda ---> Instances of Functional Interface can be used by using Lambda Expression, Runnable being a functional interface
	private static void createThreadUsingLambda() {
		// TODO Auto-generated method stub
			Runnable r=() -> {
				// TODO Auto-generated method stub
				//here we are passing behaviour instead of method implementation
				System.out.println("Inside the run...of lambda.");
			};
		
		Thread t = new Thread(r);
		t.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside the run....");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
