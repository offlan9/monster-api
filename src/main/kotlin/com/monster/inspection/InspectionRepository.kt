package com.monster.inspection

import com.monster.*
import org.springframework.data.repository.CrudRepository

interface InspectionRepository: CrudRepository<Inspection, Long> {}
interface ProcessesRepository: CrudRepository<Processes, Long> {}