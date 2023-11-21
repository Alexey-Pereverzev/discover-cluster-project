package com.example.disovercluster.connector;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

public class CustomAWSCredentialsProvider implements AWSCredentialsProvider {

    private final CustomAWSCredentials credentials;

    public CustomAWSCredentialsProvider(CustomAWSCredentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public AWSCredentials getCredentials() {
        return credentials;
    }

    @Override
    public void refresh() {

    }
}
