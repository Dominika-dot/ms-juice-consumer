package com.dominika.msjuiceconsumer.domain;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Juice {
    private UUID id;
    private String juiceName;
    private String juiceStyle;
    private Long upc;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
