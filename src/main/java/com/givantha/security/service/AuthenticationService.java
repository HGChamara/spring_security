package com.givantha.security.service;

import com.givantha.security.entity.AuthenticationRequest;
import com.givantha.security.entity.AuthenticationResponse;
import com.givantha.security.entity.RegisterRequest;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
