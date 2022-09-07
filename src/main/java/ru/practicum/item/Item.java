package ru.practicum.item;

import lombok.Data;

import java.util.UUID;

@Data
class Item {

    private long id;
    private Long userId;
    private String url;
}
