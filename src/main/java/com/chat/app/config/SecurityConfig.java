package com.chat.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disable CSRF (SockJS/STOMP handshakes use XHR)
                .authorizeHttpRequests(auth -> auth
                        // allow the WebSocket handshake + STOMP destinations
                        .requestMatchers("/ws/**", "/topic/**", "/app/**").permitAll()
                        // allow your MVC view endpoint for the page
                        .requestMatchers("/chat", "/**/*.css", "/**/*.js").permitAll()
                        .anyRequest().permitAll()
                );

        return http.build();
    }
}
