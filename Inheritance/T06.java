
public class T06 {
	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "почасовая";
		    public static final String RATE = "ставка";
		    public static final String JOB_PRICE = "сдельная";}
        Employee[] employees = {
                new EmplyeeAndBonus("Иванов", PaymentTypes.RATE, 3000, true, 201),
                new EmplyeeAndBonus("Сидоров", PaymentTypes.HOURLY, 800, true,120),
                new EmplyeeAndBonus("Петров", PaymentTypes.JOB_PRICE, 5500, 230)
        };
        ((EmplyeeAndBonus)(employees[employees.length/2])).setTugrickExchange(8);
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

