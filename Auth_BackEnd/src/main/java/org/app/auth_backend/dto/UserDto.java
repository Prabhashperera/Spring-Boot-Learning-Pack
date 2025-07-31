package org.app.auth_backend.dto;

import jakarta.persistence.*;
import lombok.*;
import org.app.auth_backend.entity.Role;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {
    private int id;
    private String username;
    private String password;
    private Role role;
}
