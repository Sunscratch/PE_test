package com.test.webbank.model;

import com.test.webbank.entity.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientModel {
    public boolean clientIsCorrect(Client client) {
        return (client.getFirstName() != null && client.getLastName() != null &&
                client.getFirstName().length() > 0 && client.getLastName().length() > 0
                && client.getDob() != null && client.getIdCard() > 0);
    }
}
