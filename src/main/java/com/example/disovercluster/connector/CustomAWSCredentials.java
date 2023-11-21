package com.example.disovercluster.connector;

import com.amazonaws.auth.AWSCredentials;

public class CustomAWSCredentials implements AWSCredentials {
    private final String accessKey;
    private final String secretKey;

    public CustomAWSCredentials(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    @Override
    public String getAWSAccessKeyId() {
        return accessKey;
    }

    @Override
    public String getAWSSecretKey() {
        return secretKey;
    }
}
