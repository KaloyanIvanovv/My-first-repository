package contract;

public class Main {
    public static void main(String[] args) {
        HourlyContract hourlyContract = new HourlyContract("Почасов договор", "15/02/2023", 700, 10, 100);
        System.out.printf("Вашият %s е на стойност %.2f лева.", hourlyContract.getName(), hourlyContract.calculatePayment() );
        System.out.println();
        try{
            FixedTermContract fixedTermContract = new FixedTermContract("Фиксиран договор", "12.02.2023", 700, 2);
            System.out.printf("Вашият %s е на стойност %.2f лева.", fixedTermContract.getName(), fixedTermContract.calculatePayment());

        }
        catch (IllegalArgumentException a ){
            System.out.println(a.getMessage());
        }
        System.out.println();

        SalesContract salesContract = new SalesContract("Договор за продажба", "14/07/2023", 100000, 3.5);
        System.out.printf("Вашият %s е на стойност %.2f лева.", salesContract.getName(), salesContract.calculatePayment());
        System.out.println();

        Rent rent = new Rent("Договор за наем", "12/02/2023", 500,"София");

        System.out.println(rent.calculatePayment());

        Loan loan = new Loan("Заем", "15/02/2022", 100);
        System.out.println(loan.calculatePayment());

        Rent rent1 = new Rent("Договор за наем", "12/02/2023", 500,null);
        System.out.println(rent1.calculatePayment());
    }
}
