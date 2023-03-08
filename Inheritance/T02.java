
public class T02 {

	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "почасовая";
		    public static final String RATE = "ставка";
		    public static final String JOB_PRICE = "сдельная";}
		Employee[] employees = {
new EmployeeAndTax("Иванов", PaymentTypes.RATE, 3000),
new EmployeeAndTax("Сидоров", PaymentTypes.HOURLY, 800),
new EmployeeAndTax("Петров", PaymentTypes.JOB_PRICE, 5500)
};
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


