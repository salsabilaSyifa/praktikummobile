package com.example.sportslist.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Permainan bola, juga olah raga bola, adalah segala bentuk permainan atau olah raga yang menonjolkan bola sebagai bagian dari permainan. Ini termasuk permainan seperti sepak bola, kriket, bisbol, bola basket, dan sepak bola Amerika."
    }
    val text: LiveData<String> = _text
}