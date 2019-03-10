
public class PopcornMaker {

	public static void main(String[] args) {

		Microwave micro = new Microwave();
		Popcorn pop = new Popcorn("regular");

		micro.putInMicrowave(pop);

		micro.setTime(5);

		micro.startMicrowave();

		pop.eat();

	}

}
