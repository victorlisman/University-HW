public class Loan
{
    private int id;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    private String frequency;
    private double sum;
    private double installment;
    private double unpaidSum;

    public Loan()
    {
        this.id = 0;
        this.number = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.frequency = "";
        this.sum = 0;
        this.installment = 0;
        this.unpaidSum = 0;
    }
    
    public Loan(String firstName, String lastName, String address, double sum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.sum = sum;
        this.installment = 0.1 * sum;
    }

    public Loan(String firstName, String lastName, String address, String frequency, double sum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.frequency = frequency;
        this.sum = sum;
        this.installment = 0.1 * sum;
    }

    public double getSum()
    {
        return this.sum;
    }

    public double getUnpaidSum()
    {
        return this.unpaidSum;
    }

    public void setUnpaidSum(double unpaidSum)
    {
        this.unpaidSum = unpaidSum;
    }

    public double getInstallment()
    {
        return this.installment;
    }

    public void setInstallment(double installment)
    {
        this.installment = installment;
    }
    
    public String getFrequency()
    {
        return this.frequency;
    }

    public void setFrequency(String frequency)
    {
        this.frequency = frequency;
    }

    public void computeInstalment()
    {
    }

    public void payInstallment()
    {
        this.unpaidSum -= this.installment;
    }

    @Override
    public String toString()
    {
        return "Loan [id=" + id + ", number=" + number + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", frequency=" + frequency + ", sum=" + sum + ", installment=" + installment + ", unpaidSum=" + unpaidSum + "]";
    }

}