package Q7;

public class WalkupTicket extends Ticket{
    public WalkupTicket(int number) {
        super(number);
    }

    @Override
    public double getPrice() {
        return 50;//WalkupTickets are always $50
    }
}
