package com.veronica.zoom.controller;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZoomRegistrantDto {
    private String email;
    private String firstName;
    private String lastName;
    private String meetingId;

}
