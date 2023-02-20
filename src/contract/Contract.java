package contract;

import java.text.SimpleDateFormat;

public abstract class Contract {
    private String name;

    private String date;
    private int amount;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Contract(String name, String date, int amount){

        if(!date.matches("^\\d{2}/\\d{2}/\\d{4}$")){
            throw new IllegalArgumentException("Неправилна дата");
        }

        this.name = name;
        this.date = date;
        this.amount = amount;
    }
    public abstract double calculatePayment();
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
}

   /* Създайте абстрактен клас Contract, с 3 instance variables name, date, amount,
   гетъри и конструктор, който ги инициализира. Класът също така да има абстрактен
   метод calculatePayment(), който да се имплементира във всеки конкретен клас,
   който екстендва абстрактния.Създайте и 3 дъщерни класа - HourlyContract, FixedTermContract and SalesContract,
   като първият трябва да има две допълнителни поленца за изработените часове и за часовата ставка,
    съответно int и double. Имплементацията на calculatePayment() в този 1ви клас ще е тяхното произведение.
    При изработени 100 часа и часова ставка 10лв., методът ще връща 1000.Вторият клас ще има допълнително поле месеци,
    като имплементацията на calculatePayment() ще е равна на произведението между amount и месеците.
    При зададен amount 1000 и 5 месеца, ще връща 5000.И последния клас ще има поле за комисионната на посредника на сделката
     в проценти. За имплементацията на calculatePayment() ще се взима amount-a и комисионната.
     При amount 100 000 и комисионна 3.5, методът ще връща 3500.
    */
