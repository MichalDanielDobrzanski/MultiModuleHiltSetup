package com.example.multimodulehiltsetup

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.domain.GetNotesUseCase
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var getNotesUseCase: GetNotesUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val resultingNote = getNotesUseCase.invoke()
        Log.d("Note", resultingNote.content)
    }

}