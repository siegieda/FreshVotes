package com.freshvotes.services;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDetailsServiceTest {

  
  @Test
  public void generate_encrypted_password() {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String rawPassword = "user";
    String encodedPassword = encoder.encode(rawPassword);
    
    System.out.println(encodedPassword);
    
    assertThat(rawPassword, not(encodedPassword));
  }
}