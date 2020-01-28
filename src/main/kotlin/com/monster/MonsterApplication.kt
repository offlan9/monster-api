package com.monster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(MonsterProperties::class)
class MonsterApplication

fun main(args: Array<String>) {
	runApplication<MonsterApplication>(*args)
}
