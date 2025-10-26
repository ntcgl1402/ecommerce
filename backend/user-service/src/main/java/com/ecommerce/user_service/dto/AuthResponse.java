package com.ecommerce.user_service.dto;
import com.ecommerce.user_service.model.UserRole;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;
}