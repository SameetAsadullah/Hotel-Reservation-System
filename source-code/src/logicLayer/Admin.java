package logicLayer;

import dataLayer.writerAndReader;
import java.util.Vector;
import java.io.*;

public class Admin {
    private String name, address, email, password, phoneNo, CNIC, accountNo;
    private int ID;

    //constructors
    public Admin() {
    }
    public Admin(int id, String mail, String pass, String Name,
                  String add, String phone, String cnic, String accNo) {
        ID = id;
        name = Name;
        address = add;
        phoneNo = phone;
        CNIC = cnic;
        accountNo = accNo;
        email = mail;
        password = pass;
    }

    //getters
    public int getID() {
        return ID;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public String getCNIC() {
        return CNIC;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    //setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    //Function to Edit Customer
    public void editCustomer(String Email,String ChangeType,String Change,Vector<Customer> Custms, writerAndReader ReadAndWrite){
        for(int i=0;i<Custms.size();++i){
            if(Email.equals(Custms.get(i).getEmail())){
                if(ChangeType=="AccountNo"){
                    Custms.get(i).setAccountNo(Change);
                }
                else if(ChangeType=="CNIC"){
                    Custms.get(i).setCNIC(Change);
                }
                else if(ChangeType=="Address"){
                    Custms.get(i).setAddress(Change);
                }
                else if(ChangeType=="Name"){
                    Custms.get(i).setName(Change);
                }
                else if(ChangeType=="Password"){
                    Custms.get(i).setPassword(Change);
                }
                else if(ChangeType=="PhoneNo"){
                    Custms.get(i).setPhoneNo(Change);
                }
                else if(ChangeType=="Email"){
                    Custms.get(i).setEmail(Change);
                }

                i=Custms.size();
            }
        }
        ReadAndWrite.truncAFile("./src/dataLayer/customers.csv");
        ReadAndWrite.writeHeadersInFile(0);//0 For Customer
        for(int i=0;i<Custms.size();++i){
            ReadAndWrite.writeCustomerIntoFile(Custms.get(i));
        }
    }

    //Function to Delete Customer
    public void DeleteCustomer(String Email,Vector<Customer> Custms, writerAndReader ReadAndWrite){
        int t=-1;
        for(int i=0;i<Custms.size();++i){
            //Replacing IDs and Also Finding Index to Delete
            if(t!=-1){
                Custms.get(i).setID(Custms.get(i-1).getID());
            }
            else if (Email.equals(Custms.get(i).getEmail())){
                t=i;
            }
        }
        Custms.remove(t);//Removing Customer From Vector
        ReadAndWrite.truncAFile("./src/dataLayer/customers.csv");
        ReadAndWrite.writeHeadersInFile(0);//0 For Customer
        for(int i=0;i<Custms.size();++i){
            ReadAndWrite.writeCustomerIntoFile(Custms.get(i));
        }
    }

    //Function to Edit Vendor
    public void editVendor(String Email, String ChangeType,String Change ,Vector<Vendor> Vends, writerAndReader ReadAndWrite){
        for(int i=0;i<Vends.size();++i){
            if(Email.equals(Vends.get(i).getEmail())){
                if(ChangeType=="AccountNo"){
                    Vends.get(i).setAccountNo(Change);
                }
                else if(ChangeType=="CNIC"){
                    Vends.get(i).setCNIC(Change);
                }
                else if(ChangeType=="Address"){
                    Vends.get(i).setAddress(Change);
                }
                else if(ChangeType=="Name"){
                    Vends.get(i).setName(Change);
                }
                else if(ChangeType=="Password"){
                    Vends.get(i).setPassword(Change);
                }
                else if(ChangeType=="PhoneNo"){
                    Vends.get(i).setPhoneNo(Change);
                }
                else if(ChangeType=="Email"){
                    Vends.get(i).setEmail(Change);
                }
                i=Vends.size();
            }
        }
        ReadAndWrite.truncAFile("./src/dataLayer/vendors.csv");
        ReadAndWrite.writeHeadersInFile(1);//1 For Vendor
        for(int i=0;i<Vends.size();++i){
            ReadAndWrite.writeVendorIntoFile(Vends.get(i));
        }
    }

    //Function to Delete Vendor
    public void DeleteVendor(String Email,Vector<Vendor> Vends, writerAndReader ReadAndWrite){
        int t=-1;
        for(int i=0;i<Vends.size();++i){
            //Replacing IDs and Also Finding Index to Delete
            if(t!=-1){
                Vends.get(i).setID(Vends.get(i-1).getID());
            }
            else if (Email.equals(Vends.get(i).getEmail())){
                t=i;
            }
        }
        Vends.remove(t);//Removing Customer From Vector
        ReadAndWrite.truncAFile("./src/dataLayer/vendors.csv");
        ReadAndWrite.writeHeadersInFile(1);//1 For Vendor
        for(int i=0;i<Vends.size();++i){
            ReadAndWrite.writeVendorIntoFile(Vends.get(i));
        }
    }

    //Function to Edit Hotel
    public void editHotel(String Name,String Loc,String ChangeType,String Change ,Vector<Hotel> Hots, writerAndReader ReadAndWrite){
        for(int i=0;i<Hots.size();++i){
            if(Name.equals(Hots.get(i).getName()) && Loc.equals(Hots.get(i).getLocation())){
                if(ChangeType=="TotalRoooms"){
                    ;
                }

                else if(ChangeType=="SingleRooms"){
                    Hots.get(i).setSingleRooms(Change);
                }
                else if(ChangeType=="DoubleRooms"){
                    Hots.get(i).setDoubleRooms(Change);
                }
                else if(ChangeType=="SingleRoomPrice"){
                    Hots.get(i).setSingleRoomPrice(Change);
                }
                else if(ChangeType=="DoubleRoomPrice"){
                    Hots.get(i).setSingleRoomPrice(Change);
                }
                else if(ChangeType=="Name"){
                    Hots.get(i).setName(Change);
                }
                else if(ChangeType=="Address"){
                    Hots.get(i).setAddress(Change);
                }
                else if(ChangeType=="Location"){
                    Hots.get(i).setLocation(Change);
                }
                i=Hots.size();
            }
        }
        ReadAndWrite.truncAFile("./src/dataLayer/hotels.csv");
        ReadAndWrite.writeHeadersInFile(3);//3 For Hotel
        for(int i=0;i<Hots.size();++i){
            ReadAndWrite.writeHotelIntoFile(Hots.get(i));
        }
    }

    //Function to Delete Hotel
    public void DeleteHotel(String Name,String Loc,Vector<Hotel> Hots, writerAndReader ReadAndWrite){
        int t=-1;
        for(int i=0;i<Hots.size();++i){
            //Replacing IDs and Also Finding Index to Delete
            if(t!=-1){
                Hots.get(i).setID(Hots.get(i-1).getID());
            }
            else if (Name.equals(Hots.get(i).getName()) && Loc.equals(Hots.get(i).getLocation())){
                t=i;
            }
        }
        Hots.remove(t);//Removing Customer From Vector
        ReadAndWrite.truncAFile("./src/dataLayer/hotels.csv");
        ReadAndWrite.writeHeadersInFile(3);//3 For Hotel
        for(int i=0;i<Hots.size();++i){
            ReadAndWrite.writeHotelIntoFile(Hots.get(i));
        }
    }

    //Function to Edit Receptionist
    public void editReceptionist(String Email,String ChangeType,String Change  ,Vector<Receptionist> Reps, writerAndReader ReadAndWrite){
        for(int i=0;i<Reps.size();++i){
            if(Email.equals(Reps.get(i).getEmail())){
                if(ChangeType=="AccountNo"){
                    Reps.get(i).setAccountNo(Change);
                }
                else if(ChangeType=="CNIC"){
                    Reps.get(i).setCNIC(Change);
                }
                else if(ChangeType=="Address"){
                    Reps.get(i).setAddress(Change);
                }
                else if(ChangeType=="Name"){
                    Reps.get(i).setName(Change);
                }
                else if(ChangeType=="Password"){
                    Reps.get(i).setPassword(Change);
                }
                else if(ChangeType=="PhoneNo"){
                    Reps.get(i).setPhoneNo(Change);
                }
                else if(ChangeType=="Email"){
                    Reps.get(i).setEmail(Change);
                }

                i=Reps.size();
            }
        }
        ReadAndWrite.truncAFile("./src/dataLayer/receptionists.csv");
        ReadAndWrite.writeHeadersInFile(2);//2 For Receptionist
        for(int i=0;i<Reps.size();++i){
            ReadAndWrite.writeReceptionistIntoFile(Reps.get(i));
        }
    }

    //Function to Delete Receptionist
    public void DeleteReceptionist(String Email,Vector<Receptionist> Reps, writerAndReader ReadAndWrite){
        int t=-1;
        for(int i=0;i<Reps.size();++i){
            //Replacing IDs and Also Finding Index to Delete
            if(t!=-1){
                Reps.get(i).setID(Reps.get(i-1).getID());
            }
            else if (Email.equals(Reps.get(i).getEmail())){
                t=i;
            }
        }
        Reps.remove(t);//Removing Customer From Vector
        ReadAndWrite.truncAFile("./src/dataLayer/receptionists.csv");
        ReadAndWrite.writeHeadersInFile(2);//2 For Receptionist
        for(int i=0;i<Reps.size();++i){
            ReadAndWrite.writeReceptionistIntoFile(Reps.get(i));
        }
    }

}
