package com.devluanm.noto.model;

import java.time.LocalDateTime;

public record Task(Integer id, String description, TaskStatusEnum status, LocalDateTime createdAt, LocalDateTime updatedAt)
{

}
