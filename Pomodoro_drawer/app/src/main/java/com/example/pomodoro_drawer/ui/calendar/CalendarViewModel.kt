package com.example.pomodoro_drawer.ui.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is calendar Fragment, with Previous Pomodoro sessions mapped in a calendar"
    }
    val text: LiveData<String> = _text
}