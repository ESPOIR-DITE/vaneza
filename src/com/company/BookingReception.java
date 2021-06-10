package com.company;

import java.time.LocalDate;

/**
 * Aggregate entity.
 */
public class BookingReception {
    private String receptionistId;
    private String bookingId;
    private LocalDate date;

    public BookingReception(String receptionistId, String bookingId, LocalDate date) {
        this.receptionistId = receptionistId;
        this.bookingId = bookingId;
        this.date = date;
    }

    public String getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BookingReception{" +
                "receptionistId='" + receptionistId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", date=" + date +
                '}';
    }
}
