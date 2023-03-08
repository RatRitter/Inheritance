


	public class EmployeeAndTax extends Employee {
		private double tax;
	    private double payment;

	    public EmployeeAndTax(String fullName, String paymentType, double payment)
	    {
	        super(fullName, paymentType, payment);
	        this.payment = payment;
	    }

	    public double getTax() {
	        return tax;
	    }

	    @Override
	    public void setPaymentType(String paymentType) {

	        if(paymentType == "ставка" || paymentType == "сдельная")
	        {
	            tax = 15;
	        }
	        else
	        {
	            tax = 20;
	        }

	        super.setPaymentType(paymentType);
	    }

	    @Override
	    public double getPaymentWithTax() {
	        setPayment(getPayment() - getPayment()*tax/100);
	        return getPayment();
	    }

	    public String toString()
	    {
	        String str = new String();

	        str = getFullName() + " | " + tax + "%" + " | " + payment + " | " + super.getPayment();

	        return str;
	    }

	    public void setTax(double tax) {
	        this.tax = tax;
	    

	}

}
