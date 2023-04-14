import java.util.ArrayList;

public class Project {
    private double value;
    public ArrayList<Member> ms = new ArrayList<Member>();

    public Project() {
    }

    public Project(double value, ArrayList<Member> ms) {
        this.value = value;
        this.ms = ms;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public ArrayList<Member> getMs() {
        return this.ms;
    }

    public void setMs(ArrayList<Member> ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" +
            ", ms='" + getMs() + "'" +
            "}";
    }

    public void addMember(Member m) {
        ms.add(m);
    }

    public Member getMostExpensiveMember()
    {
        Member mostExpensive = null;
        for (Member m : ms) {
            if (mostExpensive == null || m.CalculateSalary() > mostExpensive.CalculateSalary()) {
                mostExpensive = m;
            }
        }
        return mostExpensive;
    }

    public Member getMostExpensiveMemberHiredThisYear()
    {
        Member mostexpensive = null;

        for (Member m : ms) {
            if (mostexpensive == null || m.CalculateSalary() > mostexpensive.CalculateSalary() && m.getHireYear() == 2023) {
                mostexpensive = m;
            }
        }

        return mostexpensive;
    }
}
