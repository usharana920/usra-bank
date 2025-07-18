package org.usra.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/admin")
public class AdminController {

    public String index(){
        log.info("name");
        return "String";
    }

}
