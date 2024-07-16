package office.coordination.repository;

import office.coordination.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByDate(Timestamp date);
    List<Schedule> findByUserId(Long userID);
}
