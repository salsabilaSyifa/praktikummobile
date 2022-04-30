package com.example.sportslist.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportslist.R
import com.example.sportslist.adapter.SportsAdapter
import com.example.sportslist.databinding.FragmentGalleryBinding
import com.example.sportslist.model.Sports


class GalleryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentGalleryBinding? = null
    private var recyclerViewaadapter : SportsAdapter? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val galleryViewModel =
            ViewModelProvider(this)[GalleryViewModel::class.java]
        galleryViewModel.mutableLiveData.observe(viewLifecycleOwner,listUpdateObserver)
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewAir
        recyclerView.setHasFixedSize(true)
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private var listUpdateObserver : Observer<ArrayList<Sports>?> =
        Observer<ArrayList<Sports>?> { arrayList ->
            recyclerViewaadapter = SportsAdapter(requireContext(),arrayList)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = recyclerViewaadapter
        }
}