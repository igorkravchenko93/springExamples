package com.kravchenko.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
@Builder
public class Dairy {

    @MongoId
    private String id;

    private String dairyName;
    private String dairyOwnerName;
}
