
public class Employee {

	
		private String fullName;
		private double payment;
		private String paymentType;

		public Employee(String fullName, String paymentType, double payment)
	    {
	        this.fullName = fullName;
	        setPaymentType(paymentType);
	        this.payment = payment;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setPaymentType(String paymentType) {
	        this.paymentType = paymentType;
	    }

	    public String getPaymentType() {
	        return paymentType;
	    }

	    public void setPayment(double payment) {
	        this.payment = payment;
	    }

	    public double getPayment() {
	        return payment;
	    }

	    public String toString()
	    {
	        String str = new String();

	        str = fullName + " | " + paymentType + " | " + payment;

	        return str;
	    }

	    public double getPaymentWithTax()
	    {
	        return getPayment();
	    


	}

}
