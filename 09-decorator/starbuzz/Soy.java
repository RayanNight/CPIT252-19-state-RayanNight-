package starbuzz;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		super.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
