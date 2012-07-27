public class CounterDemo extends Counter {

	public static void main(String[] args) {
		Counter x = new Counter();
		x.increment().increment().increment().print();
	}
}