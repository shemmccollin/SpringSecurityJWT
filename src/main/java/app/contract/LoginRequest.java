package app.contract;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @Size(min = 4, max = 20)
    private String username;
    @Size(min = 4, max = 20)
    private String password;
}
