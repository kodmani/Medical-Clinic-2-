/* File Name: OurDate
* Course Name: CST8284 Object Oriented Programming
* Lab Section: 300
* Student Name: Mohamad Al Kodmani
* Date: October 8th 2018
*/

package assign1;

public class OurDate {
	
	private int day;
	private int month;
	private int year;
	
	public OurDate() { 
		day = 01;
		month = 01;
		year = 2018;
		
	}
	
	public OurDate(int day, int month, int year) { 
		this.day = day; 
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year + "\n";
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
