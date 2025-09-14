package io.github.zerumi.ib1140925java.service;

import io.github.zerumi.ib1140925java.controller.domain.AuthRequestDto;
import io.github.zerumi.ib1140925java.security.JwtUtils;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final AuthenticationManager authManager;
    private final JwtUtils jwtUtils;

    public String getJwt(AuthRequestDto req) {
        var token = new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword());
        authManager.authenticate(token);
        return jwtUtils.generateToken(req.getUsername());
    }
}
