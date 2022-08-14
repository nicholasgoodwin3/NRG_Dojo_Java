package clinicapp;

public class User {
		// TODO Auto-generated constructor stub
	protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
    
    public User(Integer id) {
    	this.id=id;
    }//constructor for ID

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	} //auto gen getters and setters
}

