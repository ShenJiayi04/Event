
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Event Organization System");
        System.out.print("Enter event ID: ");
        String eventID = scanner.next();
        System.out.print("Enter event name: ");
        String eventName = scanner.next();
        System.out.print("Enter event venue: ");
        String eventVenue = scanner.next();
        System.out.print("Enter event date (in milliseconds): ");
        Date eventDate = new Date(scanner.nextLong());
        System.out.print("Enter attendee name: ");
        String attendee = scanner.next();
        
        

        Event event = new Event(eventID, eventName, eventVenue, eventDate);

        while (true) {
            System.out.println("1. Add an attendee\n2. Remove an attendee\n3. Find an attendee\n4. Display total attendees");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter attendee name to add: ");
                    event.addAttendee(scanner.next());
                    break;
                case 2:
                    System.out.print("Enter attendee name to remove: ");
                    event.removeAttendee(scanner.next());
                    break;
                case 3:
                    System.out.print("Enter attendee name to find: ");
                    String foundAttendee = event.findAttendee(scanner.next());
                    System.out.println("Attendee: " + foundAttendee);
                    break;
                case 4:
                    System.out.println("Total Attendees: " + event.getTotalAttendees());
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to perform more operations? (Y/N): ");
            String continueInput = scanner.next();

            if (!continueInput.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("Event :\n" + event);
        scanner.close();
    }
}