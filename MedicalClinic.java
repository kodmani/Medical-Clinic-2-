/* File Name: MedicalClinic
 * Course Name: CST8284 Object Oriented Programming
 * Lab Section: 300
 * Student Name: Mohamad Al Kodmani
 * Date: October 8th 2018
 */

package assign1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Represents a MedicalClinic to keep track of appointments between doctors and patients.*/
public class MedicalClinic {

	//Declared variables
	private Appointment[] appointments = new Appointment[10];
	private Patient[] patients = new Patient[10];
	private Doctor[] doctors;
	private static int maxAppointments;
	private static int maxPatients;
	private static int maxDoctors;
	private static int minAppointments;
	private int numberAppointments;
	private int numberPatients;
	private int numberDoctors; 
	private Scanner input = new Scanner(System.in); 

	private int option;
	private String firstname;
	private String lastname;
	private int hcn;

	//Default constructor
	public MedicalClinic() { 
		numberPatients=1;
		numberAppointments=1;
		numberDoctors=5;
		maxAppointments = 10;
		maxPatients = 10;
		maxDoctors = 5;
		minAppointments = 1;
		appointments = new Appointment[maxAppointments];
		patients = new Patient[maxPatients];
		doctors = new Doctor[maxDoctors];

		patients[0] = new Patient("Mohamad", "Kodmani", 123, new OurDate(02,03,1993));

		doctors[0] = new Doctor("Vikash", "Singh", "Neurology");
		doctors[1] = new Doctor("Susan", "Miller", "Surgery");
		doctors[2] = new Doctor("Thanh", "Do", "Family medicine");
		doctors[3] = new Doctor("Francois", "DaSilva", "Sports medicine");
		doctors[4] = new Doctor("Judy", "Chin", "Physical therapy");

		//Doctor doctor, Patient patient, OurDate date
		appointments[0] = new Appointment (doctors[1], patients[0], new OurDate(10,10,2018));
	}

	//Menu display and options
	public void menu() { 

		boolean quit = false;

		while(quit == false) {
			//Options
			System.out.println("Please make a choice: ");
			System.out.println("1. Enter a new patient");
			System.out.println("2. Make an appointment for a patient");
			System.out.println("3. List all appointments");
			System.out.println("4. Quit");

			//Choose option
			System.out.print("\nOption: ");
			option = input.nextInt();
			System.out.println();

			if(option == 1) {
				addPatient();
			} 
			else if (option == 2) {
				addAppointment();
			}
			else if(option == 3) {
				listAppointments();
			}
			else if(option == 4) {
				System.out.println("Good bye");
				quit = true;
			}
			else {
				System.out.println("Invalid option. Choose one of the following: " + "\n");	
			}
		}

	}//end menu

	//Add a new patient
	public void addPatient() { 

		int day, month, year;
		String bDay = new String();
		OurDate bDay2 = new OurDate();
		boolean registered = false;

		//Check if patient list is full
		if (numberPatients < maxPatients) {

			//Register new patient
			System.out.print("Enter first name: ");
			firstname = input.next();

			System.out.print("Enter last name: ");
			lastname = input.next();

			System.out.print("\nEnter health card number: ");
			hcn = input.nextInt();

			System.out.print("Enter birth date DDMMYYYY: "); 
			bDay = input.next();
			System.out.println();

			day = Integer.parseInt(bDay.substring(0, 2));
			bDay2.setDay(day);
			month = Integer.parseInt(bDay.substring(2, 4));
			bDay2.setMonth(month);
			year = Integer.parseInt(bDay.substring(4, 8));
			bDay2.setYear(year);

			//Search if patient is already registered		
			for (int i = 0; i < numberPatients; i++) {
				if (hcn == patients[i].getHealthCardNumber()) { 
					registered = true;
					break;
				}
			} 

			//Confirm patient
			if (registered == true) {
				System.out.println("Patient is already registered.\n");
			} else {
				//Register new patient
				patients[numberPatients++] = new Patient(firstname, lastname, hcn, bDay2);
			}

			//Patient list is full
		} else {
			System.out.println("Patient list is full." + "\n");
		}

	}// end patient method

	//Add a new appointment
	public void addAppointment() { 

		int docChoice; 
		int day, month, year;
		String appDate = new String();
		OurDate appDate2 = new OurDate();
		boolean registered = false; 
		boolean busy = false;
		int selectPatient = 0;

		//Check if appointment list is full
		if(numberPatients < maxAppointments) {

			System.out.print("Enter health card number: ");
			hcn = input.nextInt();
			System.out.println(); 

			//Search if patient is registered
			for (int i = 0; i < numberPatients; i++) {
				if (hcn == patients[i].getHealthCardNumber()) { 
					registered = true;
					selectPatient = i;

				}
			}

			//Confirm patient
			if (registered == false) {
				System.out.println("Patient is not registered" +"\n");
			} else {

				//search if patient has appointment
				for(int i = 0; i < numberAppointments; i++) {
					if(hcn == appointments[i].getPatient().getHealthCardNumber()) {
						System.out.println("The patient already has an appointment." + "\n");
						registered = false;
					} else {
						registered = true;
					}
				}

				if(registered) {

					//List doctors
					for(int i = 0; i < numberDoctors; i++) {
						System.out.print((i+1) + ". "  + doctors[i].toString()); 
					}

					//Choose a doctor
					System.out.print("\nChoose a doctor selection: "); 
					docChoice = input.nextInt();	

					//Choose appointment date
					System.out.print("Enter desired appointment date DDMMYY: ");
					appDate = input.next();
					System.out.println();

					day = Integer.parseInt(appDate.substring(0, 2));
					appDate2.setDay(day);
					month = Integer.parseInt(appDate.substring(2, 4));
					appDate2.setMonth(month);
					year = Integer.parseInt(appDate.substring(4, 8));
					appDate2.setYear(year);

					//Search if doctor has an appointment on the same day 
					for(int i = 0; i < numberAppointments; i++) {
						if(doctors[docChoice-1] == appointments[i].getDoctor() &&
								appDate2.getDay() == appointments[i].getAppointmentDate().getDay() &&
								appDate2.getMonth() == appointments[i].getAppointmentDate().getMonth() &&
								appDate2.getYear() == appointments[i].getAppointmentDate().getYear()) {
							busy = true;
							System.out.println("The doctor is busy on that date." + "\n");
						} 

						//If not, set new appointment
					}
					if(busy == false) {
						appointments[numberAppointments++] = new Appointment(doctors[docChoice-1], patients[selectPatient], appDate2);
					}
				}
			}
		} else {
			System.out.println("Appointment list is full");
		}

	}//end addAppointment

	//List appointments
	public void listAppointments() { 

		if(numberAppointments < minAppointments) {
			System.out.println("No appointments found" +"\n");
		} else {
			for (int i = 0; i < numberAppointments; i++) {
				System.out.println(appointments[i].toString());
			} 
		}

	}//end class


}//end class
