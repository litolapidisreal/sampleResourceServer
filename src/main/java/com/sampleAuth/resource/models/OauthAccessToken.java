package com.sampleAuth.resource.models;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@NoArgsConstructor
@Entity
public class OauthAccessToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tokenId;
    private String token;
    private String authenticationId;
    private String user_name;
    private String clientId;
    private String authentication;
    private String refreshToken;
}
