/* File Name: Appointment
* Course Name: CST8284 Object Oriented Programming
* Lab Section: 300
* Student Name: Mohamad Al Kodmani
* Date: October 8th 2018
*/

package assign1;

public class Appointment {

	private Doctor doctor;
	private Patient patient;
	private OurDate date;

	public Appointment() { 
		doctor = null;
		patient = null;
	}
	
	public Appointment(Doctor doctor, Patient patient, OurDate date) { 
		this.doctor = doctor;
		this.patient = patient;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Appointment- \n" + doctor + "Patient: " + patient + "Appointment date: " + date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public OurDate getAppointmentDate() {
		return date;
	}
	
	public void setAppointmentDate(OurDate date) {
		this.date = date;
	}



}//end class
