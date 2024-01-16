package Q7;

public class AdvanceTicket extends Ticket{
    private final int days;

    public AdvanceTicket(int number, int days) {
        super(number);
        this.days =days;
    }
    @Override
    public double getPrice(){//Sets the price of this ticket. If days is bigger or equal to 10, price is $10, else $40.
        if (days >= 10){
            return 30;
        }else{
            return 40;
        }
    }



}
