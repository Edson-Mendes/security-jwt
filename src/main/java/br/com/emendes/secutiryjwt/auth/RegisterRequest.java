package br.com.emendes.secutiryjwt.auth;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterRequest {

  private String firstname;
  private String lastname;
  private String email;
  private String password;

}
