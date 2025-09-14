package io.github.zerumi.ib1140925java.controller;

import io.github.zerumi.ib1140925java.controller.domain.AuthRequestDto;
import io.github.zerumi.ib1140925java.controller.domain.AuthResponseDto;
import io.github.zerumi.ib1140925java.service.AuthService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public AuthResponseDto login(@RequestBody AuthRequestDto req) {
        return new AuthResponseDto(authService.getJwt(req));
    }
}
