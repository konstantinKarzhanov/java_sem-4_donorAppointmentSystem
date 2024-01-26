package com.keyin.blood.donor;

import java.util.Calendar;

import com.keyin.blood.appointment.Appointment;
import com.keyin.blood.donor.Donor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DonorTest {
    @Test
    public void testCanDonate() {
        Donor donor = new Donor();
        Appointment appointment = new Appointment();

        Calendar appointmentDateCalendar = Calendar.getInstance();
        appointmentDateCalendar.set(2024, Calendar.FEBRUARY, 1);
        appointment.setDate(appointmentDateCalendar.getTime());

        Calendar donorLastDonationDateCalendar = Calendar.getInstance();
        donorLastDonationDateCalendar.set(2024, Calendar.JANUARY, 1);
        donor.setLastDonationDate(donorLastDonationDateCalendar.getTime());

        if (appointment.getDate() == null) {
            Assertions.assertFalse(donor.canDonate(appointment));
        } else if (donor.getLastDonationDate() == null) {
            Assertions.assertTrue(donor.canDonate(appointment));
        } else {
            Calendar allowedDonationDateCalendar = Calendar.getInstance();
            allowedDonationDateCalendar.setTime(donorLastDonationDateCalendar.getTime());
            allowedDonationDateCalendar.add(Calendar.DAY_OF_YEAR, 56);

            if (appointmentDateCalendar.after(allowedDonationDateCalendar)) {
                Assertions.assertTrue(donor.canDonate(appointment));
            } else {
                Assertions.assertFalse(donor.canDonate(appointment));
            }
        }
    }
}