package com.hamuli.mynotes.listeners;

import com.hamuli.mynotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
