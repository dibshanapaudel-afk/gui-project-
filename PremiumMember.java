public class PremiumMember extends GymMember{
    private static final double preminumcharge = 50000;
    //final attributes
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    private final double premiumCharge;
    //constructor
    public PremiumMember(int ID, String name, String location, String phone, 
    String email, String gender, String DOB, 
    String membershipStartDate, int attendance, double loyaltyPoints, 
    boolean activeStatus){
        super(ID,name,location,phone,email,gender,DOB,membershipStartDate,
        attendance, loyaltyPoints, activeStatus);
        this.personalTrainer = personalTrainer;
        this.isFullPayment = false;
        this.premiumCharge = 50000;
        this.paidAmount = 0;
        this.discountAmount = 0;
    }
    @Override
    public void markAttendance(){
        this.attendance++;
        this.loyaltyPoints +=5;
    }
    // accessor methods
    public String getPersonalTrainer(){
        return personalTrainer;   
    }
    public boolean getisFullPayment(){
        return isFullPayment;
    }
    public double getPaidAmount(){
        return paidAmount;
    }
    public double getDiscountAmount(){
        return discountAmount;
    }
    public double getPreminumCharge(){
        return premiumCharge;
    }
    //method to pay deu amount
    public String payDeuAmount(double amount){
        if(this.isFullPayment){  
           return"Payment has been successfully processed";
        }
        if(paidAmount+amount>premiumCharge){
            return"Payment amount is higher than the premium charge";
        }
        paidAmount += amount;
        double remainingAmount = premiumCharge - paidAmount;
        isFullPayment = paidAmount == premiumCharge;
        return"Payment successful. Remaining amount:" + remainingAmount;        
    }

    // Method to calculate discount
    public String calculateDiscount() {
        if(isFullPayment) {
            discountAmount = premiumCharge * 0.10; // 10% discount
            return "Discount of " + discountAmount + " applied successfully.";
        } else {
            return "The discount is only available with full payment.";
        }
    }
    // Method to reset Premium Member details
    public void revertPremiumMember() {
        resetMember(); // Calls the superclass method to reset attendance & status
        this.personalTrainer = "";
        this.isFullPayment = false;
        this.paidAmount = 0;
        this.discountAmount = 0;
    }

    // Display method (overrides parent display method)
    @Override
    public void displaymemberinformations() {
        super.displaymemberinformations(); // Calls parent class display method
        System.out.println("Personal Trainer: " + personalTrainer);
        System.out.println("Paid Amount: " + paidAmount);
        System.out.println("Full Payment Status " + (isFullPayment ? "Yes" : "No"));
        System.out.println("Remaining Amount: " + (premiumCharge - paidAmount));
        if (isFullPayment) {
            System.out.println("Discount Amount: " + discountAmount);
        }
    }
}