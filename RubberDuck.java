
public class RubberDuck extends Duck{

	public RubberDuck() {
		quackBehavior = new Squeek();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("I'm real rubber duck");
		
	}
}
