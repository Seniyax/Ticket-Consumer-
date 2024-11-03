import java.util.Scanner;


public class Configuration {
    protected int TotalNumOfTickets;
    protected int TicketReleaseRate;
    protected int customerRetrievalRate;
    protected int maxTicketCapacity;


    public Configuration() {
    }

    public Configuration(int TotalNumOfTickets,int TicketReleaseRate,int customerRetrievalRate,int maxTicketCapacity ) {
         this.TotalNumOfTickets = TotalNumOfTickets;
         this.TicketReleaseRate = TicketReleaseRate;
         this.customerRetrievalRate = customerRetrievalRate;
         this.maxTicketCapacity = maxTicketCapacity;
    }

    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        this.customerRetrievalRate = customerRetrievalRate;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }

    public void setTicketReleaseRate(int ticketReleaseRate) {
        TicketReleaseRate = ticketReleaseRate;
    }

    public void setTotalNumOfTickets(int totalNumOfTickets) {
        TotalNumOfTickets = totalNumOfTickets;
    }

    public int getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    public int getTicketReleaseRate() {
        return TicketReleaseRate;
    }

    public int getTotalNumOfTickets() {
        return TotalNumOfTickets;
    }
}

