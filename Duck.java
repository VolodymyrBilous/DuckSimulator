
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
	public Duck() {
		// TODO Auto-generated constructor stub
	}
    public abstract void display();
    
    public void performFly(){
    	flyBehavior.fly();
    }
    public void performQuack(){
    	quackBehavior.quak();
    }
    public void swim(){
    	System.out.println("All duck float");
    }
    public void SetFlyBehavior(FlyBehavior fb){
    	flyBehavior = fb;    	
    }
    public void SetQuackBehavior(QuackBehavior qb){
    	quackBehavior = qb;
    }
}
