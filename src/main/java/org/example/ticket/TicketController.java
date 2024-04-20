package org.example.ticket;

import java.sql.SQLException;

public class TicketController {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Ticket ticket1 = new Ticket(2000,"Mr Apple","Ajah");
        Ticket ticket2 = new Ticket(2000,  "Mr Orange", "Ajah");
        Ticket ticket3 = new Ticket(2000, "Mr Grape","Ajah");

        TicketDao doa = new TicketDao();
        doa.saveTicket(ticket1);
        doa.saveTicket(ticket2);
        doa.saveTicket(ticket3);

    }
}
