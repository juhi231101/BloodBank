package bloodBank.models;

public class Patient {

	private String name;
	private int age;
	private String disease;
	private String date;
	private String bGroup;
	
	public Patient(String name,int age,String disease,String date,String bGroup) {
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.date = date;
		this.bGroup = bGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getbGroup() {
		return bGroup;
	}

	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", date=" + date + ", bGroup="
				+ bGroup + "]";
	} 
	
}
	