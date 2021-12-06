package ATM;

public class ATM {
    private Bill firstBill;

    public ATM() {
        Bill bill5 = new Bill5();
        Bill bill10 = new Bill10();
        Bill bill20 = new Bill20();

        bill20.setNext(bill10);
        bill10.setNext(bill5);
        this.firstBill = bill20;
    }

    public void handle(int amount) {
        this.firstBill.handle(amount);
    }
}
