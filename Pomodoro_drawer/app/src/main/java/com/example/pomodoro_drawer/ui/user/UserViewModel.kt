package com.example.pomodoro_drawer.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is User Fragment, where user can browse his data and settings"
    }
    val text: LiveData<String> = _text
}