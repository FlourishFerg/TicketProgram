package com.example.ticket;

public class Ticket {

        private int ticketNo;
        private String name;
        private String destination;

        public Ticket(int ticketNo, String name, String destination) {
            this.ticketNo = ticketNo;
            this.name = name;
            this.destination = destination;
        }

        public int getTicketNo() {
            return ticketNo;
        }

        public String getDestination() {
            return destination;
        }

        public String getName() {
            return name

        }
    }


