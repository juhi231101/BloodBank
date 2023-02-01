package bloodBank.models;

public class Donor {
	private String name;
	private int age;
	private String disease;
	private String bGroup;
	
	public Donor(String name , int age , String bGroup, String disease){
		this.name = name;
		this.age = age;
		this.disease = disease;
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

	public String getbGroup() {
		return bGroup;
	}

	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}

	@Override
	public String toString() {
		return "Donor [name=" + name + ", age=" + age + ", disease=" + disease + ", bGroup=" + bGroup + "]";
	}
	
	
}
	

	
	