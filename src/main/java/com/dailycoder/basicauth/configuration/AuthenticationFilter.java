package com.dailycoder.basicauth.configuration;

import jakarta.servlet.*;
import lombok.SneakyThrows;
import org.springframework.security.core.Authentication;

import java.io.IOException;

public class AuthenticationFilter extends GenericFilter {

    @Override
    @SneakyThrows
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)  {

//        Authentication authentication = Auth
    }
}
