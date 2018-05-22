package homework.javaoopch14;

public class PersonTest {

	public static void main(String[] args) {
		Person chinese = new Chinese();
		chinese.meal();

		Person foreigners = new Foreigners();
		foreigners.meal();
	}

}
