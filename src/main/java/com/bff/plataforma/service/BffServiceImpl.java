package com.bff.plataforma.service;


import com.bff.plataforma.client.PlatformClient;
import com.bff.plataforma.client.RepositoryClient;
import com.bff.plataforma.model.AttendeeRegisteredEvent;
import com.bff.plataforma.model.BffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BffServiceImpl implements BffService {

    @Autowired
    private PlatformClient platformClient;
    @Autowired
    private RepositoryClient repositoryClient;
    @Autowired
    private AttendeeEventPublisher publisher;

    @Override
    public List<BffResponse> getAll() {
//        var platforms = platformClient.getAll();
//        var repositories = repositoryClient.getAll();

        var response = new ArrayList<BffResponse>();

//        for (int i = 0; i < platforms.size(); i++) {
//            var dto = new BffResponse();
//            dto.setPlatformResponse(platforms.get(i));
//            dto.setRepositoryResponse(repositories.get(i));
//
//            response.add(dto);
//        }

        AttendeeRegisteredEvent event = AttendeeRegisteredEvent.create(UUID.randomUUID().toString(), "test@mail.com");

        publisher.publish(event);

        return response;
    }
}
