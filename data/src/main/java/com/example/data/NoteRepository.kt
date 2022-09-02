package com.example.data

import com.example.domain.Note

interface NoteRepository {
    fun writeNote(note: Note)

    fun fetchNote(): Note
}
