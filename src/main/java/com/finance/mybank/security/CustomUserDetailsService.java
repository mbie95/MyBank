package com.finance.mybank.security;

import com.finance.mybank.auth_user.entity.User;
import com.finance.mybank.auth_user.repo.UserRepo;
import com.finance.mybank.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("Email Not Found"));

        return AuthUser.builder()
                .user(user)
                .build();
    }

}
