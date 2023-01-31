package br.com.emendes.secutiryjwt.auth;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthenticationRequest {

  private String email;
  private String password;

}
