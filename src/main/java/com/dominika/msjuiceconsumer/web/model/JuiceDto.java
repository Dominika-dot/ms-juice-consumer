package com.dominika.msjuiceconsumer.web.model;

import java.util.UUID;

import lombok.*;

@Data //getters, setters, equals, hashcode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JuiceDto {

    private UUID id;
    private String juiceName;
    private String juiceStyle;
    private Long upc;

}
