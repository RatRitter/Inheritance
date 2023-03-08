
public class Y05 {
	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "���������";
		    public static final String RATE = "������";
		    public static final String JOB_PRICE = "��������";}
        Employee[] employees = {
                new EmployeeAndOffshore("������", PaymentTypes.RATE, 3000, true, true),
                new EmployeeAndOffshore("�������", PaymentTypes.HOURLY, 800, true),
                new EmployeeAndOffshore("������", PaymentTypes.JOB_PRICE, 5500)
        };
        ((EmployeeAndTugrik)(employees[employees.length/2])).setTugrickExchange(8);
        System.out.println("  ���    |  �����, % | ����� (���) | � ������ (���)\n" +
                "---------|-----------|-------------|---------------");
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getPaymentWithTax();
            System.out.println(employee);
        }
        System.out.println(" �����   |           |             | " + sum);
    }
}

