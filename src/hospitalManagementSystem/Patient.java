package hospitalManagementSystem;

import java.util.Scanner;

public class Patient {
    String name;
    Doctor doctor;
    int age;
    String address;
    enum gender{
        Male,Female,Others;
    }
    Scanner sc=new Scanner(System.in);

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    Patient(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return this.name + "is treated by" + this.doctor.name+ "of"+this.doctor.profession;
    }
    public void addPatient(){
        System.out.println("Enter Patient name: ");
        String name=sc.nextLine();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        System.out.println("Enter address: ");
        String address =sc.nextLine();
    }
}
