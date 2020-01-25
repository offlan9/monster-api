package com.monster

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("monster")
data class MonsterProperties(var title: String, val customer: Customer) {
	data class Customer(val title: String? = null, val content: String)
}
