package com.project.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credentials {
    @Email(message = "Niepoprawny format adresu e-mail.")
    private String email;

    @NotNull(message = "Nie podano hasła.")
    @Size(min=8, max=32,
        message = "Hasło musi składać się z przynajmniej 8 znaków i nie przekraczać 32.")
    private String password;
}
