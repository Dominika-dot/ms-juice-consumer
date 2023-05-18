package com.dominika.msjuiceconsumer.web.mappers;

import com.dominika.msjuiceconsumer.domain.Juice;
import com.dominika.msjuiceconsumer.web.model.JuiceDto;

import org.mapstruct.Mapper;
@Mapper//(uses = DateMapper.class)
public interface JuiceMapper {
    JuiceDto juiceToJuiceDto(Juice juice);
    Juice juiceDtoToJuice (JuiceDto juiceDto);
}
