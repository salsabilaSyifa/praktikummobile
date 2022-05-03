package com.example.sportslist.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportslist.adapter.SportsAdapter
import com.example.sportslist.databinding.FragmentGalleryBinding
import com.example.sportslist.model.Sports


class GalleryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var gridLayoutManager: GridLayoutManager? = null
    private var _binding: FragmentGalleryBinding? = null
    private var recyclerViewAdapter : SportsAdapter? = null
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
        gridLayoutManager = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)
        recyclerView = _binding!!.recylerViewAir
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        gridLayoutManager = null
        _binding = null
    }
    private var listUpdateObserver : Observer<ArrayList<Sports>?> =
        Observer<ArrayList<Sports>?> { arrayList ->
            recyclerViewAdapter = SportsAdapter(requireContext(),arrayList)
            recyclerView.adapter = recyclerViewAdapter
        }
}