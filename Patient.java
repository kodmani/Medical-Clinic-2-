/* File Name: Patient
* Course Name: CST8284 Object Oriented Programming
* Lab Section: 300
* Student Name: Mohamad Al Kodmani
* Date: October 8th 2018
*/

package assign1;

public class Patient {
	
	private String firstName;
	private String lastName;
	private int healthCardNumber;
	private OurDate birthDate;
	private Appointment appointment;

	public Patient() {
		firstName = null;
		lastName = null;
		healthCardNumber = 0;
		birthDate = null;
		appointment = null;
	}

	public Patient(String firstName, String lastName, int healthCardNumber, OurDate birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.healthCardNumber = healthCardNumber;
		this.birthDate = birthDate;
	}
	
	public Patient(String firstName) {
		this.firstName = firstName;
	}
	
	public Patient(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Patient(String firstName, String lastName, int healthCardNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.healthCardNumber = healthCardNumber;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", Health Card Number: " + healthCardNumber
				+ ", Birth date: " + birthDate; 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getHealthCardNumber() {
		return healthCardNumber;
	}

	public void setHealthCardNumber(int healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}

	public OurDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(OurDate birthDate) {
		this.birthDate = birthDate;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	
	
}//end class
