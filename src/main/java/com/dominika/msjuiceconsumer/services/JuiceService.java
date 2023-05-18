package com.dominika.msjuiceconsumer.services;

import java.util.UUID;

import com.dominika.msjuiceconsumer.web.model.JuiceDto;

public interface JuiceService {
    JuiceDto getJuiceById(UUID juiceId);
    JuiceDto createNewJuice(JuiceDto juiceDto);
    void updateJuiceById(UUID juiceId, JuiceDto juiceDto);

    void deleteByid(UUID juiceid);
}
