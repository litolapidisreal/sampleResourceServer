package com.sampleAuth.resource.service;

import com.sampleAuth.resource.models.Clients;
import com.sampleAuth.resource.models.CustomClient;

public interface ClientConverterService {
    Clients convertFromCustom2Client(CustomClient client);
    Boolean convertFromClient2Custom(Clients client);
}
