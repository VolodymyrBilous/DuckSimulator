
public class DecoyDuck extends Duck{

	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("I'm real decoy duck");
		
	}
}
