package Q7;

public class CampusEvent {
    public static void main(String[] args) {
        //Test cases
        AdvanceTicket advanceTicketEarly = new AdvanceTicket(20, 30);//10 days or over, so should be 30
        System.out.println("advanceTicketEarly: " + advanceTicketEarly);

        AdvanceTicket advanceTicketLate = new AdvanceTicket(20, 9);//Under 10 days, so should be 40
        System.out.println("advanceTicketLate: " + advanceTicketLate);


        StudentAdvanceTicket studentAdvanceTicketEarly = new StudentAdvanceTicket(20, 11);//10 days or over, so should be 15
        System.out.println("studentAdvanceTicketEarly " + studentAdvanceTicketEarly);

        StudentAdvanceTicket studentAdvanceTicketLate = new StudentAdvanceTicket(20, 9);//Under 10 days, so should be 20
        System.out.println("studentAdvanceTicketLate " + studentAdvanceTicketLate);


        WalkupTicket walkupTicket = new WalkupTicket(2);
        System.out.println("walkupTicket: " + walkupTicket);//WalkupTickets are always $50
    }
}
