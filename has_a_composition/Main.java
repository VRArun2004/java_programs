package has_a_composition;

public class Main {
public static void main(String[] args) {
	Car car=new Car();
	car.engine.setModelname("shift desire");
	car.engine.setModelno(354366);
	System.out.println(car.engine.getModelname());
	System.out.println(car.engine.getModelno());
}
}
