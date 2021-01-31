public class Main {
    public static void main(String[] args) {

        Specialist Andrew = new Specialist("Adrew Wiggins", 34, 3000, 2);
        Specialist Steph = new Specialist("Steph Curry", 32, 3000, 3);
        Specialist Kelly = new Specialist("Kelly Oubre", 30, 5000, 4);

        Developer Lebron = new Developer("Lebron James", 34, 2500, "Upper");
        Developer Anthony = new Developer("Anthony Davis", 30, 3000, "Upper");
        Developer Montrazl = new Developer("Montrazl Harris", 21, 3000, "Upper");
        Developer Shrodder = new Developer("Dennis Shrodder", 28, 1500, "Beginner");

        Manager Michael = new Manager("Michael Jordan", 45, 30000, false);
        Manager Magic = new Manager("Magic Johnson", 46, 60000, true);

        CEO Larry = new CEO("Larry Bird", 50, 75000, true, true);

        Employee[] GitHubsEmployee = new Employee[10];
		GitHubsEmployee[0] = Andrew;
		GitHubsEmployee[1] = Steph;
		GitHubsEmployee[2] = Kelly;
		GitHubsEmployee[3] = Lebron;
		GitHubsEmployee[4] = Anthony;
		GitHubsEmployee[5] = Montrazl;
		GitHubsEmployee[6] = Shrodder;
		GitHubsEmployee[7] = Michael;
		GitHubsEmployee[8] = Magic;
		GitHubsEmployee[9] = Larry;
		
		System.out.println("Employees, please, go to vacation and rest with your families:");

		for (int i = 0; i < 10; i++){
			GitHubsEmployee[i].goToVacation();
		}
		
    }
}
