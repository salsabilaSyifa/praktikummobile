package com.example.sportslist.ui.gallery

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportslist.R
import com.example.sportslist.model.Sports

class GalleryViewModel : ViewModel() {

    var mutableLiveData: MutableLiveData<ArrayList<Sports>?> = MutableLiveData()
    var airArrayList: ArrayList<Sports>? = null

    fun init(){
        airlist()
        mutableLiveData.value = airArrayList
    }

    fun airlist(){
        var element = Sports(R.string.affirmation1, R.drawable.image1)

        airArrayList = ArrayList()
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation2, R.drawable.image2)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation3, R.drawable.image3)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation4, R.drawable.image4)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation5, R.drawable.image5)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation6, R.drawable.image6)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation7, R.drawable.image7)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation8, R.drawable.image8)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation9, R.drawable.image9)
        airArrayList!!.add(element)
        element = Sports(R.string.affirmation10, R.drawable.image10)
        airArrayList!!.add(element)
    }
    init {
        init()
    }
    fun airdata(sports: Sports, context: Context){
        airArrayList
    }
}