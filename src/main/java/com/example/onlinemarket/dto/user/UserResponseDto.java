package com.example.onlinemarket.dto.user;


import com.example.onlinemarket.dto.base.BaseDto;
import com.example.onlinemarket.entity.eums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponseDto extends BaseDto {
    private String fullName;
    private String userName;
    private String phoneNumber;
    private UserRole userRoles;



    public UserResponseDto(UUID id, LocalDateTime created, LocalDateTime updated, String fullName, String userName, String phoneNumber, UserRole userRoles) {
        super(id, created, updated);
        this.fullName = fullName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.userRoles = userRoles;

    }
}
