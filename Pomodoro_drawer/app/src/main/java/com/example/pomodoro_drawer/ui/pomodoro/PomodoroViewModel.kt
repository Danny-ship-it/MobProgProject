package com.example.pomodoro_drawer.ui.pomodoro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PomodoroViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pomodor Timer Fragment, the timer and session initialization happens here"
    }
    val text: LiveData<String> = _text
}