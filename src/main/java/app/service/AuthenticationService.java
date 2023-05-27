package app.service;

import app.contract.LoginRequest;
import app.contract.LoginResponse;
import app.contract.RegisterRequest;

public interface AuthenticationService {
    LoginResponse login(LoginRequest request);

    LoginResponse register(RegisterRequest request);
}
