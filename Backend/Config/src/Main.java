import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        Scanner scanner = new Scanner(System.in);

        config.setCustomerRetrievalRate(getinput(scanner,"Enter the amount of Tickets"));
        config.setMaxTicketCapacity(getinput(scanner,"Enter the max Tickets"));
        config.setTicketReleaseRate(getinput(scanner,"Enter the Rate"));
        config.setTotalNumOfTickets(getinput(scanner,"Enter the total Ticktets"));





    }

    private static int getinput(Scanner scanner, String prompt) {
        int value;
        while (true){
            System.out.println(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value>0){
                    return value;

                }else {
                    System.out.println("Enter a positive integer");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid Input,Please Enter again");
            }


    }


}


}