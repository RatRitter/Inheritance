
public class T04 {

	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "���������";
		    public static final String RATE = "������";
		    public static final String JOB_PRICE = "��������";}
		Employee[] employees = {
                new EmployeeAndTugrik("������", PaymentTypes.RATE, 3000, true),
                new EmployeeAndTugrik("�������", PaymentTypes.HOURLY, 800, true),
                new EmployeeAndTugrik("������", PaymentTypes.JOB_PRICE, 5500)
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


