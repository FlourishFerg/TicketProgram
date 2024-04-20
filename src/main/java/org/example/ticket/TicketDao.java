package org.example.ticket;
import java.sql.*;
public class TicketDao {

        public void getDta() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/" + "ticket2", "root", "opuruiche");
            Statement obj = connect.createStatement();

        }
        public void saveTicket (Ticket ticket) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect =DriverManager.getConnection("jdbc:mySql://localhost:3306/" + "ticket2", "root", "opuruiche");

            PreparedStatement statement = connect.prepareStatement("insert into tickets(TicketNo,name,destination)"+ "values(?,?,?)");
            statement.setInt(1,ticket.getTicketNo());
            statement.setString(2,ticket.getName());
            statement.setString(3,ticket.getDestination());

            statement.execute();

            PreparedStatement statement1 = connect.prepareStatement("Select * from tickets");

        }

        public static void main(String[] args) {

        }

    }



