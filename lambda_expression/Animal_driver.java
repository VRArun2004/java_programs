package lambda_expression;

public class Animal_driver {
	public static void main(String[] args) {
		Animal cat = () -> {
			System.out.println("meow meow");
		};
		Animal dog = () -> {
			System.out.println("bow bow");
		};
		Animal snake = () -> {
			System.out.println("ssse ssse");
		};
		cat.sound();
		dog.sound();
		snake.sound();

		System.out.println("-----using implicite return-----");
		Animal_return cat1 = () -> "meow meow";
		Animal_return dog1 = () -> "meow meow";
		Animal_return snake1 = () -> "meow meow";
		System.out.println(cat1.sound());
		System.out.println(dog1.sound());
		System.out.println(snake1.sound());
	}
}
