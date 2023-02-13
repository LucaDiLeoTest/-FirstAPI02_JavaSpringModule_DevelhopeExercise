package co.develhope.FirstAPI02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    public Integer factorial = 1;


    @GetMapping("/{n}")
    public Integer getFactorial(@PathVariable Integer n){
        for(Integer i=1; i <= n; i++){
           factorial = factorial*i;
        }
        return factorial;
    }
}
