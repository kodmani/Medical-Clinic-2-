/* File Name: Doctor
* Course Name: CST8284 Object Oriented Programming
* Lab Section: 300
* Student Name: Mohamad Al Kodmani
* Date: October 8th 2018
*/

package assign1;

import java.util.Arrays;

public class Doctor {

	private String firstName;
	private String lastName;
	private String speciality;
	private Appointment[] appointments;

	public Doctor() {
		firstName = null;
		lastName = null;
		speciality = null;
		appointments = null;
	}

	public Doctor(String firstName, String lastName, String speciality) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciality = speciality;
	}

	@Override 
	public String toString() {
		return "Doctor: " + firstName + " " + lastName + ", Speciality: " + speciality + "\n";
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Appointment[] getAppointments() {
		return appointments;
	}

	public void setAppointments(Appointment[] appointments) {
		this.appointments = appointments;
	}


}//end class


