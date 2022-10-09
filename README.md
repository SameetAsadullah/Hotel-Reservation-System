<h1 align="center">Hotel Reservation Syste</h1>

### Description
A `Hotel Reservation System` named as `VBook`, coded in `Java and JavaFX`. Using csv files for storing the data. Administrator, Receptionist, Vendor, and Customer are the `Four Users` of this project and are described below:

#### Customer
- Can login
- Can SignUp
- Can Search Hotels
- Can Reserve Rooms

#### Vendor
- Can login
- Can SignUp
- Can Advertise Hotels
- Can view history

#### Receptionist
- Can login
- Can register Customers
- Can reserve bookings for customers
- Can register vendors
- Can advertise hotels of vendors

#### Admin
- Can edit/view/delete customer's data
- Can edit/view/delete vendor's data
- Can edit/view/delete receptionist's data
- Can edit/view/delete advertised hotels data

### Manual
1) [Download](https://download.oracle.com/otn/java/jdk/15.0.2%2B7/0d1cfde4252546c6931946de8db48ee2/jdk-15.0.2_windows-x64_bin.exe) and install `jdk-15` from the given link (`C:\Program Files\Java\jdk-15` folder should be there after installation)
    ```
    https://download.oracle.com/otn/java/jdk/15.0.2%2B7/0d1cfde4252546c6931946de8db48ee2/jdk-15.0.2_windows-x64_bin.exe
    ```
    
2) [Download](https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/requirements/) the javafx file from the given link and Extract it into C:\Program Files\Java
    ```
    https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/requirements/
    ```

3) Open the provided project in intelliJ
4) Go to run -> edit configurations -> Select your main that you are running -> Modify Option -> Tick the Add VM option
5) Paste the given code in the VM Box
    ```
    --module-path
    "C:\Program Files\Java\javafx-sdk-15.0.1\lib"
    --add-modules=javafx.controls,javafx.fxml
    ```

6) Right click on your project -> open module settings -> global libararies -> remove lib if already added -> add lib folder located in `C:\Program Files\Java\javafx-sdk-15.0.1`
7) Run the project and it will be in running state.

### Working Screenshots
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/homepage-ss.png" alt = "" width="700px"/>
</div>
<br/>
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/login-ss.png" alt = "" width="700px"/>
</div>
<br/>
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/signup-ss.png" alt = "" width="400px"/>
</div>
<br/>
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/reserve-ss.png" alt = "" width="700px"/>
</div>
<br/>
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/reservation-ss.png" alt = "" width="700px"/>
</div>
<br/>
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/register-ss.png" alt = "" width="700px"/>
</div>
<br/>
<div align="center">
  <img src = "https://github.com/SameetAsadullah/Hotel-Reservation-System/blob/main/extras/manage-ss.png" alt = "" width="700px"/>
</div>

### Contributors
- [Sameet Asadullah](https://github.com/SameetAsadullah) 
- [Tayyab Ali](https://github.com/DarkDragz)
- [Aysha Noor](https://github.com/ayshanoorr)
- [Syed Hamza Tahir](https://github.com/S-Y-3-D)
