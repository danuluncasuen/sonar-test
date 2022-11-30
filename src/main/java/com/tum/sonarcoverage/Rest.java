package com.tum.sonarcoverage;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/math")
public class Rest {

    private final MathService mathService;

    public Rest(MathService mathService) {
        this.mathService = mathService;
    }

    @PostMapping("/{operation}/{a}/{b}")
    public ResponseEntity<Integer> operation(@PathVariable String operation, @PathVariable Integer a, @PathVariable Integer b) {
        if (Objects.equals(operation, "sum")) {
            return new ResponseEntity<>(mathService.sum(a, b), OK);
        } else if (Objects.equals(operation, "diff")) {
            return new ResponseEntity<>(mathService.diff(a, b), OK);
        }
        return new ResponseEntity<>(69, BAD_REQUEST);
    }

}
