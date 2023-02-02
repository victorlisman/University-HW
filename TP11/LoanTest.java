public class LoanTest
{
    public static void main(String[] args)
    {
        Loan loan1 = new Loan("John", "Doe", "123 Main Street", 1000);
        Loan loan2 = new Loan("Jane", "Doe", "123 Main Street", "Biyearly", 1000);
        ApartmentLoan loan3 = new ApartmentLoan("John", "Doe", "123 Main Street", "Trimonthly", 1000);
        HouseholdProductLoan loan4 = new HouseholdProductLoan("Jane", "Doe", "123 Main Street", "Biyearly", 1000);
        loan1.computeInstalment();
        loan2.computeInstalment();
        loan3.computeInstalment();
        loan4.computeInstalment();
        System.out.println("Loan 1: " + loan1.getInstallment());
        System.out.println("Loan 2: " + loan2.getInstallment());
        System.out.println("Loan 3: " + loan3.getInstallment());
        System.out.println("Loan 4: " + loan4.getInstallment());
        loan1.payInstallment();
        loan2.payInstallment();
        loan3.payInstallment();
        loan4.payInstallment();
        System.out.println("Loan 1: " + loan1.getInstallment());
        System.out.println("Loan 2: " + loan2.getInstallment());
        System.out.println("Loan 3: " + loan3.getInstallment());
        System.out.println("Loan 4: " + loan4.getInstallment());
    }
}