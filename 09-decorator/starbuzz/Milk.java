package starbuzz;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		super.beverage = beverage;
	}

	public String getDescription() {
		return super.beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + super.beverage.cost();
	}
}
