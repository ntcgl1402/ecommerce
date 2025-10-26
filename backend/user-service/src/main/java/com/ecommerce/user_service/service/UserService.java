package com.ecommerce.user_service.service;

import com.ecommerce.user_service.dto.*;

public interface UserService {
    UserResponse register(RegisterRequest request);
    AuthResponse login(AuthRequest request);
}
