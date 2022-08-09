package dataLayer;

import logicLayer.*;

import java.io.*;
import java.time.LocalDate;
import java.util.Vector;

public class writerAndReader {

    //function for writing headings in newly created file
    public void writeHeadersInFile(int fileCheck) {
        try {
            FileWriter fileWriter = null;
            if (fileCheck == 0) {           //0 indicates file of customers to be opened
                fileWriter = new FileWriter("./src/dataLayer/customers.csv", true);
            } else if (fileCheck == 1) {    //1 indicates file of vendors to be opened
                fileWriter = new FileWriter("./src/dataLayer/vendors.csv", true);
            } else if (fileCheck == 2) {    //2 indicates file of receptionists to be opened
                fileWriter = new FileWriter("./src/dataLayer/receptionists.csv", true);
            } else if (fileCheck == 3){     //3 indicates file of hotels to be opened
                fileWriter = new FileWriter("./src/dataLayer/hotels.csv", true);
            } else if (fileCheck == 4) {    //4 indicates file of admins to be opened
                fileWriter = new FileWriter("./src/dataLayer/admins.csv", true);
            } else if (fileCheck == 5){     //5 indicates file of rooms to be opened
                fileWriter = new FileWriter("./src/dataLayer/rooms.csv", true);
            }
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            if (fileCheck == 0 || fileCheck == 1 || fileCheck == 2 || fileCheck == 4) {
                bufferedWriter.append("ID,Name,Email,Password,PhoneNo,CNIC,AccountNo,Address\n");
            } else if (fileCheck == 3){
                bufferedWriter.append("ID,Name,Address,Location,Single-Rooms,Double-Rooms,Single-Room-Price,Double-Room-Price\n");
            } else if (fileCheck == 5) {
                bufferedWriter.append("Hotel-ID,Room-No,Type,Available-Date,isAvailable\n");
            }
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for writing data into customer file
    public void writeCustomerIntoFile(Customer c) {
        try {
            FileWriter fileWriter = new FileWriter("./src/dataLayer/customers.csv", true);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.append(c.getID() + "," + c.getName() + "," + c.getEmail() + "," + c.getPassword() + ",");
            bufferedWriter.append(c.getPhoneNo() + "," + c.getCNIC() + "," + c.getAccountNo() + "," + c.getAddress() + "\n");
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for reading data from customer file
    public void readCustomersFromFile(Vector<Customer> customers) {
        Customer c = new Customer();
        int value, temp = 1;
        String strLine = "";
        boolean check = false;

        try {
            FileInputStream fileStream = new FileInputStream("./src/dataLayer/customers.csv");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(dataStream));
            while ((value = bufferReader.read()) != -1) {
                char character = (char) value;
                if (character != ',' && character != '\n') {
                    strLine += character;
                } else {
                    //if the first line which consists headers is being read
                    if (check == false) {
                        if (character == '\n') {
                            check = true;
                            strLine = "";
                        }
                        continue;
                    }

                    //Saving data because now it's not the first line of headers
                    if (temp == 1) {
                        c.setID(Integer.parseInt(strLine));
                    } else if (temp == 2) {
                        c.setName(strLine);
                    } else if (temp == 3) {
                        c.setEmail(strLine);
                    } else if (temp == 4) {
                        c.setPassword(strLine);
                    } else if (temp == 5) {
                        c.setPhoneNo(strLine);
                    } else if (temp == 6) {
                        c.setCNIC(strLine);
                    } else if (temp == 7) {
                        c.setAccountNo(strLine);
                    } else if (temp == 8) {
                        c.setAddress(strLine);
                        temp = 0;
                        customers.add(c);
                        c = new Customer();
                    }
                    temp++;
                    strLine = "";
                }
            }
            dataStream.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for writing data into admin file
    public void writeAdminIntoFile(Admin c) {
        try {
            FileWriter fileWriter = new FileWriter("./src/dataLayer/admins.csv", true);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.append(c.getID() + "," + c.getName() + "," + c.getEmail() + "," + c.getPassword() + ",");
            bufferedWriter.append(c.getPhoneNo() + "," + c.getCNIC() + "," + c.getAccountNo() + "," + c.getAddress() + "\n");
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for reading data from admins file
    public void readAdminsFromFile(Vector<Admin> admin) {
        Admin c = new Admin();
        int value, temp = 1;
        String strLine = "";
        boolean check = false;

        try {
            FileInputStream fileStream = new FileInputStream("./src/dataLayer/admins.csv");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(dataStream));
            while ((value = bufferReader.read()) != -1) {
                char character = (char) value;
                if (character != ',' && character != '\n') {
                    strLine += character;
                } else {
                    //if the first line which consists headers is being read
                    if (check == false) {
                        if (character == '\n') {
                            check = true;
                            strLine = "";
                        }
                        continue;
                    }

                    //Saving data because now it's not the first line of headers
                    if (temp == 1) {
                        c.setID(Integer.parseInt(strLine));
                    } else if (temp == 2) {
                        c.setName(strLine);
                    } else if (temp == 3) {
                        c.setEmail(strLine);
                    } else if (temp == 4) {
                        c.setPassword(strLine);
                    } else if (temp == 5) {
                        c.setPhoneNo(strLine);
                    } else if (temp == 6) {
                        c.setCNIC(strLine);
                    } else if (temp == 7) {
                        c.setAccountNo(strLine);
                    } else if (temp == 8) {
                        c.setAddress(strLine);
                        temp = 0;
                        admin.add(c);
                        c = new Admin();
                    }
                    temp++;
                    strLine = "";
                }
            }
            dataStream.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for writing data into vendor file
    public void writeVendorIntoFile(Vendor v) {
        try {
            FileWriter fileWriter = new FileWriter("./src/dataLayer/vendors.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(v.getID() + "," + v.getName() + "," + v.getEmail() + "," + v.getPassword() + ",");
            bufferedWriter.append(v.getPhoneNo() + "," + v.getCNIC() + "," + v.getAccountNo() + "," + v.getAddress() + "\n");
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for reading data from vendor file
    public void readVendorsFromFile(Vector<Vendor> vendors) {
        Vendor v = new Vendor();
        int value, temp = 1;
        String strLine = "";
        boolean check = false;

        try {
            FileInputStream fileStream = new FileInputStream("./src/dataLayer/vendors.csv");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(dataStream));
            while ((value = bufferReader.read()) != -1) {
                char character = (char) value;
                if (character != ',' && character != '\n') {
                    strLine += character;
                } else {
                    //if the first line which consists headers is being read
                    if (check == false) {
                        if (character == '\n') {
                            check = true;
                            strLine = "";
                        }
                        continue;
                    }

                    //Saving data because now it's not the first line of headers
                    if (temp == 1) {
                        v.setID(Integer.parseInt(strLine));
                    } else if (temp == 2) {
                        v.setName(strLine);
                    } else if (temp == 3) {
                        v.setEmail(strLine);
                    } else if (temp == 4) {
                        v.setPassword(strLine);
                    } else if (temp == 5) {
                        v.setPhoneNo(strLine);
                    } else if (temp == 6) {
                        v.setCNIC(strLine);
                    } else if (temp == 7) {
                        v.setAccountNo(strLine);
                    } else if (temp == 8) {
                        v.setAddress(strLine);
                        temp = 0;
                        vendors.add(v);
                        v = new Vendor();
                    }
                    temp++;
                    strLine = "";
                }
            }
            dataStream.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for writing data into receptionist file
    public void writeReceptionistIntoFile(Receptionist r) {
        try {
            FileWriter fileWriter = new FileWriter("./src/dataLayer/receptionists.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(r.getID() + "," + r.getName() + "," + r.getEmail() + "," + r.getPassword() + ",");
            bufferedWriter.append(r.getPhoneNo() + "," + r.getCNIC() + "," + r.getAccountNo() + "," + r.getAddress() + "\n");
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for reading data from receptionist file
    public void readReceptionistFromFile(Vector<Receptionist> receptionists) {
        Receptionist r = new Receptionist();
        int value, temp = 1;
        String strLine = "";
        boolean check = false;

        try {
            FileInputStream fileStream = new FileInputStream("./src/dataLayer/receptionists.csv");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(dataStream));
            while ((value = bufferReader.read()) != -1) {
                char character = (char) value;
                if (character != ',' && character != '\n') {
                    strLine += character;
                } else {
                    //if the first line which consists headers is being read
                    if (check == false) {
                        if (character == '\n') {
                            check = true;
                            strLine = "";
                        }
                        continue;
                    }

                    //Saving data because now it's not the first line of headers
                    if (temp == 1) {
                        r.setID(Integer.parseInt(strLine));
                    } else if (temp == 2) {
                        r.setName(strLine);
                    } else if (temp == 3) {
                        r.setEmail(strLine);
                    } else if (temp == 4) {
                        r.setPassword(strLine);
                    } else if (temp == 5) {
                        r.setPhoneNo(strLine);
                    } else if (temp == 6) {
                        r.setCNIC(strLine);
                    } else if (temp == 7) {
                        r.setAccountNo(strLine);
                    } else if (temp == 8) {
                        r.setAddress(strLine);
                        temp = 0;
                        receptionists.add(r);
                        r = new Receptionist();
                    }
                    temp++;
                    strLine = "";
                }
            }
            dataStream.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for writing data into hotel file
    public void writeHotelIntoFile(Hotel h) {
        try {
            FileWriter fileStream = new FileWriter("./src/dataLayer/hotels.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileStream);
            bufferedWriter.append(h.getID() + "," + h.getName() + "," + h.getAddress() + "," + h.getLocation() + "," + h.getSingleRooms() + ",");
            bufferedWriter.append(h.getDoubleRooms() + "," + h.getSingleRoomPrice() + "," + h.getDoubleRoomPrice() + "\n");
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for reading data from hotel file
    public void readHotelsFromFile(Vector<Hotel> hotels) {
        Hotel h;
        int value, temp = 1, ID = 0;
        String strLine = "", name = "", address = "", location = "", sRooms = "", dRooms = "", sRoomPrice = "", dRoomPrice = "";
        boolean check = false;

        try {
            FileInputStream fileStream = new FileInputStream("./src/dataLayer/hotels.csv");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(dataStream));
            while ((value = bufferReader.read()) != -1) {
                char character = (char) value;
                if (character != ',' && character != '\n') {
                    strLine += character;
                } else {
                    //if the first line which consists headers is being read
                    if (check == false) {
                        if (character == '\n') {
                            check = true;
                            strLine = "";
                        }
                        continue;
                    }

                    //Saving data because now it's not the first line of headers
                    if (temp == 1) {
                        ID = Integer.parseInt(strLine);
                    } else if (temp == 2) {
                        name = strLine;
                    } else if (temp == 3) {
                        address = strLine;
                    } else if (temp == 4) {
                        location = strLine;
                    } else if (temp == 5) {
                        sRooms = strLine;
                    } else if (temp == 6) {
                        dRooms = strLine;
                    } else if (temp == 7) {
                        sRoomPrice = strLine;
                    } else {
                        dRoomPrice = strLine;
                        h = new Hotel(ID, name, address, location, sRooms, dRooms, sRoomPrice, dRoomPrice);
                        hotels.add(h);
                        temp = 0;
                        name = "";
                        address = "";
                        location = "";
                        sRooms = "";
                        dRooms = "";
                        sRoomPrice = "";
                        dRoomPrice = "";
                    }
                    temp++;
                    strLine = "";
                }
            }
            dataStream.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for writing data into rooms file
    public void writeRoomsIntoFile(Hotel h) {
        try {
            FileWriter fileStream = new FileWriter("./src/dataLayer/rooms.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileStream);
            for (int i = 0; i < h.getRooms().size(); ++i) {
                bufferedWriter.append(h.getID() + "," + h.getRooms().get(i).getNumber() + "," + h.getRooms().get(i).getType() + ",");
                bufferedWriter.append(h.getRooms().get(i).getAvailableDate() + "," + h.getRooms().get(i).isAvailable() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //function for reading data from rooms file
    public void readRoomsFromFile(Hotel hotel) {
        Vector<Room> rooms = new Vector<>();
        Room r = new Room();
        int value, temp = 1, ID = 0;
        String strLine = "";
        boolean check = false;

        try {
            FileInputStream fileStream = new FileInputStream("./src/dataLayer/rooms.csv");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(dataStream));
            while ((value = bufferReader.read()) != -1) {
                char character = (char) value;
                if (character != ',' && character != '\n') {
                    strLine += character;
                } else {
                    //if the first line which consists headers is being read
                    if (check == false) {
                        if (character == '\n') {
                            check = true;
                            strLine = "";
                        }
                        continue;
                    }

                    //Saving data because now it's not the first line of headers
                    if (temp == 1) {
                        ID = Integer.parseInt(strLine);
                    } else if (temp == 2) {
                        r.setNumber(Integer.parseInt(strLine));
                    } else if (temp == 3) {
                        r.setType(strLine);
                    } else if (temp == 4) {
                        if (!strLine.equals("null")) {
                            r.setAvailableDate(LocalDate.parse(strLine));
                        } else {
                            r.setAvailableDate(null);
                        }
                    } else if (temp == 5) {
                        r.setAvailable(Boolean.parseBoolean(strLine));
                        temp = 0;
                        if (ID == hotel.getID()) {
                            rooms.add(r);
                        }
                        r = new Room();
                    }
                    temp++;
                    strLine = "";
                }
            }
            hotel.setRooms(rooms);
            dataStream.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }

    //To Trunc A File to 0
    public void truncAFile(String fileName){
        try {
            FileWriter filetrunc = new FileWriter(fileName);
            filetrunc.close();
        }
        catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
}