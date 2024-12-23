package com.rbac.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.rbac.example.Security.JwtAuthentication;
import com.rbac.example.Security.JwtAuthenticatorFilter;

@Configuration
public class SecurityConfig {
	
	@Autowired
	private JwtAuthentication point;
	
	@Autowired
	private JwtAuthenticatorFilter filter;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		http.csrf(csrf -> csrf.disable())
				.cors(cors-> cors.disable())
				.authorizeHttpRequests
				(
					auth-> auth.requestMatchers("/home/**")
					.authenticated()
					.requestMatchers("/auth/login").permitAll().anyRequest().authenticated()
				)
				.exceptionHandling(ex-> ex.authenticationEntryPoint(point))
				.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
			http.addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
}
