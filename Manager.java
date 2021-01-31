public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager() {
    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
	
	@Override
	public void goToVacation (){
		System.out.println("I'll chill on the cruise lainer");
	}
}
