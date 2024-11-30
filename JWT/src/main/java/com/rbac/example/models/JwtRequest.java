package com.rbac.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class JwtRequest {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	 // Manual implementation of the Builder pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String email;
        private String password;

        // Builder method for `email`
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // Builder method for `password`
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        // Build method to create a `JwtRequest` instance
        public JwtRequest build() {
            JwtRequest jwtRequest = new JwtRequest();
            jwtRequest.setEmail(this.email);
            jwtRequest.setPassword(this.password);
            return jwtRequest;
        }
    }
	
}
