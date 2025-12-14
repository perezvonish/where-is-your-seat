package perezvonish.whereisyourseat.adapters.http.floor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FloorController {
    @GetMapping("/buildings/{id}/floors")
    public String getFoorsByBuildingId(@PathVariable String id) {
        return "get floors in buildings by id: " + id;
    }

    @GetMapping("/floors/{id}")
    public String getById(@PathVariable String id) {
        return "get floor by id: " + id;
    }
}
