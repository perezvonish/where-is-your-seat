package perezvonish.whereisyourseat.adapters.http.building;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {
    @GetMapping("/")
    public String getBuilding() {
        return "Got building";
    }
}
