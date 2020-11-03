import java.io.*;
import java.io.IOException;
import java.util.*;

public class StoreAddress {
    ArrayList<PersonInfo> persons;
    PersonInfo personsInfo;
    Scanner scanner = new Scanner(System.in);

    StoreAddress() {
        persons = new ArrayList<PersonInfo>();
    }

    public void addPerson() {
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        System.out.println("Enter City");
        String city = scanner.nextLine();
        System.out.println("Enter State");
        String state = scanner.nextLine();
        System.out.println("Enter ZIP Code");
        String zip = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.nextLine();

        personsInfo = new PersonInfo(firstName, lastName, address, city, state, zip, phoneNumber);
        persons.add(personsInfo);
        System.out.println("Added Successfully");
        printforaddressbook();
        
    }

    public void editPerson(String name) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo personInfo = (PersonInfo) persons.get(i);
            if (name.toLowerCase().equals(personInfo.getFirstName().toLowerCase())) {
                for (PersonInfo person : persons) {
                    System.out.println(person);
                }
                System.out.println(
                        "Do you want to edit \n 1. Address \n 2. City \n 3. State \n 4. Zip \n 5. Phone Number \n 6.exit");
                int choice = scanner.nextInt();
                PersonInfo newInfo;
                switch (choice) {
                    case 1:
                        Scanner s1 = new Scanner(System.in);
                        System.out.println("Enter an Address");
                        String address = s1.nextLine();
                        newInfo = new PersonInfo(personInfo.getFirstName(), personInfo.getLastName(), address,
                                personInfo.getCity(), personInfo.getState(), personInfo.getZIP(),
                                personInfo.getPhoneNumber());
                        persons.add(newInfo);
                        System.out.println("Updated Successfully");
                        break;
                    case 2:
                        Scanner s2 = new Scanner(System.in);
                        System.out.println("Enter an City");
                        String city = s2.nextLine();
                        newInfo = new PersonInfo(personInfo.getFirstName(), personInfo.getLastName(),
                                personInfo.getAddress(), city, personInfo.getState(), personInfo.getZIP(),
                                personInfo.getPhoneNumber());
                        persons.add(newInfo);
                        System.out.println("Updated Successfully");
                        break;
                    case 3:
                        Scanner s3 = new Scanner(System.in);
                        System.out.println("Enter an State");
                        String state = s3.nextLine();
                        newInfo = new PersonInfo(personInfo.getFirstName(), personInfo.getLastName(),
                                personInfo.getAddress(), personInfo.getCity(), state, personInfo.getZIP(),
                                personInfo.getPhoneNumber());
                        persons.add(newInfo);
                        System.out.println("Updated Successfully");
                        break;
                    case 4:
                        Scanner s4 = new Scanner(System.in);
                        System.out.println("Enter an Zip");
                        String zip = s4.nextLine();
                        newInfo = new PersonInfo(personInfo.getFirstName(), personInfo.getLastName(),
                                personInfo.getAddress(), personInfo.getCity(), personInfo.getState(), zip,
                                personInfo.getPhoneNumber());
                        persons.add(newInfo);
                        System.out.println("Updated Successfully");
                        break;
                    case 5:
                        Scanner s5 = new Scanner(System.in);
                        System.out.println("Enter an Phone Number");
                        String phoneNumber = s5.nextLine();
                        newInfo = new PersonInfo(personInfo.getFirstName(), personInfo.getLastName(),
                                personInfo.getAddress(), personInfo.getCity(), personInfo.getState(),
                                personInfo.getZIP(), phoneNumber);
                        persons.add(newInfo);
                        System.out.println("Updated Successfully");
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void deletePerson(String name) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo personInfo = (PersonInfo) persons.get(i);
            if (name.equals(personInfo.getFirstName())) {
                for (PersonInfo person : persons) {
                    System.out.println(person);
                }
                persons.remove(i);
                System.out.println("Successfully Removed the above information");
            }
        }
    }

    public void display() {
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public void sortedlistbyName() {
        Collections.sort(persons, PersonInfo.lastNameComparator);

        for (PersonInfo person : persons) {
            System.out.println(person);
        }
    }

    public void sortedlistbyzip() {
        Collections.sort(persons, PersonInfo.zipComparator);

        for (PersonInfo person : persons) {
            System.out.println(person);
        }

    }

    public void printforaddressbook() {
        try {
            FileWriter file = new FileWriter("addressbook.txt");
            file.write(personsInfo.getFirstName()+""+personsInfo.getLastName()+"\n"+personsInfo.getAddress()+"\n"+personsInfo.getCity()+"\n"+personsInfo.getState()+"-"+personsInfo.getZIP()+"\n"+personsInfo.getPhoneNumber());
            file.close();
        } catch (IOException e) {
            System.out.println("error :"+e);
            e.printStackTrace();
        }
    }

}