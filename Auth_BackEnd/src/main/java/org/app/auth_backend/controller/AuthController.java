package org.app.auth_backend.controller;

import lombok.RequiredArgsConstructor;
import org.app.auth_backend.dto.AuthDto;
import org.app.auth_backend.dto.RegisterDto;
import org.app.auth_backend.service.AuthService;
import org.app.auth_backend.util.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    private final AuthService authService;

    @PostMapping("register")
    public ResponseEntity<ApiResponse> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(
                new ApiResponse(200 , "OK" , authService.register(registerDto))
        );
    }

    @PostMapping("login")
    public ResponseEntity<ApiResponse> login(@RequestBody AuthDto authDto) {
        return ResponseEntity.ok(
                new ApiResponse(200 , "OK" , authService.authenticate(authDto))
        );
    }
}
