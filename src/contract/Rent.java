package contract;

public class Rent extends Contract {
    private String city;

    public Rent(String name, String date, int amount, String city) {
        super(name, date, amount);
        this.city = city;
    }

    @Override
    public double calculatePayment() {

        if ("София".equals(this.city)) {
            return getAmount() * 0.05;
        } else {
            return getAmount() * 0.07;
        }
    }
}
/*
Създайте дъщерен клас Rent, с поле city, като методът ще връща доходност от 5%,
ако въведеният от потребителя град е София и 7%, ако не е София.
 */
