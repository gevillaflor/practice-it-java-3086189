package _02_07b;

public class TicketMachine {

  public static void main(String[] args) {
    // Create an object called ticket of type Ticket
    Ticket ticket = new Ticket();

    // Set the destination of the ticket to
    ticket.setDestination("New York");

    // Set the price of the ticket to
    ticket.setPrice(15.30);

    // Set the isReturn value to true
    ticket.setIsReturn(true);
    ;

    // Print the ticket's destination to the console
    System.out.println("Ticket Destination: " + ticket.getDestination());

    // Print the ticket's price to the console
    System.out.println("Ticket Price: " + ticket.getPrice());

    // Print the ticket's osReturn to the console
    System.out.println("Ticket isReturn: " + ticket.getIsReturn());
  }

}
