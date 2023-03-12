package com.company.hospitalmanagementsystem.services.inter;

import com.company.hospitalmanagementsystem.models.Assistant;

import java.util.List;

public interface AssistantService {
    List<Assistant> getAllAssistant();

    Assistant getById(long id);

    Assistant save(Assistant assistant);

    void delete(long id);

    void update(long id);
}
