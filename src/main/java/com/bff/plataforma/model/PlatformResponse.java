package com.bff.plataforma.model;

public class PlatformResponse {

    private String name;
    private int replicas;

    public PlatformResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(int replicas) {
        this.replicas = replicas;
    }
}
