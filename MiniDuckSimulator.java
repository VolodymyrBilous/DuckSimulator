
public class MiniDuckSimulator {

	public MiniDuckSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Duck[] duck = new Duck[3];
		
		for (int i = 0; i < duck.length; i++) {
			duck[i] = createDuck();
			if (i == 2) duck[i].SetFlyBehavior(new FlyRocked());
		}
		for (int i = 0; i < duck.length; i++) {
			duck[i].display();
			duck[i].performQuack();
			duck[i].performFly();			
		}
        
	}
    static Duck createDuck(){
    	switch((int)(Math.random()*4)){
    	case 0 : return new MallardDuck();
    	case 1 : return new DecoyDuck();
    	case 2 : return new RubberDuck();
    	case 3 : return new ModelDuck();
    	}
    	return null;
    }
}
