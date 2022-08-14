package clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public AdminUser(Integer id, String role) {
		// TODO Auto-generated constructor stub
    	super(id);
    	this.role = role;
    	this.securityIncidents = new ArrayList<String>();
    	
	}
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin <1000 || pin >999999) {
			return false;
		}
		this.pin=pin;
		return true; // both assign passes
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (confirmedAuthID !=this.id) {
			this.authIncident();
			return false;
		}
		return true; //authorized passes
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;//auto generate method
	}
	public String getRole() {
		return role;//getter
	}
	public void setRole(String role) {
		this.role = role;//setter
	}
}
