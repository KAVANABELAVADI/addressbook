import java.util.*;

public class AddressBook
{
    public static void main(String args[])
    {
        //File file=new File("AddressBook1.txt"); 
        StoreAddress storeaddress=new StoreAddress();
        
		int choice;
        do
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println(" 1. Add address of person \n 2. Edit address of person \n 3. Delete address of person \n 4. Sort the list by LastName \n 5. Sort the list by ZipCode \n 6. Print all Entries \n 7.exit");
            choice=scanner.nextInt();
            
            String name;
			switch(choice)
            {
                case 1 : storeaddress.addPerson();
                         break;
                case 2 :  Scanner s=new Scanner(System.in); 
                          System.out.println("Enter firstName to edit");
                            name=s.nextLine();
                            storeaddress.editPerson(name);
                         break;
                case 3 :  Scanner s1=new Scanner(System.in);
                           System.out.println("Enter firstName to edit");
                           name=s1.nextLine();
                           storeaddress.deletePerson(name);
                          break;
                case 4 : storeaddress.sortedlistbyName();
                         break;
                case 5 : storeaddress.sortedlistbyzip();
                         break;
                case 6 : storeaddress.display();
                         break;
                case 7 : System.exit(choice);
            }
            System.out.println("Do you want to continue \n 1.yes \n 2. No");
            choice=scanner.nextInt();
        }while(choice==1);
    }
}