public abstract class Member {
    private int hireYear;
    protected int age;
    private String name;

    //constructor
    Member(String name, int age, int hireYear) {
        this.name = name;
        this.age = age;
        this.hireYear = hireYear;
    }

    public abstract double CalculateSalary();
    public int getHireYear() {
        return this.hireYear;
    }

    @Override
    public String toString() {
        return "{" +
            " hireYear='" + getHireYear() + "'" +
            ", age='" + age + "'" +
            ", name='" + name + "'" +
            "}";
    }
}
