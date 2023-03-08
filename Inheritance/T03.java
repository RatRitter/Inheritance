
public class T03 {

	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "���������";
		    public static final String RATE = "������";
		    public static final String JOB_PRICE = "��������";}
		Employee[] employees = {
                new EmployeeAndChild("������", PaymentTypes.RATE, 3000, true),
                new EmployeeAndChild("�������", PaymentTypes.HOURLY, 800, true),
                new EmployeeAndChild("������", PaymentTypes.JOB_PRICE, 5500)
        };
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


