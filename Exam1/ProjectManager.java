public class ProjectManager extends Member {

    public ProjectManager(String name, int age, int hireYear) {
        super(name, age, hireYear);
    }

    public double CalculateSalary() {
        if (super.age >= 35)
            return 35 * 0.8;
        else 
            return super.age * 0.8 * (2023 - super.getHireYear());
    }
}
