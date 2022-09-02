package com.example.data

import com.example.domain.Note
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor() : NoteRepository {
    override fun writeNote(note: Note) = Unit

    override fun fetchNote(): Note = Note("Test note")
}