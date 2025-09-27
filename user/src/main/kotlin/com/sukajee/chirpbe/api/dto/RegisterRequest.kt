package com.sukajee.chirpbe.api.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length

data class RegisterRequest(
	@field:Length(min = 3, max = 20, message = "Username length must be between 3 and 20 characters.")
	val username: String,
	
	@field:Email(message = "Must be a valid email address.")
	val email: String,
	
	@field:Pattern(
		regexp = "^(?=.*[\\d!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?])(.{8,})$",
		message = "Password must be at least 8 characters and contain at least one digit OR special character"
	)
	val password: String
)
