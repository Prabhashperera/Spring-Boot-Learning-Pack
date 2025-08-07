package org.app.auth_backend.service;

import lombok.RequiredArgsConstructor;
import org.app.auth_backend.dto.AuthDto;
import org.app.auth_backend.dto.AuthResponse;
import org.app.auth_backend.dto.RegisterDto;
import org.app.auth_backend.entity.Role;
import org.app.auth_backend.entity.User;
import org.app.auth_backend.repo.UserRepo;
import org.app.auth_backend.util.JwtUtil;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthResponse authenticate(AuthDto authDto) {
        User user = userRepo.findByUsername(authDto.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException(authDto.getUsername()));
        if (!passwordEncoder.matches(authDto.getPassword(), user.getPassword())) {
            throw new BadCredentialsException("Wrong password");
        }

        String token = jwtUtil.generateJwtToken(authDto.getUsername());
        return new AuthResponse(token);
    }

    public String register(RegisterDto registerDto) {
        if (userRepo.findByUsername(registerDto.getUsername()).isPresent()) {
            throw new RuntimeException("User " + registerDto.getUsername() + " already exists");
        }
        User user = User.builder()
                .username(registerDto.getUsername())
                .password(passwordEncoder.encode(registerDto.getPassword()))
                .role(Role.valueOf(String.valueOf(registerDto.getRole())))
                .build();
        userRepo.save(user);
        return "User " + registerDto.getUsername() + " registered successfully";
    }
}
