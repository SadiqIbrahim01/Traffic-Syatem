package data.models;

import java.time.LocalDateTime;

public class Ticket {
    private static int counter = 1;
    private int id;
    private Vehicle vehicle;
    private Offence offence;
    private boolean hasPaid;
    private Officer officer;
    private LocalDateTime dateOfIssuance;
    private LocalDateTime dateOfPayment;

    private Ticket() {
        this.id = counter++;
        this.vehicle = vehicle;
        this.offence = offence;
        this.hasPaid = false;
        this.officer = officer;
        this.dateOfIssuance = LocalDateTime.now();
        this.dateOfPayment = LocalDateTime.now();
    }

    private
}
