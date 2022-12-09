package com.Peter.week9_fashion_blog_RestApi.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @NotBlank(message = "Name should not be empty")
    private String name;
    @Email(message = "invalid email")
    private String email;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Invalid password entered")
    private String password;
}
