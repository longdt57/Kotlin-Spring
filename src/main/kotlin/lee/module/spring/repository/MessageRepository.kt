// MessageRepository.kt
package lee.module.spring.repository

import lee.module.spring.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>