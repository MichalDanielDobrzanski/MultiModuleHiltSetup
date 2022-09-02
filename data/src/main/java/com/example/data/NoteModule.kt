package com.example.data

import com.example.domain.GetNotesUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NoteModule {

    @Binds
    @Singleton
    abstract fun provideNoteRepository(noteRepositoryImpl: NoteRepositoryImpl): NoteRepository
}

@Module
@InstallIn(SingletonComponent::class)
object NoteProvidesModule {

    @Provides
    @Singleton
    fun provideGetNotesUseCase(noteRepository: NoteRepository): GetNotesUseCase {
        return GetNotesUseCase(noteRepository::fetchNote)
    }
}