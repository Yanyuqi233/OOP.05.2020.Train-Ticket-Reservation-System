# (Object-Oriented Programming and Database Technology 05/2022)Train-Ticket-Reservation-System (The Project is in Chinese)

## System Requirements Analysis
The main functions of this system are to provide passengers with services for querying, booking, canceling tickets, and prioritizing the choice of upper and lower berths for elderly passengers. 

### From the passenger's perspective:
* Registration: New users must register before using this system.
* Login: Existing account holders can log in.
* Query: Passengers can search for trains based on departure date, departure location, arrival location, and whether the train is a high-speed rail.
* Booking: After finding a suitable train, passengers can book it. Passengers over 60 can choose upper or lower berths as a priority.
* Order details and ticket cancellation: Passengers can query and cancel their orders after booking.
* Change password: Passengers can change their password on the personal center page.
* Feedback: Passengers can leave feedback on the personal center page.

### From the Administrator’s Perspective:
* Login: Administrators can access the admin mode.
* Train schedule management: Administrators can add or cancel train schedules.
* Passenger information management: Administrators can view passenger information, manage passwords, and delete passenger accounts.
* Announcement publication: Administrators can publish announcements, which will be displayed on the query interface.
* Feedback management: Administrators can delete feedback.

### Functional Architecture Diagram


## Database Analysis
Ten tables:
* admin_: A_id, A_password. A_id is the primary key
* hsorder: H_name, P_id、H_seattype, nowtime, H_date. H_name is the primary key
* hsrailway: H_id, H_name, H_leavetime, H_arrivetime, H_destination, H_departure, H_date. H_id is the primary key
* hsrailway_price: H_id, H_name, H_seattype, H_number, H_price, H_date. H_id is the primary key
* message: M_message.
* passenger: P_name, P_phone, P_address, P_id, P_password, P_email. P_id is the primary key
* notice: content
* torder: T_name, P_id, T_seattype, nowtime, T_date, softtype, hardtype. T_name is the primary key
* train: T_id, T_name, T_leavetime, T_arrivetime, T_departure, T_destination, T_date. T_id is the primary key
* train_price: T_id, T_name, T_seattype, T_price, T_number, T_date. T_id is the primary key

## System Implementation
### Implementation of Entity Classes
- Implementation of the database class
- Implementation of the admin class
- Implementation of the hsorder class
- Implementation of the hsrailway class
- Implementation of the hsrailway_price class
- Implementation of the message class
- Implementation of the notice class
- Implementation of the passenger class
- Implementation of the torder class
- Implementation of the train class
- Implementation of the train_price class

### Implementation of the control class

### Implementation of form object classes

### Implementation of judgment classes

### Implementation of boundary classes
- Login interface
- Home and search interface
- Train schedule details interface
- High-speed train schedule details interface
- Passenger personal center interface
- Change password interface
- Order details interface for passengers under 60 years old
- Order details interface for passengers 60 years old and above
- Ticket cancellation interface
- Feedback interface
- Administrator interface
- Train schedule addition interface
- High-speed train schedule addition interface
- Train schedule cancellation interface
- High-speed train schedule cancellation interface
- Passenger information view interface
- Passenger password management interface
- Delete passenger information interface
- Announcement publishing interface
- Feedback management interface

## The System and its Version Used
* MySQL Server 8.0.19 X64
* MySQL Workbench 8.0.19 X64
* Connector/J 8.0.19 X86
* NetBeans IDE 8.1
