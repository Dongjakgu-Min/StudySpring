package com.example.memo.model

import java.util.*
import javax.persistence.*

@Entity
class Memo(
        @Id @GeneratedValue
        val id: Long? = null,
        @ManyToOne(fetch=FetchType.EAGER)
        var user: User,
        @Column(name = "title", nullable = false)
        var title: String,
        @Column(name = "content", nullable = false)
        var content: String,
        @Column(name = "is_public", nullable = false)
        var isPublic: Boolean,
        @Column(name = "tag")
        var tag: String?,
        @Column(name = "created_at")
        var createdAt: Date? = Date(System.currentTimeMillis()),
        @Column(name = "is_deleted")
        var isDeleted: Boolean = false
)