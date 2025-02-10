package com.example.todo.feature_note.domain.use_case

import com.example.todo.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class SaveNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {
}