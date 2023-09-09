package project;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Student1 {
	int id;
	String name;
	String lname;
	int marks;
	String grade;
	

	Student1(int id, String name, String lname, int marks, String grade) {
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.marks = marks;
		this.grade = grade;
		
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}

class Teacher1 {

	String tname;
	String Gender;
	String tsubj;
	int salary;

	Teacher1(String tname, String Gender, String tsubj, int salary) {

		this.tname = tname;
		this.Gender = Gender;
		this.tsubj = tsubj;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class School1 {
	
	int schoolStrength;
	int fees;
	long schoolContactNo;
	String mailId;

	School1( int schoolStrength, int fees, long schoolContactNo, String mailId) {
		
		this.schoolStrength = schoolStrength;
		this.fees = fees;
		this.schoolContactNo = schoolContactNo;
		this.mailId = mailId;
	}
}

public class SchoolManagement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Student1> sl = new ArrayList<Student1>();
		List<Teacher1> tl = new ArrayList<Teacher1>();
		List<School1> hl = new ArrayList<School1>();
		System.out.println("******Welcome to Sri Vikas Public School********* ");

		int option;
		do {
			System.out.println("please select an option---->1.Student,2.Teacher,3.School");

			option = Integer.parseInt(br.readLine());

			switch (option) {

			case 1:
				System.out.println("==========student module==========");

				int choice;
				do {
					System.out.println("Enter ur choice--->1.Enter student Details 2.Display student Details 3.delete the details");
					choice = Integer.parseInt(br.readLine());
					switch (choice) {

					case 1:
						System.out.println("Enter student id:");
						int id = Integer.parseInt(br.readLine());
						System.out.println("Enter student firstname:");
						String name = br.readLine();
						System.out.println("Enter student lastname:");
						String lname = br.readLine();

						System.out.println("Enter student marks:");
						int marks = Integer.parseInt(br.readLine());
						System.out.println("Enter student grade:");
						String grade = br.readLine();
						
						sl.add(new Student1(id, name, lname, marks, grade));
						break;

					// display student details
					case 2:
						System.out.println("*****student details are*******");

						for (Student1 st : sl) {
							System.out.println("student id:" + st.id);
							System.out.println("student firstname:" + st.name);
							System.out.println("student lastname:" + st.lname);
							System.out.println("student marks:" + st.marks);
							System.out.println("student Grade:" + st.grade);
							

						}

						break;
					case 3:// delete student details
						System.out.println("Enter index to delete the student details:");
						int n = Integer.parseInt(br.readLine());
						sl.remove(n);
						break;
					case 4:
						break;

					default:
						System.out.println("Invalid Choice");
					}
				} while (choice <= 3);
				break;
			case 2:
				System.out.println("******Teacher Module******* ");
				int choice1;
				do {

					System.out.println(
							"Enter ur choice1--->1.Enter Teacher Details 2.Display Teacher Details 3.delete the details");
					choice1 = Integer.parseInt(br.readLine());
					switch (choice1) {

					case 1:
						System.out.println("=========Teacher module==========");

						System.out.println("Enter Teacher name:");
						String tname = br.readLine();
						System.out.println("Enter Teacher Gender:");
						String Gender = br.readLine();
						System.out.println("Enter Teacher subject:");
						String tsubj = br.readLine();
						System.out.println("Enter Teacher salary:");
						int salary = Integer.parseInt(br.readLine());
						tl.add(new Teacher1(tname, Gender, tsubj, salary));
						break;

					// display teacher details
					case 2:
						System.out.println("********* Teacher Details are*********** ");
						for (Teacher1 te : tl) {

							System.out.println("Teacher name:" + te.tname);
							System.out.println("Teacher Gender:" + te.Gender);
							System.out.println("Teacher subject:" + te.tsubj);
							System.out.println("Teacher salary:" + te.salary);
						}
						break;
					case 3:// delete Teacher details
						System.out.println("Enter index to delete the Teacher details:");
						int m = Integer.parseInt(br.readLine());
						tl.remove(m);
						break;
					case 4:
						    break;
					default:
						System.out.println("Invalid choice");
						
					}
				} while (choice1 <= 3);
                  break;
			case 3:
				System.out.println("*******School Module********");
				int choice2;
				do {
					System.out.println("Enter ur choice2--->1.Enter School Details 2.Display School Details 3.delete the details");
					choice2 = Integer.parseInt(br.readLine());
					switch (choice2) {
					case 1:
						System.out.println("========school module==========");
						// school details

						
						System.out.println("Enter school strength:");
						int schoolStrength = Integer.parseInt(br.readLine());
						System.out.println("Enter fee:");
						int fees = Integer.parseInt(br.readLine());
						System.out.println("Enter school contact number:");
						long schoolContactNo = Long.parseLong(br.readLine());
						System.out.println("Enter school mail id:");
						String mailId = br.readLine();
						hl.add(new School1(schoolStrength, fees, schoolContactNo, mailId));
						break;
					// display details
					case 2:
						System.out.println("****** school details********");
						for (School1 sc : hl) {
							
							System.out.println("Total school strength:" + sc.schoolStrength);
							System.out.println("Student fee:" + sc.fees);
							System.out.println("School contact Number:" + sc.schoolContactNo);
							System.out.println("School email Id:" + sc.mailId);

						}
						break;
					case 3:// delete school details
						System.out.println("Enter index to delete the School details:");
						int p = Integer.parseInt(br.readLine());
						hl.remove(p);
						break;
					case 4:
						break;

					default:
						//System.out.println("********Thank You Visit Again*********");
                      System.out.println("Invalid option");
					}
				} while (choice2 <= 3);
			case 4:System.out.println("********Thank You Visit Again*********");
				   break;
			default:System.out.println("Invalid option");
			}
		} while (option <= 3);

	}
}
