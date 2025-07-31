package org.app.auth_backend.dto;

import lombok.Data;
import org.app.auth_backend.entity.Role;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private Role role;
}
