package com.example.sportslist.ui.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportslist.R
import com.example.sportslist.model.Bola
import com.example.sportslist.model.Sports

class GalleryViewModel : ViewModel() {

    var mutableLiveData: MutableLiveData<ArrayList<Sports>?> = MutableLiveData()
    private var arrayList: ArrayList<Sports>? = null

    private fun init(){
        alist()
        mutableLiveData.value = arrayList
    }

    private fun alist(){
        var element = Sports(R.string.olahraga1, R.drawable.image1)

        arrayList = ArrayList()
        arrayList!!.add(element)
        element = Sports(R.string.olahraga2, R.drawable.image2)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga3, R.drawable.image3)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga4, R.drawable.image4)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga5, R.drawable.image5)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga6, R.drawable.image6)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga7, R.drawable.image7)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga8, R.drawable.image8)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga9, R.drawable.image9)
        arrayList!!.add(element)
        element = Sports(R.string.olahraga10, R.drawable.image10)
        arrayList!!.add(element)
    }
    init {
        init()
    }
}