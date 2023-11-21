package com.example.disovercluster.controller;

import com.example.disovercluster.connector.AwsConnector;
import com.example.disovercluster.entity.App;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AppController {

    private final AwsConnector awsConnector;

    @QueryMapping
    Iterable<App> discoverCluster() throws IOException, KubectlException {
        return awsConnector.describeCluster("customConfig");
    }

    @QueryMapping
    Optional<App> appByName(@Argument String name) throws IOException, KubectlException {
        awsConnector.connectToCluster();
        return awsConnector.describeCluster("customConfig", name);
    }

    @MutationMapping
    String connect(@Argument String accessKey, @Argument String secretKey,
                   @Argument String clusterName, @Argument String region) throws IOException {
        return awsConnector.connectToCluster(accessKey, secretKey, clusterName, region);
    }
}
