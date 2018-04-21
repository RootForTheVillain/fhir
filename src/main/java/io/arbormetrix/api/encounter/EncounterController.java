package io.arbormetrix.api.encounter;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class EncounterController {

    @RequestMapping("/encounters")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}