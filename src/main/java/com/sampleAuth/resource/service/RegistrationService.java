package com.sampleAuth.resource.service;

import com.sampleAuth.resource.models.User;

public interface RegistrationService {
    Boolean register(User user);
    Boolean update(User user);
    Boolean delete(String userName);
}
