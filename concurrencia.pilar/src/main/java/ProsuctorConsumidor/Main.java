package ProsuctorConsumidor;

public class Main {
	private static final int BUFFER_SIZE = 15;

	public static void main(String[] args) throws InterruptedException {

		Buffer buffer = new Buffer(BUFFER_SIZE);

		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);

		producer.start();
		consumer.start();

		producer.join();
		consumer.join();

	}
}
