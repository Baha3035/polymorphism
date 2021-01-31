public class CEO extends Manager {
    private boolean hasCompanyCar;

    public CEO(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO() {
    }

    public CEO(boolean hasStocks) {
        super(hasStocks);
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
	
	@Override
	public void goToVacation (){
		System.out.println("I'm gonna be chilling in Turks, lil bae");
	}
}
