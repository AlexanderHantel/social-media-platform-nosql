package org.hantel.social_media_platform.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "comments")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Comment extends UuidIdentifiedDocument {
    @DBRef
    private User user;
    private String content;
    private LocalDateTime createdAt;
    @DBRef
    private Post post;
    @Builder.Default
    @DBRef(lazy = true)
    private List<Like> likes = new ArrayList<>();
}
