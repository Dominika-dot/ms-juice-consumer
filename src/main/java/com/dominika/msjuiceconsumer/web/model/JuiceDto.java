package com.dominika.msjuiceconsumer.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data //getters, setters, equals, hashcode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JuiceDto {

    @Null
    private UUID id;
    @NotBlank
    private String juiceName;
    private JuiceStyleEnum juiceStyle;
    @Positive
    private Long upc;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;

}
