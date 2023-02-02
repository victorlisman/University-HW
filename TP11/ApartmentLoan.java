public class ApartmentLoan extends Loan
{
    public ApartmentLoan(String firstName, String lastName, String address, String frequency, double sum)
    {
        super(firstName, lastName, address, frequency, sum);
    }

    public void computeInstalment()
    {
        if (this.getFrequency() == "Trimonthly")
            this.setInstallment(getInstallment() + getSum() * 0.03);
    }
}