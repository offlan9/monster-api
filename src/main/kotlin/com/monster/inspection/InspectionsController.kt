package com.monster.inspection

import com.monster.Inspection
import org.springframework.web.bind.annotation.*

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