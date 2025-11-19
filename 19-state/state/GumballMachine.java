package state;

public class GumballMachine {
 
	String soldOutState = "SoldOut";
	String noQuarterState = "NoQuarter";
	String hasQuarterState = "HasQuarter";
	String soldState = "Sold";

	String state;
	int count = 0;
 
	public GumballMachine(int numberGumballs) {
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
 
	public void insertQuarter()
	{
		if (state.equals(soldOutState)){
			System.out.println("You inserted a quarter");
			setState(getHasQuarterState());
		}
		else if(state.equals(noQuarterState)){
			System.out.println("You inserted a quarter");
			setState(getHasQuarterState());
		}
		else if(state.equals(hasQuarterState)){
			System.out.println("You can't insert another quarter");
		}
		else if(state.equals(soldState)){
			System.out.println("Please wait, we're already giving you a gumball");
		}
	}
 
	public void ejectQuarter()
	{
		if (state.equals(soldOutState)){
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
		else if(state.equals(noQuarterState)){
			System.out.println("You haven't inserted a quarter");
		}
		else if(state.equals(hasQuarterState)){
			System.out.println("Quarter returned");
			setState(getNoQuarterState());
		}
		else if(state.equals(soldState)){
			System.out.println("Sorry, you already turned the crank");
		}
	}
 
	public void turnCrank()
	{
		if (state.equals(soldOutState)){
			System.out.println("You turned, but there are no gumballs");
		}
		else if(state.equals(noQuarterState)){
			System.out.println("You turned, but there's no quarter");
		}
		else if(state.equals(hasQuarterState)){
			System.out.println("You turned...");
			setState(getSoldState());
			dispense();
		}
		else if(state.equals(soldState)){
			System.out.println("Turning twice doesn't get you another gumball!");
		}
	}

	public void dispense()
	{
		if (state.equals(soldOutState)){
			System.out.println("No gumball dispensed");
		}
		else if(state.equals(noQuarterState)){
			System.out.println("You need to pay first");
		}
		else if(state.equals(hasQuarterState)){
			System.out.println("No gumball dispensed");
		}
		else if(state.equals(soldState)){
			releaseBall();
			if (getCount() > 0) {
				setState(getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				setState(getSoldOutState());
			}
		}
	}
 
	void releaseBall()
	{
		System.out.println("A gumball comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
		if(state.equals(soldOutState)) setState(getNoQuarterState());
	}

	void setState(String state) {
		this.state = state;
	}
    public String getState() {
        return state;
    }

    public String getSoldOutState() {
        return soldOutState;
    }

    public String getNoQuarterState() {
        return noQuarterState;
    }

    public String getHasQuarterState() {
        return hasQuarterState;
    }

    public String getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");

		if (state.equals(soldOutState)){
			result.append("Machine is " + "sold out" + "\n");
		}
		else if(state.equals(noQuarterState)){
			result.append("Machine is " + "waiting for quarter" + "\n");
		}
		else if(state.equals(hasQuarterState)){
			result.append("Machine is " + "waiting for turn of crank" + "\n");
		}
		else if(state.equals(soldState)){
			result.append("Machine is " + "dispensing a gumball" + "\n");
		}

		return result.toString();
	}
}
