package Q7;

public abstract class Ticket {
    private static int number;//static unique number
    //constructor to set instance variables
    public Ticket(int number){
        Ticket.number = number;
    }

    //getters & setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        Ticket.number = number;
    }

    public abstract double getPrice();


    @Override
    public String toString(){//Prints object info
        return ("Number: " + number + ", Price: $" + String.format("%.2f", getPrice()));
    }




}
