package contract;

public class SalesContract extends Contract{
    private double commission;

    public SalesContract(String name, String date, int amount, double commission){
        super(name, date, amount);
        this.commission = commission;
    }
    @Override
    public double calculatePayment() {
        double percentage = this.commission/100;
        return percentage * getAmount();
    }
}
/*
Последния клас ще има поле за комисионната на посредника на сделката в проценти.
За имплементацията на calculatePayment() ще се взима amount-a и комисионната.
 */