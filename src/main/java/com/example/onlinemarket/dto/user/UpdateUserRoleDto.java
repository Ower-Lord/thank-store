package com.example.onlinemarket.dto.user;


import com.example.onlinemarket.entity.eums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateUserRoleDto {
    private UUID userId;
    private UserRole role;
}
