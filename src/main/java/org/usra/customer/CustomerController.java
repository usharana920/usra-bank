package org.usra.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/welcome")
    public String index(){
        log.info("inside index controller");
        return "Welcome to USRA bank";
    }
}
