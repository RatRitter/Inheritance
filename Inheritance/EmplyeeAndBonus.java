


public class EmplyeeAndBonus extends EmployeeAndOffshore {
    private int workHours;

    EmplyeeAndBonus(String fullName, String paymentType, double payment, int hours)
    {
        super(fullName, paymentType, payment);
        bonus(hours);
    }

    EmplyeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild, int hours)
    {
        super(fullName, paymentType, payment, hasChild);
        bonus(hours);
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void bonus(int hours)
    {
        if(hours > 200)
        {
            setPayment(getPayment() + getPayment()*20/100);
            setPaymentClear(getPayment());}
    }
}
