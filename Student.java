import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints;

	//TODO constructor
	public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
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

	public ArrayList<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(ArrayList<Integer> labPoints) {
		this.labPoints = labPoints;
	}



	public double getAverage() {
		//TODO
		double average = 0;
		for (int i = 0; i<this.labPoints.size(); i++){
			average += this.labPoints.get(i);
		}
		return average/this.labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		double average = getAverage();
		return average >= 8;
	}
}
