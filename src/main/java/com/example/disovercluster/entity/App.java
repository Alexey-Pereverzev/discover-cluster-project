package com.example.disovercluster.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class App {
    private String name;
    private List<String> deployments;
    private List<String> pods;
    private List<String> configMaps;
    private List<String> secrets;
    private List<String> ingresses;

    public App() {
        this.name = "";
        this.deployments = new ArrayList<>();
        this.pods = new ArrayList<>();
        this.configMaps = new ArrayList<>();
        this.secrets = new ArrayList<>();
        this.ingresses = new ArrayList<>();
    }
}
