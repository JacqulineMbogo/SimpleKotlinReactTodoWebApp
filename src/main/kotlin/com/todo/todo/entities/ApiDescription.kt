package com.todo.todo.entities

import org.hibernate.annotations.CreationTimestamp
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.util.*
import javax.persistence.*

@Entity(name = "api_description")
@Table(name = "api_description", schema = "public")
class ApiDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @Column(name = "api_title")
    var apiTitle: String? = null

    @Column(name = "status")
    var status: Boolean? = true

    @Column(name="created_at", nullable = false)
    @CreationTimestamp
    var createdAt: OffsetDateTime = OffsetDateTime.now( ZoneOffset.UTC )

    @Column(name="updated_at", nullable = false)
    @CreationTimestamp
    var updatedAt: OffsetDateTime = OffsetDateTime.now( ZoneOffset.UTC )

    @Column(name = "updated_by")
    var updatedBy: String? = null
}