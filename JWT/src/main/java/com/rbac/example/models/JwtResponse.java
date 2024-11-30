package com.rbac.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class JwtResponse {
	private String jwtToken;
	private String username;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
	
	  public static Builder builder() {
	        return new Builder();
	    }

	    public static class Builder {
	        private String jwtToken;
	        private String username;

	        public Builder jwtToken(String jwtToken) {
	            this.jwtToken = jwtToken;
	            return this;
	        }

	        public Builder username(String username) {
	            this.username = username;
	            return this;
	        }

	        public JwtResponse build() {
	            JwtResponse jwtResponse = new JwtResponse();
	            jwtResponse.setJwtToken(jwtToken);
	            jwtResponse.setUsername(username);
	            return jwtResponse;
	        }
	    }
}
