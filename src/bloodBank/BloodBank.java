package bloodBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bloodBank.models.Donor;
import bloodBank.models.Patient;

public class BloodBank {

	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Donor> donors = new ArrayList<Donor>();
		Scanner sc = new Scanner(System.in);
				
		int choice,flag;
		do {
			System.out.println("Enter 1 to add a patient.");
			System.out.println("Enter 2 to add a donor.");
			System.out.println("Enter 3 to search a donor with blood group.");
			System.out.println("Enter 4 to search a patient with name.");

		 choice = sc.nextInt();
		 sc.nextLine();
		switch (choice) {
		case 1: {
			patients.add(addPatient());
			System.out.println("Enter 0 to choose again");
			System.out.println("Enter 5 to exit.");
			choice = sc.nextInt();
			sc.nextLine();
			break;
		}
		case 2: {
			donors.add(addDonor());
			System.out.println("Enter 0 to choose again");
			System.out.println("Enter 5 to exit.");
			choice = sc.nextInt();
			sc.nextLine();
			break;
		}
		case 3: {
			flag = 0;
			System.out.println("Enter required blood group: ");
			String bg = sc.nextLine();
			for ( int i=0;i<donors.size();i++) {
				if (donors.get(i).getbGroup().equals(bg)){
					flag = 1;
					System.out.println(donors.get(i).toString());
				}
			}
			if (flag == 0) {
				System.out.println("Donor not found");
			}
			System.out.println("Enter 0 to choose again");
			System.out.println("Enter 5 to exit.");
			choice = sc.nextInt();
			sc.nextLine();
			break;
		}
		case 4: {
			flag=0;
				System.out.println("Enter name of patient:");
				String name = sc.nextLine();
				for (int i=0;i<patients.size();i++) {
					if (patients.get(i).getName().equals(name)) {
						flag=1;
						System.out.println(patients.get(i).toString());
					}
					
			}
				if (flag == 0) {
					System.out.println("Patient not found");
				}
				System.out.println("Enter 0 to choose again");
				System.out.println("Enter 5 to exit.");
				choice = sc.nextInt();
				sc.nextLine();
			break;
		}
		case 5: 
			break;
		}
	
	} while (choice == 0);
		 
}

	private static Patient addPatient() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter disease");
		String disease = sc.nextLine();
		System.out.println("Enter date");
		String date = sc.nextLine();
		System.out.println("Enter blood group");
		String bGroup = sc.nextLine();
		Patient patient = new Patient(name, age, disease, date, bGroup);
		 
		return patient;
	}

	private static Donor addDonor() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter blood group");
		String bGroup = sc.nextLine();
		System.out.println("Enter disease");
		String disease = sc.nextLine();
		Donor donor = new Donor(name, age, bGroup, disease);
		
		return donor;
	}
	
}
