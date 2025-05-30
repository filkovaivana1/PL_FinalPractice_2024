public class Account {

   private String bank;
   private double amount;

    public Account(String bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public String getBank() {
        return bank;
    }

    public double getAmount() {
        return amount;
    }

    public void add(double plus){
        if (plus > 0) {
            amount +=plus;
        } else {
            System.out.println("Invalid input for plus");
        }
    }

    public void withdraw(double minus) {
        if (minus > amount) {
           throw new INvalidIInputException("HANDLING EXCEPTION");
        } else {
            amount -= minus;
        }
    }
}
