package contract;


public class Loan extends Contract{
    public Loan(String name, String date, int amount){
        super(name, date, amount);
    }
    @Override
    public double calculatePayment() {
        String [] data = getDate().split("/");
        if("2023".equals(data[2])){
            return getAmount() * 0.07;
        } else if("2022".equals(data[2])){
            return getAmount() * 0.1;
        }
        return 0;
    }
}
/*
    Създайте дъщерен клас Loan, който ще връща доходност 10%, ако годината е 2022 и 7%, ако годината не е 2022.
    Тук е нужно от датата във формат 01/01/2023 да вземете само годината. Ползвайте масив и regex.
 */