package logicLayer;

public class Receptionist {
    private String name, address, email, password, phoneNo, CNIC, accountNo;
    private int ID;

    //constructors
    public Receptionist() {
    }
    public Receptionist(int id, String mail, String pass, String Name,
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
    public String getPhoneNo() {
        return phoneNo;
    }
    public String getCNIC() {
        return CNIC;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getID() {
        return ID;
    }

    //setters
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
