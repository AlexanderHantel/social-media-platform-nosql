package org.hantel.social_media_platform.document;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;

@Getter
public class UuidIdentifiedDocument {
    
    @Id
    protected UUID id;

    public void setId(UUID id) {

        if (this.id != null) {
            throw new UnsupportedOperationException("ID is already defined");
        }

        this.id = id;
    }
}
