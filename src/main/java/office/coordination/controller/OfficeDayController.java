package office.coordination.controller;


import office.coordination.model.OfficeDay;
import office.coordination.service.OfficeDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/office-days")

public class OfficeDayController {
    @Autowired
    private OfficeDayService officeDayService;
    @PostMapping
    public OfficeDay create(@RequestBody OfficeDay officeDay) {
        return officeDayService.save(officeDay);
    }
    @GetMapping("/{date}")
    public List<OfficeDay> getByDate(@PathVariable LocalDate date) {
        return officeDayService.findByDate(date);
    }
}
