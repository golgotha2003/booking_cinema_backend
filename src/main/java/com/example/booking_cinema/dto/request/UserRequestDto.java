package com.example.booking_cinema.dto.request;

import java.io.Serializable;

import com.example.booking_cinema.dto.validator.user.phone_number.PhoneNumber;
import com.example.booking_cinema.dto.validator.user.role.RoleSubset;
import com.example.booking_cinema.util.Role;
import static com.example.booking_cinema.util.Role.ADMIN;
import static com.example.booking_cinema.util.Role.OWNER;
import static com.example.booking_cinema.util.Role.USER;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto implements Serializable {

    @NotBlank(message = "full name must be not blank")
    private String full_name;

    @Email(message = "email invalid format")
    @NotBlank(message = "email must be not blank")
    private String email;

    @NotBlank(message = "password must be not blank")
    private String password;

    @NotBlank(message = "phone must be not blank")
    @PhoneNumber(message = "phone number invalid format")
    private String phone;

    @NotNull(message = "role must be not null")
    @RoleSubset(anyOf = { ADMIN, USER, OWNER })
    private Role type;
}