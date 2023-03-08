
public class EmployeeAndOffshore extends EmployeeAndTugrik {

    private boolean inOffshore;
    private double payment;
    public EmployeeAndOffshore(String fullName, String paymentType, double payment)
    {
        super(fullName, paymentType, payment);
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild)
    {
        super(fullName, paymentType, payment, hasChild);
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild, boolean inOffshore)
    {
        super(fullName, paymentType, payment, hasChild);
        this.inOffshore = inOffshore;
    }

    public boolean getInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }

    @Override
    public double getPaymentWithTax() {
        if(inOffshore == true)
        {
            setTax(0);
        }


        payment = getPayment() - getPayment()*getTax()/100;

        setPayment(getPayment() - getPayment()*getTax()/100);

        if(getPaymentType() == "почасовая")
        {
            setPayment(getPayment()/2);
            setTugrickExchange(getPayment()/getTugrickExchange());
        }

        return payment;
    }


}


