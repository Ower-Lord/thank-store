package com.example.onlinemarket.entity;

import com.example.onlinemarket.entity.eums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity implements UserDetails {

    private String fullName;
    @Column(unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserRole roles;
    @Column(unique = true)
    private String email;
    @Column(columnDefinition = "boolean default false")
    private boolean isVerify;
    @Column(nullable = false)
    private String code;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<SimpleGrantedAuthority> simpleGrantedAuthorities = new HashSet<>();
        simpleGrantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + this.roles));
        return simpleGrantedAuthorities;
    }


    @Override
    public String getPassword() {
        return password;
    }


    @Override
    public String getUsername() {
        return userName;
    }


    @Override
    public boolean isAccountNonExpired() {
        return isActive();
    }

    @Override
    public boolean isAccountNonLocked() {
        return isActive();
    }


    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity user)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userName);
    }
}
