//
public class RegularMember extends GymMember{
    //private attributes
    private final int attendanceLimit;
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    //contructors
    public RegularMember(int ID, String name, String location, String phone, String email, String gender, String DOB, 
    String membershipStartDate, int attendance, double loyaltyPoints, boolean activeStatus){
        super(ID, name, location, phone, email, gender, DOB, membershipStartDate, attendance, loyaltyPoints, activeStatus);
        this.attendanceLimit = 30;
        this.isEligibleForUpgrade = false;
        this.removalReason="";
        this.referralSource = referralSource;
        this.plan ="basic";
        this.price = 6500;
    }
    // accessor method
    public int getattendancelimit(){
        return this.attendanceLimit;
    }
    public boolean getisEligibleForUpgrade(){
        return this.isEligibleForUpgrade;
    }
    public String getremovalReason(){
        return this.removalReason;
    }
    public String getreferralSource(){
        return this.referralSource;
    }
    public String getplan(){
        return this.plan;
    }
    public double getprice(){
        return this.price;
    }
    
    @Override
    public void markAttendance(){
        attendance++;
        loyaltyPoints +=5;
        if(attendance >= attendanceLimit){
            isEligibleForUpgrade = true;
        }
    }
    
    public double getPlanPrice(String plan){
        switch (plan){
           case "basic" : return 6500;
           case "standard" : return 12500;
           case "deluxe" : return 18500;
           default : return -1;
        }
    }
    public String upgradePlan(String newPlan){
        if(!isEligibleForUpgrade){
            return"The upgrade is not available for this member yet.";
        }
        double newPrice = getPlanPrice(newPlan);
        if(newPrice == -1){
            return "The plan you selected is not available";
        }
        if(this.plan.equalsIgnoreCase(newPlan)){
            return" the member is already enrolled to this plan";
        }
        this.plan = newPlan;
        this.price = newPrice;
        return "plan succesfully upgraded to" + newPlan;
        }
    //resetin a member if memeber leave
    public void revertRegularMember(String removalReason){
        resetMember();
        this.isEligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = removalReason;
    }
    @Override
    public void displaymemberinformations(){
        super.displaymemberinformations();
        System.out.println("Plan: " + plan);
        System.out.println("Price: " + plan);
        if(!removalReason.isEmpty()){
            System.out.println("Removal Reason: " + removalReason);
        }
    }

}
 