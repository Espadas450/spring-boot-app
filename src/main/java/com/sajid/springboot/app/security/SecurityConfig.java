package com.sajid.springboot.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                //.authorizeHttpRequests((authorizationManagerRequestMatcherRegistry ->
                  //      authorizationManagerRequestMatcherRegistry
                  //      .anyRequest().authenticated()
                  //      ))
                //.httpBasic(Customizer.withDefaults());
                .authorizeRequests()
                .requestMatchers("/usuarios").authenticated() // Asegúrate de que esta línea esté presente
                .anyRequest().permitAll()
                .and()
                .httpBasic(Customizer.withDefaults()); // Permitir autenticación básica

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}