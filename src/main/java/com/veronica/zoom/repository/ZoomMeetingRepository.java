package com.veronica.zoom.repository;

import com.veronica.zoom.Entity.ZoomMeeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ZoomMeetingRepository extends JpaRepository<ZoomMeeting, String> {
}
