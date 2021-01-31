public class Specialist extends Employee{
    private int levels;

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public Specialist() {
    }

    public Specialist(int levels) {
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
	
	@Override
	public void goToVacation (){
		System.out.println("yahoo, I can rest on my couch");
	}
}
