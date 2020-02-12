package com.monster.inspection

import com.monster.Inspection
import org.springframework.web.bind.annotation.*
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor

import org.springframework.data.repository.CrudRepository



//data class Person @PersistenceConstructor constructor(@Id val id: String?, val firstname: String? = "Walter", val lastname: String = "") {
//    constructor(firstname: String?, lastname: String) : this(null, firstname, lastname);
//}
//
//interface PersonRepository : CrudRepository<Person, String> {
//}


@RestController
@RequestMapping("/api/inspections")
class InspectionsController(private val repository: InspectionRepository) {

    @GetMapping("")
    fun getAll() = repository.findAll()

    @PostMapping("")
    fun create(@RequestBody inspection: Inspection): Inspection {
        val save = repository.save(inspection)
        return save
    }
}



