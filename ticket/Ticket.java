package redbus.ticket;

public class Ticket {
    private String ticketNo;
    private int ticketPrice;
    private String boarding;
    private String destination;
    private User user;

    public Ticket(String ticketNo, int ticketPrice, String boarding, String destination, User user) {
        this.ticketNo = ticketNo;
        this.ticketPrice = ticketPrice;
        this.boarding = boarding;
        this.destination = destination;
        this.user = user;
    }

    public String getTicketNo() {
        return ticketNo;
    }


    public int getTicketPrice() {
        return ticketPrice;
    }


    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
