package starbuzz;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super.beverage = beverage;
	}

	public String getDescription() {
		return super.beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return .20 + super.beverage.cost();
	}
}
