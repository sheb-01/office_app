package office.coordination.repository;

import office.coordination.model.OfficeDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface OfficeDayRepository extends JpaRepository<OfficeDay, Long> {
    List<OfficeDay> findByDate(LocalDate date);
}