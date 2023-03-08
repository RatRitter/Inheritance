
public class T01 {

	public static void main(String[] args) {
		class PaymentTypes {
		    public static final String HOURLY = "почасовая";
		    public static final String RATE = "ставка";
		    public static final String JOB_PRICE = "сдельная";
		}
		Employee[] employees = { 
                new Employee("Иванов",  PaymentTypes.RATE, 3000),
                new Employee("Сидоров", PaymentTypes.HOURLY, 800),
                new Employee("Петров",  PaymentTypes.JOB_PRICE, 5500)
		};
        System.out.println("  ФИО    |  Вид оплаты  |  Сумма\n---------|--------------|------------");
        double sum = 0;
        for (Employee employee : employees) {
            System.out.println(employee);
            sum += employee.getPayment();
        }
        System.out.println(" Итого   |              | " + sum + " грн");
    
		}
	}




