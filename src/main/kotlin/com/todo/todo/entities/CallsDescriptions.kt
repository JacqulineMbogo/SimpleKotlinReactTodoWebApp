package com.todo.todo.entities

import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "calls_descriptions")
open class CallsDescriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
     var id: UUID? = null

    @Column(name = "api_id")
     var apiid: String? = null

    @Column(name = "created_by")
     var createdBy: String? = null

    @Column(name = "created_on")
     var createdOn: Timestamp? = null

    @Column(name = "response_time")
     var responseTime: Int? = null

    @Column(name = "session_id")
     var sessionId: Long? = null

    @Column(name = "status")
     var status: Int? = null

    @Column(name = "response")
    open var response: String? = null
}