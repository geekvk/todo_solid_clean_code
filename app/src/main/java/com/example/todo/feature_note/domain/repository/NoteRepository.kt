package com.example.todo.feature_note.domain.repository

import com.example.todo.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun saveNote(note: Note)

    fun getNotes() : Flow<List<Note>>

    suspend fun getNoteById(id : Int) : Note?

    suspend fun deleteNote(note: Note)
}