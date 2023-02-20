package contract;

public class FixedTermContract extends Contract{
    private int months;

    public FixedTermContract(String name, String date, int amount, int months){
        super(name, date, amount);
        this.months = months;
    }
    @Override
    public double calculatePayment() {
        return months * getAmount();
    }
}
   /* Вторият клас ще има допълнително поле месеци,
        като имплементацията на calculatePayment() ще е равна на произведението между amount и месеците.*/