
public class T04 {

	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "почасовая";
		    public static final String RATE = "ставка";
		    public static final String JOB_PRICE = "сдельная";}
		Employee[] employees = {
                new EmployeeAndTugrik("Иванов", PaymentTypes.RATE, 3000, true),
                new EmployeeAndTugrik("Сидоров", PaymentTypes.HOURLY, 800, true),
                new EmployeeAndTugrik("Петров", PaymentTypes.JOB_PRICE, 5500)
        };
        ((EmployeeAndTugrik)(employees[employees.length/2])).setTugrickExchange(8);
        System.out.println("  ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)\n" +
                "---------|-----------|-------------|---------------");
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getPaymentWithTax();
            System.out.println(employee);
        }
        System.out.println(" Итого   |           |             | " + sum);
    }
	}


