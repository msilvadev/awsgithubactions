package br.com.msilva.awsgithubactions.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AwsDeployController {

    @GetMapping
    public ResponseEntity<String> awsDeploy() {
        return ResponseEntity.ok("It's working!");
    }
}
