package com.dominika.msjuiceconsumer.web.services;

import java.util.UUID;

import com.dominika.msjuiceconsumer.web.model.JuiceDto;
import org.springframework.stereotype.Service;

@Service
public class JuiceServiceImpl implements JuiceService{
    @Override
    public JuiceDto getJuiceById(final UUID juiceId) {
        return JuiceDto.builder()
            .id(UUID.randomUUID())
            .juiceName("Orange juice")
            .juiceStyle("raw")
            .upc(1L)
            .build();
    }

    @Override
    public JuiceDto createNewJuice(JuiceDto juiceDto) {
        return JuiceDto.builder()
            .id(juiceDto.getId())
            .juiceName(juiceDto.getJuiceName())
            .juiceStyle(juiceDto.getJuiceStyle())
            .upc(juiceDto.getUpc())
            .build();
    }

    @Override
    public void updateJuiceById(final UUID juiceId, final JuiceDto juiceDto) {
        //TODO - jak będzie DB
    }

    @Override
    public void deleteByid(final UUID juiceid) {
        //TODO - jak będzie db
    }
}
