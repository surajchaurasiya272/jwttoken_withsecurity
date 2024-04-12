package com.example.jwtthree.security;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException, ServletException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'commence'");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
         PrintWriter writer = response.getWriter();
        writer.println("Access Denied !! " + authException.getMessage());
    }
    
}
