
public class T01 {

	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "���������";
		    public static final String RATE = "������";
		    public static final String JOB_PRICE = "��������";
		}
		Employee[] employees = { 
                new Employee("������",  PaymentTypes.RATE, 3000),
                new Employee("�������", PaymentTypes.HOURLY, 800),
                new Employee("������",  PaymentTypes.JOB_PRICE, 5500)
		};
        System.out.println("  ���    |  ��� ������  |  �����\n---------|--------------|------------");
        double sum = 0;
        for (Employee employee : employees) {
            System.out.println(employee);
            sum += employee.getPayment();
        }
        System.out.println(" �����   |              | " + sum + " ���");
    
		}
	}




