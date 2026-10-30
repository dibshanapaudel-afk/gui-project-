//abstract parent class
public abstract class GymMember{
    //attributes
    protected int ID;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    //constructor
    public GymMember(int ID, String name, String location, String phone, 
    String email, String gender, String DOB, 
    String membershipStartDate, int attendance, double loyaltyPoints, 
    boolean activeStatus){
    this.ID = ID;
    this.name = name;
    this.location = location;
    this.phone = phone;
    this.email = email;
    this.gender = gender;
    this.DOB = DOB;
    this.membershipStartDate = membershipStartDate;
    this.attendance = 0;
    this.loyaltyPoints = 0;
    this.activeStatus = false;
    }
    //accessor methods
    public int getID(){
        return this.ID;  
    }
    public String getname(){
        return this.name;
    }
    public String getlocation(){
        return this.location;
    }
    public String getphone(){
        return this.phone;
    }
    public String getemail(){
        return this.email;
    }
    public String getgender(){
        return this.gender;
    }
    public String getDOB(){
        return this.DOB;
    }
    public String getmembershipStartDate(){
        return this.membershipStartDate;
    }
    public int getattendance(){
        return this.attendance;
    }
    public double getloyaltyPoints(){
        return this.loyaltyPoints;
    }
    public boolean getactiveStatus(){
        return this.activeStatus;
    }
    // abs method
    public abstract void markAttendance();
    //regular method
    public void activeMembership(){
        activeStatus = true;
    }
    public void deactiveMembership(){
        activeStatus = false;
    }
    public void resetMember(){
        activeStatus = false;
        attendance = 0;
        loyaltyPoints = 0;    
    }
    // display
public void displaymemberinformations(){
    System.out.println("ID: " + ID);
    System.out.println("name: " + name);
    System.out.println("location: " + location);
    System.out.println("phone: " + phone);
    System.out.println("email: " + email);
    System.out.println("gender: " + gender);
    System.out.println("DOB: " + DOB);
    System.out.println("membershipStartDate: " + membershipStartDate);
    System.out.println("attendance: " + attendance);
    System.out.println("loyaltyPoints: " + loyaltyPoints);
    System.out.println("activeStatus: " + activeStatus);
}
}