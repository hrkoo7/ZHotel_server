package com.hotelproject.ZHotel.service.interfac;

import com.hotelproject.ZHotel.dto.LoginRequest;
import com.hotelproject.ZHotel.dto.Response;
import com.hotelproject.ZHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
