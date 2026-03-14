package com.url.shortener.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "click_events")
public class ClickEvent {@Id
private String id;
    private LocalDateTime clickDate = LocalDateTime.now();
    private String  urlMappingId;

}
