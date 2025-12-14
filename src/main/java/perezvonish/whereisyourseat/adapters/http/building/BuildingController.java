package perezvonish.whereisyourseat.adapters.http.building;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {
    @GetMapping("/buildings")
    public String getList() {
        return "get buildings";
    }

    @GetMapping("/buildings/{id}")
    public String getById(@PathVariable String id) {
        return "get building by id: " + id;
    }
}
