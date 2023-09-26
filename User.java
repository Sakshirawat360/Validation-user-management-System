package com.example.usermanagement.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    private Integer userId;
    @NotBlank
    private String userName;


    @NotBlank
    private LocalDateTime userDob;
    @Email
    private String userEmail;
    @Size(min=10,max=10)
    @Pattern(regexp = "^[0-9]+$",message = "contact should be just numbers!!")
    private String userNumber;
    private Integer userDate;
    private Integer userTime;

}
