import java.util.Comparator;

public class PersonInfo
{
    private String firstName,lastName,address,city,state,zip,phoneNumber;
    
    PersonInfo(){}
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return address;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public String getCity()
    {
        return city;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
    public void setZIP(String zip)
    {
        this.zip=zip;
    }
    public String getZIP()
    {
        return zip;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public PersonInfo(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setZIP(zip);
        setPhoneNumber(phoneNumber);
    }

    public static Comparator<PersonInfo> lastNameComparator = new Comparator<PersonInfo>() {

        public int compare(PersonInfo person1, PersonInfo person2) {
           String personinfo1 = person1.getLastName().toUpperCase();
           String personinfo2 = person2.getLastName().toUpperCase();
           if(personinfo1 == personinfo2)
           {
                new Comparator<PersonInfo>() {
                    public int compare(PersonInfo person1, PersonInfo person2) {
                        String personInfo1 = person1.getFirstName().toUpperCase();
                        String personInfo2 = person2.getFirstName().toUpperCase();
                        return personInfo1.compareTo(personInfo2);
                    }
                };
           }
           return personinfo1.compareTo(personinfo2);
		}
    };
    
        //Comparator for sorting the list by zip
        public static Comparator<PersonInfo> zipComparator = new Comparator<PersonInfo>() {

            public int compare(PersonInfo person1, PersonInfo person2) {
               String personinfo1 = person1.getZIP().toUpperCase();
               String personinfo2 = person2.getZIP().toUpperCase();
               if(personinfo1 == personinfo2)
                {
                    new Comparator<PersonInfo>() {
                        public int compare(PersonInfo person1, PersonInfo person2) {
                            String personInfo1 = person1.getFirstName().toUpperCase();
                            String personInfo2 = person2.getFirstName().toUpperCase();
                            return personInfo1.compareTo(personInfo2);
                        }
                    };
                }
                return personinfo1.compareTo(personinfo2);
            }
        };

    public String toString()
    {
        return "First Name : "+firstName+"\nLast Name : "+lastName+"\n Address : "+address+"\nCity : "+city+"\nState : "+state+"\nZip Code : "+zip+"\n Phone Number : "+phoneNumber;
    }
    
}
