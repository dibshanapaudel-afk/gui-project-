// importing required packaged 
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Frame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GymGUI{
    //instance variable 
    private ArrayList<GymMember> member = new ArrayList<GymMember>();
    private JLabel ID, name, location, phone, emai, gender, dob, memershipStartDate,referralSource, paidAmount, removalReason, trainersName, activeStatus;
    private JTextField IDTxt,nameTxt, locationTxt, phoneTxt, emailTxt, referralSourceTxt, paidAmountTxt, removalReasonTxt, trainersNameTxt, regularPriceTxt,
            premiumPriceTxt, discountTxt;
    private JComboBox DOBYear, DOBMonth, MembershipStartDate, MembershipMonth, MembershipDay, planComboBox;
    private JRadioButton femaleRadioButton, maleRadioButton;
    private JButton addRegularMember, addPreminumMember, addActiveMembership, addDeactiveMembership, addAttendance, addRevertMember, addClear, addDisplay ;
    private JFrame frame;
    
    //constructor 
    public GymGUI(){
        frame = new JFrame("24046375 Dibshana Paudel");
        frame.setSize(800,800);
        frame.setResizable(true);
        frame.setLayout(null);
        
        
        
    // id label and text field
        JLabel IDLabel = new JLabel("ID:");
        IDLabel.setBounds(260, 30, 50, 25);
        
        IDTxt = new JTextField();
        IDTxt.setBounds(310, 30, 120, 25);
    //name label and text field
        JLabel nameLabel = new JLabel("name:");
        nameLabel.setBounds(260, 70, 140, 25);
        
        nameTxt = new JTextField();
        nameTxt.setBounds(310, 70, 120, 25);
        
    //location label and text field
        JLabel locationLabel = new JLabel("location:");
        locationLabel.setBounds(260, 110, 140, 25);
        
         locationTxt = new JTextField();
        locationTxt.setBounds(310, 110, 120, 25);
    //phone label and text field
        JLabel phoneLabel = new JLabel("phone:");
        phoneLabel.setBounds(260, 150, 140, 25);
        
        phoneTxt = new JTextField();
        phoneTxt.setBounds(310, 150, 120, 25);
    //email label and text field  
        JLabel emailLabel = new JLabel("email:");
        emailLabel.setBounds(180, 190, 140, 25);
        
        emailTxt = new JTextField();
        emailTxt.setBounds(330, 190, 150, 25);
        
    //(Gender radio button)
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(180, 230, 140, 25);
        
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(330, 230, 70, 25);
        
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(410, 230, 80, 25);
        
        //Group radio button
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        
        // Date of Birth (Combo Boxes)
        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(180, 270, 140, 25);
        JComboBox<String> yearComboBox = new JComboBox<>();
        for (int i = 1900; i <= 2025; i++) {
            yearComboBox.addItem(String.valueOf(i));
        }
        yearComboBox.setBounds(330, 270, 60, 25);

        JComboBox<String> monthComboBox = new JComboBox<>();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : months) {
            monthComboBox.addItem(month);
        }
        monthComboBox.setBounds(400, 270, 80, 25);

        JComboBox<String> dayComboBox = new JComboBox<>();
        for (int i = 1; i <= 32; i++) {
            dayComboBox.addItem(String.valueOf(i));
        }
        dayComboBox.setBounds(490, 270, 50, 25);
        
        // Membership Start Date  (Combo Boxes)
        JLabel msdLabel = new JLabel("Membership Start Date:");
        msdLabel.setBounds(180, 310, 170, 25);
        JComboBox<String> msdyearComboBox = new JComboBox<>();
        for (int i = 2015; i <= 2025; i++) {
            msdyearComboBox.addItem(String.valueOf(i));
        }
        msdyearComboBox.setBounds(330, 310, 60, 25);

       JComboBox<String> msdmonthComboBox = new JComboBox<>();
        String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : months) {
            msdmonthComboBox.addItem(month);
        }
        msdmonthComboBox.setBounds(400, 310, 80, 25);

       JComboBox<String> msddayComboBox = new JComboBox<>();
        for (int i = 1; i <= 32; i++) {
        msddayComboBox.addItem(String.valueOf(i));
       }
       msddayComboBox.setBounds(490, 310, 50, 25);
       
       //referral source label and text field
     JLabel referralSourceLabel = new JLabel("referral Source:");
        referralSourceLabel.setBounds(450, 30, 120, 25);
        
        referralSourceTxt = new JTextField();
        referralSourceTxt.setBounds(580, 30, 120, 25);
        
    //paid amount label and text field
     JLabel paidAmountLabel = new JLabel("paidAmount:");
        paidAmountLabel.setBounds(450, 70, 140, 25);
        
        paidAmountTxt = new JTextField();
        paidAmountTxt.setBounds(580, 70, 120, 25);
        
    //removal reason label and text field
     JLabel removalReasonLabel = new JLabel("removalReason:");
        removalReasonLabel.setBounds(450, 110, 140, 25);
     removalReasonTxt = new JTextField();
        removalReasonTxt.setBounds(580, 110, 120, 25);
    //trainersname label and text field
     JLabel trainersNameLabel = new JLabel("trainersName:");
        trainersNameLabel.setBounds(450, 150, 140, 25);
        
     trainersNameTxt = new JTextField();
        trainersNameTxt.setBounds(580, 150, 120, 25);
        
    //ACTIVE STATUS LABEL 
        JLabel activeStatusLabel = new JLabel("Active Status: ");
        activeStatusLabel.setBounds(450, 190, 140, 25);
         
        //checkbox for active status
        JCheckBox activeStatusCheckBox = new JCheckBox("Active");
         activeStatusCheckBox.setBounds(650, 190, 80, 25);
        JCheckBox deactiveStatusCheckBox = new JCheckBox("deactive");
         deactiveStatusCheckBox.setBounds(850, 190, 80, 25);
        
         // Plan ComboBox
        JLabel planLabel = new JLabel("Plan:");
        planLabel.setBounds(180, 350, 140, 25);
        planComboBox = new JComboBox<>(new String[]{"Basic", "Standard", "Deluxe"});
        planComboBox.setBounds(330, 350, 150, 25);

     
          // Non-editable price fields
        JLabel regularPriceLabel = new JLabel("Regular Plan Price:");
        regularPriceLabel.setBounds(180, 400, 140, 25);
        regularPriceTxt = new JTextField("6500");
        regularPriceTxt.setBounds(330, 400, 150, 25);
        regularPriceTxt.setEditable(false);

        JLabel premiumPriceLabel = new JLabel("Premium Plan Charge:");
        premiumPriceLabel.setBounds(180, 440, 160, 25);
        premiumPriceTxt = new JTextField("12500");
        premiumPriceTxt.setBounds(330, 440, 150, 25);
        premiumPriceTxt.setEditable(false);

        JLabel discountLabel = new JLabel("Discount Amount:");
        discountLabel.setBounds(180, 480, 140, 25);
        discountTxt = new JTextField("10%");
        discountTxt.setBounds(330, 480, 150, 25);
        discountTxt.setEditable(false);
        
        
        
        // Buttons
        addRegularMember = new JButton("Add Regular Member");
        addRegularMember.setBounds(100, 670, 180, 30);
        
        
        addRegularMember.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                       int ID = Integer.parseInt(IDTxt.getText());
                        String name = nameTxt.getText();
                        String location = locationTxt.getText();
                        String phone = phoneTxt.getText();
                        String email = emailTxt.getText();
                        String gender = "";
                            if (maleRadioButton.isSelected()) {
                               gender = "Male";
                           } else if (femaleRadioButton.isSelected()) {
                               gender = "Female";
                           }
                        String DOB = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
                        String membershipStartDate = msddayComboBox.getSelectedItem() + "-" + msdmonthComboBox.getSelectedItem() + "-" + msdyearComboBox.getSelectedItem();
                        int attendance = 0;
                        double loyaltyPoints = 0;
                        boolean activeStatus = activeStatusCheckBox.isSelected();
                        
                        // validation for empty fields and agreement checkbox 
                     
                        if (name.isEmpty() || location.isEmpty() || phone.isEmpty() || email.isEmpty() || gender.isEmpty() || DOB.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Kindly fill all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                           // Check for duplicate ID
                        for (GymMember gm : member) {
                            if (gm.getID() == ID) {
                                JOptionPane.showMessageDialog(frame, "Dublicate Member ID!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        // Add regular  member
                        RegularMember rm = new RegularMember(ID, name, location, phone, email, gender, DOB, membershipStartDate, attendance, loyaltyPoints, activeStatus);
                        member.add(rm);

                        // Show member details in a dialog
                        String message = "Regular Member Added Successfully!\n\n"
                            + "ID: " + ID + "\n"
                            + "Name: " + name + "\n"
                            + "Location: " + location + "\n"
                            + "Phone: " + phone + "\n"
                            + "Email: " + email + "\n"
                            + "Gender: " + gender + "\n"
                            + "Date of Birth: " + DOB + "\n"
                            + "Membership Start Date: " + membershipStartDate + "\n"
                            + "Attendance: " + attendance + "\n"
                            + "Loyalty Points: " + loyaltyPoints + "\n"
                            + "Active Status: " + (activeStatus ? "Active" : "Deactive");
                            

                        JOptionPane.showMessageDialog(frame, message, "Successful", JOptionPane.INFORMATION_MESSAGE);

                    } 
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Incorrect ID!", "Error", JOptionPane.ERROR_MESSAGE);


        
                 }
                }
      });
        

        addPreminumMember = new JButton("Add Premium Member");
        addPreminumMember.setBounds(290, 670, 180, 30);
            addPreminumMember.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                       int ID = Integer.parseInt(IDTxt.getText());
                        String name = nameTxt.getText();
                        String location = locationTxt.getText();
                        String phone = phoneTxt.getText();
                        String email = emailTxt.getText();
                        String gender = "";
                            if (maleRadioButton.isSelected()) {
                               gender = "Male";
                           } else if (femaleRadioButton.isSelected()) {
                               gender = "Female";
                           }
                        String DOB = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
                        String membershipStartDate = msddayComboBox.getSelectedItem() + "-" + msdmonthComboBox.getSelectedItem() + "-" + msdyearComboBox.getSelectedItem();
                        int attendance = 0;
                        double loyaltyPoints = 0;
                        boolean activeStatus = activeStatusCheckBox.isSelected();
                        
                        // validation for empty fields and agreement checkbox 
                     
                        if (name.isEmpty() || location.isEmpty() || phone.isEmpty() || email.isEmpty() || gender.isEmpty() || DOB.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Kindly fill all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                           // Check for duplicate ID
                        for (GymMember gm : member) {
                            if (gm.getID() == ID) {
                                JOptionPane.showMessageDialog(frame, "ID is Dublicated!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        // Add premi  member
                        PremiumMember pm = new PremiumMember(ID, name, location, phone, email, gender, DOB, membershipStartDate, attendance, loyaltyPoints, activeStatus);
                        member.add(pm);

                        // member details in a dialog
                        String message = "Premium Member Added Successfully!\n\n"
                            + "ID: " + ID + "\n"
                            + "Name: " + name + "\n"
                            + "Location: " + location + "\n"
                            + "Phone: " + phone + "\n"
                            + "Email: " + email + "\n"
                            + "Gender: " + gender + "\n"
                            + "Date of Birth: " + DOB + "\n"
                            + "Membership Start Date: " + membershipStartDate + "\n"
                            + "Attendance: " + attendance + "\n"
                            + "Loyalty Points: " + loyaltyPoints + "\n"
                            + "Active Status: " + (activeStatus ? "Active" : "Deactive");
                            

                        JOptionPane.showMessageDialog(frame, message, "Successful", JOptionPane.INFORMATION_MESSAGE);

                    } 
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Incorrect ID!", "Error", JOptionPane.ERROR_MESSAGE);


        
                 }
                }
      });
        
        
        
        addActiveMembership = new JButton("Active Membership");
        addActiveMembership.setBounds(480, 670, 180, 30);
        
        addDeactiveMembership = new JButton("Deactive Membership");
        addDeactiveMembership.setBounds(670, 670, 180, 30); 
         
        addAttendance = new JButton("Mark Attendance");
        addAttendance.setBounds(100,750,180,30);
        
        addRevertMember = new JButton("Revert Member");
        addRevertMember.setBounds(290,750,180,30);
        
        addDisplay = new JButton("Display");
        addDisplay.setBounds(490,750,180,30);


        addDisplay.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        if (member.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No members available.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String displayText = ""; // Initialize as empty string

            for (GymMember gm : member) {
                String type = (gm instanceof RegularMember) ? "Regular Member" : "Premium Member";

                displayText = displayText + "Type: " + type + "\n"
                            + "ID: " + gm.getID() + "\n"
                            + "Name: " + gm.getname() + "\n"
                            + "Location: " + gm.getlocation() + "\n"
                            + "Phone: " + gm.getphone() + "\n"
                            + "Email: " + gm.getemail() + "\n"
                            + "Gender: " + gm.getgender() + "\n"
                            + "DOB: " + gm.getDOB() + "\n"
                            + "Membership Start Date: " + gm.getmembershipStartDate() + "\n"
                            + "Attendance: " + gm.getattendance() + "\n"
                            + "Loyalty Points: " + gm.getloyaltyPoints() + "\n"
                            + "Active Status: " + (gm.getactiveStatus() ? "Active" : "Deactive") + "\n\n";
            }

            JTextArea textArea = new JTextArea(displayText);
            textArea.setEditable(false);
            JOptionPane.showMessageDialog(frame, textArea, "Member Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }
});
        
        addClear = new JButton("Clear");
        addClear.setBounds(690,750,180,30);
        
        
        
        //adding components
       frame.add(IDLabel);
       frame.add(IDTxt);
       frame.add(nameLabel);
        frame.add(nameTxt);
        frame.add(locationLabel);
        frame.add(locationTxt);
        frame.add(phoneLabel);
        frame.add(phoneTxt);
        frame.add(emailLabel);
        frame.add(emailTxt);
        frame.add(genderLabel);
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);
        frame.add(dobLabel);
        frame.add(yearComboBox);
        frame.add(monthComboBox);
        frame.add(dayComboBox);
        frame.add(msdLabel);
        frame.add(msdyearComboBox);
        frame.add(msdmonthComboBox);
        frame.add(msddayComboBox);
        frame.add(referralSourceLabel);
        frame.add(referralSourceTxt);
        frame.add(paidAmountLabel);
        frame.add(paidAmountTxt);
        frame.add(removalReasonLabel);
        frame.add(removalReasonTxt);
        frame.add(trainersNameLabel);
        frame.add(trainersNameTxt);
        frame.add(regularPriceLabel);
        frame.add(regularPriceTxt);
        frame.add(premiumPriceLabel);
        frame.add(premiumPriceTxt);
        frame.add(discountLabel);
        frame.add(discountTxt);
        frame.add(addRegularMember);
        frame.add(addPreminumMember);
        frame.add(addActiveMembership);
        frame.add(addDeactiveMembership);
        frame.add(planLabel);
        frame.add(planComboBox);  
        frame.add(addAttendance);
        frame.add(addRevertMember); 
        frame.add(addDisplay);
        frame.add(addClear);
        frame.setVisible(true);
        
    }
    //main method
 public static void main (String[] args){
     new GymGUI();
    }
}