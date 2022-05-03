package com.example.sportslist.ui.slideshow

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportslist.R
import com.example.sportslist.model.Competition

class SlideshowViewModel : ViewModel() {

    var mutableLiveDataCompetition: MutableLiveData<ArrayList<Competition>?> = MutableLiveData()
    private var arrayListCompetition: ArrayList<Competition>? = null

    private fun init(){
        alist()
        mutableLiveDataCompetition.value = arrayListCompetition
    }

    private fun alist(){
        var elementCompetition = Competition(R.string.competition1, R.drawable.img11)
        arrayListCompetition = ArrayList()
        arrayListCompetition!!.add(elementCompetition)
        elementCompetition = Competition(R.string.competition2, R.drawable.img12)
        arrayListCompetition!!.add(elementCompetition)
        elementCompetition = Competition(R.string.competition3, R.drawable.img13)
        arrayListCompetition!!.add(elementCompetition)
    }
    init {
        init()
    }
}