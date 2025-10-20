package com.mictech.mapper;

import com.mictech.api.model.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItemMapper {

    public Item toApi(com.mictech.model.Item entity) {
        Item apiModel = new Item();
        apiModel.setId(entity.getId());
        apiModel.setName(entity.getName());
        apiModel.setQuantity(entity.getQuantity());
        return apiModel;
    }

    public com.mictech.model.Item toEntity(Item apiModel) {
        com.mictech.model.Item entity = new com.mictech.model.Item();
        // Note: ID is not set from the API model
        entity.setName(apiModel.getName());
        entity.setQuantity(apiModel.getQuantity());
        return entity;
    }

    public List<Item> toApiList(List<com.mictech.model.Item> entityList) {
        return entityList.stream().map(this::toApi).collect(Collectors.toList());
    }
}
