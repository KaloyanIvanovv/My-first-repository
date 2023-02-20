package contract;

public class HourlyContract extends Contract{
    private int workingHours;
    private double hourlyRate;

    public HourlyContract(String name, String date, int amount, int workingHours, double hourlyRate){
        super(name, date, amount);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculatePayment() {
        return hourlyRate * workingHours;
    }
}
