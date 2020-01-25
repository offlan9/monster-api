package com.monster

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class Health(val status: String)

@RestController
@RequestMapping("/health")
class HealthController(){
    @GetMapping("")
    fun getHealth() =  Health("ok")
}