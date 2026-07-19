package com.bff.plataforma.model;

public class BffResponse {

    private PlatformResponse platformResponse;
    private RepositoryResponse repositoryResponse;

    public BffResponse() {
    }

    public PlatformResponse getPlatformResponse() {
        return platformResponse;
    }

    public void setPlatformResponse(PlatformResponse platformResponse) {
        this.platformResponse = platformResponse;
    }

    public RepositoryResponse getRepositoryResponse() {
        return repositoryResponse;
    }

    public void setRepositoryResponse(RepositoryResponse repositoryResponse) {
        this.repositoryResponse = repositoryResponse;
    }
}
