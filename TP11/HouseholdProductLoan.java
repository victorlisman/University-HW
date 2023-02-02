public class HouseholdProductLoan extends Loan
{

    public HouseholdProductLoan(String firstName, String lastName, String address, String frequency, double sum)
    {
        super(firstName, lastName, address, frequency, sum);
    }

    public void computeInstalment()
    {
        if (this.getFrequency() == "Biyearly")
            this.setInstallment(getInstallment() + getSum() * 0.07);
    }
}