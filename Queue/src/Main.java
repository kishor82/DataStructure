
public class Main {

	public static void main(String[] args) {
//		Intq q=new Intq();
//		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(5);
//		q.showAll();
		
		Personq q= new Personq();
		q.enqueue(new Person("kishor","95"));
		q.enqueue(new Person("nuts","26"));
		
		q.showAll();
		
	}

}
