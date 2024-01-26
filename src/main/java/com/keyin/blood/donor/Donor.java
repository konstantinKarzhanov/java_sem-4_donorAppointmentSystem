package com.keyin.blood.donor;

import com.keyin.blood.appointment.Appointment;

import java.util.Calendar;
import java.util.Date;

public class Donor {
    private Date lastDonationDate;
    public void setLastDonationDate(Date lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }

    public Date getLastDonationDate() {
        return this.lastDonationDate;
    }

    public boolean canDonate(Appointment appointment) {
        return true;
//        if (appointment.getDate() == null) return false;
//        if (this.lastDonationDate == null) return true;
//
//        Calendar appointmentDateCalendar = Calendar.getInstance();
//        appointmentDateCalendar.setTime(appointment.getDate());
//
//        Calendar allowedDonationDateCalendar = Calendar.getInstance();
//        allowedDonationDateCalendar.setTime(lastDonationDate);
//        allowedDonationDateCalendar.add(Calendar.DAY_OF_YEAR, 56);
//
//        return appointmentDateCalendar.after(allowedDonationDateCalendar);
    }
}
