package com.monster

import com.monster.inspection.*
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class MonsterConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository,
                            processes: ProcessesRepository,
                            inspection: InspectionRepository
                            ) = ApplicationRunner {

        var process = processes.save(Processes("process 1"))
        var processes =  mutableListOf(process)
        var inspect = inspection.save(Inspection("cutomer", "partnumber", processes))
        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(Article(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
        ))
        articleRepository.save(Article(
                title = "Reactor Aluminium has landed",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
        ))
    }
}
