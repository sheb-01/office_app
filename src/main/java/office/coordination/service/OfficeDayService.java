package office.coordination.service;

import office.coordination.model.OfficeDay;
import office.coordination.repository.OfficeDayRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class OfficeDayService {
    @Autowired
    private OfficeDayRepository officeDayRepository;

    public OfficeDay save(OfficeDay officeDay) {
        return officeDayRepository.save(officeDay);
    }

    public List<OfficeDay> findByDate(LocalDate date) {
        return officeDayRepository.findByDate(date);
    }
}
