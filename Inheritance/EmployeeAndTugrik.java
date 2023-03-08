
public class EmployeeAndTugrik extends EmployeeAndChild {
    private double tugrickExchange;
    private double payment;
    private double paymentClear;

    public EmployeeAndTugrik(String fullName, String paymentType, double payment)
    {
        super(fullName, paymentType, payment);
        this.paymentClear = payment;
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild)
    {
        super(fullName, paymentType, payment, hasChild);
        this.paymentClear = payment;
    }

    public void setTugrickExchange(double tugrickExchange) {
        this.tugrickExchange = tugrickExchange;
    }

    public double getTugrickExchange() {
        return tugrickExchange;
    }

    @Override
    public double getPaymentWithTax() {

        payment = getPayment() - getPayment()*getTax()/100;
        setPayment(getPayment() - getPayment()*getTax()/100);

        if(getPaymentType() == "почасовая")
        {
            setPayment(getPayment()/2);
            setTugrickExchange(getPayment()/getTugrickExchange());
        }

        return payment;
    }

    public void setPaymentClear(double paymentClear) {
        this.paymentClear = paymentClear;
    }

    @Override
    public String toString() {
        String str = new String();

        if(getPaymentType() == "почасовая") {
            str = getFullName() + " | " + getTax() + "%" + " | " + paymentClear + " | " + super.getPayment() + "/"+ getTugrickExchange();
        }
        else
        {
            str = getFullName() + " | " + getTax() + "%" + " | " + paymentClear + " | " + super.getPayment();
        }
        return str;
    }
}

