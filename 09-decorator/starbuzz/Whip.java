package starbuzz;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super.beverage = beverage;
	}

	public String getDescription() {
		return super.beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + super.beverage.cost();
	}
}
