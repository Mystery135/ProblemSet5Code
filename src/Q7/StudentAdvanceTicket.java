package Q7;

public class StudentAdvanceTicket extends AdvanceTicket{
    public StudentAdvanceTicket(int number, int days) {
        super(number, days);
    }
    @Override
    public double getPrice(){
        return super.getPrice()/2;//Makes student tickets half the price of advance tickets
    }
}
