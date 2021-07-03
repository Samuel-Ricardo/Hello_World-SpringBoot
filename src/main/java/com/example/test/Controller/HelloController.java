/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samuel
 */

@RestController
public class HelloController {
    
    @GetMapping
    public String helloMessage () {
        
        return "Hello World";
    }
}
