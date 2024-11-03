package com.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="REGISTRATION_DTLS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String registrationId;

    @Column(name="FIRST_NAME")
    private String fname;

    @Column(name="LAST_NAME")
    private String lname;

    @Column(name="DATE_OF_BIRTH")
    private LocalDate dob;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    private String user2;

//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
//    private List<AtmPage> atmPage;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername()
    {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
