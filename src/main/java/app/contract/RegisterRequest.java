package app.contract;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstname;
    private String lastname;
    @Size(min = 4, max = 20)
    private String username;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    @Size(min = 4, max = 20)
    private String password;
}
