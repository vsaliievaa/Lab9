package ATM;

public class BaseBill implements Bill {

    private int billAmount;
    private Bill next;

    public BaseBill(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill bill) {
        this.next = bill;
    }

    @Override
    public void handle(int amount) throws IllegalArgumentException{
        if (next != null) {
            next.handle(amount % billAmount);
        }
        else if (amount % billAmount != 0) {
            throw new IllegalArgumentException("The ATM doesn't have enough bills to hand out your sum.");
        }
        System.out.println("Please receive " + amount / billAmount + " of " + billAmount + " UAH bills.");
    }
}
