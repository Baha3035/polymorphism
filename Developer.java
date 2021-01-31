public class Developer extends Employee {
    private String grades = "Middle";

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer() {
    }

    public Developer(String grades) {
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
	
	@Override
	public void goToVacation (){
		System.out.println("I'm going to IT Attractor");
	}
}
