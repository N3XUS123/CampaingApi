package com.salesianostriana.campaing.formbean;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

// USUARIO JWT UTILIZADO PARA EL LOGUEO
@Data
public class JwtUser implements UserDetails {

	private static final long serialVersionUID = -809042186807777856L;

	private final Long id;
	private final String name;
	private final String username;
	private final String password;
//	private final String group;
	private final boolean enabled;
	private final Collection<? extends GrantedAuthority> authorities;

	public JwtUser(Long id, String name, String username, String password, boolean enabled,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
//		this.group = group;
		this.enabled = enabled;
		this.authorities = authorities;
	}

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

}
