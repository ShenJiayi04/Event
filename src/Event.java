import java.util.ArrayList;
import java.util.Date;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    // Getters and Setters
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    public void addAttendee(String attendee) {
        eventAttendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        eventAttendees.remove(attendee);
    }

    public String findAttendee(String attendee) {
        if (eventAttendees.contains(attendee)) {
            return attendee;
        }
        return "Attendee not found";
    }

    public int getTotalAttendees() {
        return eventAttendees.size();
    }

    @Override
    public String toString() {
        return "Event ID: " + eventID + "\nEvent Name: " + eventName +
                "\nEvent Venue: " + eventVenue + "\nEvent Date: " + eventDate +
                "\nEvent Attendees: " + eventAttendees.toString();
    }
}