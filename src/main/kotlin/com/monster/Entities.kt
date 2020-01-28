package com.monster

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Article(
        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: User,
        var slug: String = title.toSlug(),
        var addedAt: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue var id: Long? = null)

@Entity
class User(
		var login: String,
		var firstname: String,
		var lastname: String,
		var description: String? = null,
		@Id @GeneratedValue var id: Long? = null)


data class CheckPointSpec (
		val pointName : String,
		val min : Double,
		val ct : Double,
		val max : Double,
		val repeat : Int,
		val measuringTools : String
)

data class Punch (
		val description : String,
		val materials : List<String>,
		val appearanceInspection : List<String>,
		val toolingNumber : String,
		val file : String,
		val checkPointSpec : List<CheckPointSpec>,
		val machineNumber : String,
		val remark : String
)


data class Processes (
		val title : String,
		val punch : Punch
)

@Entity
data class Inspection (
		val customerName : String,
		val partNumber : String,
//        val processes : List<Processes>,
        @Id @GeneratedValue var id: Long? = null
)