public class Reseacher extends Member {

    public Reseacher(String name, int age, int hireYear, int degree) {
        super(name, age, hireYear);
        this.degree = degree;
    }

    private int degree;

    public double CalculateSalary() {
        if (super.age >= 26)
            return super.age * degree;
        else 
            return super.age * degree * (2023 - super.getHireYear());
    }
}
