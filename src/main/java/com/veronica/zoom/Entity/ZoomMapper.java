package com.veronica.zoom.Entity;

import com.veronica.zoom.controller.ZoomResponse;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ZoomMapper {

    ZoomMapper INSTANCE = Mappers.getMapper(ZoomMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "topic", target = "topic")
    @Mapping(source = "startTime", target = "startTime")
    @Mapping(source = "joinUrl", target = "joinUrl")
    @Mapping(source = "startUrl", target = "startUrl")
    ZoomMeeting mapToEntity(ZoomResponse response);
}