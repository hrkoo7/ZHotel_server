package com.hotelproject.ZHotel.service.interfac;

import com.hotelproject.ZHotel.dto.Response;
import com.hotelproject.ZHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
