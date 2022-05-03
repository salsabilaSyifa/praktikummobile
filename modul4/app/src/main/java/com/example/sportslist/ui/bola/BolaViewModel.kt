package com.example.sportslist.ui.bola

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportslist.R
import com.example.sportslist.model.Bola

class BolaViewModel : ViewModel() {

    var mutableLiveDataBola: MutableLiveData<ArrayList<Bola>?> = MutableLiveData()
    private var arrayListBola: ArrayList<Bola>? = null

    private fun init(){
        alist()
        mutableLiveDataBola.value = arrayListBola
    }

    private fun alist(){
        var element = Bola(R.string.bola1, R.drawable.bola1)
        arrayListBola = ArrayList()
        arrayListBola!!.add(element)
        element = Bola(R.string.bola2, R.drawable.bola2)
        arrayListBola!!.add(element)
        element = Bola(R.string.bola3, R.drawable.bola3)
        arrayListBola!!.add(element)
        element = Bola(R.string.bola4, R.drawable.bola4)
        arrayListBola!!.add(element)
    }
    init {
        init()
    }
}