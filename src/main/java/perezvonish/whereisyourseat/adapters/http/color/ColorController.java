package perezvonish.whereisyourseat.adapters.http.color;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
    @GetMapping("/colors")
    public String getList() {
        return "get colors";
    }
}
