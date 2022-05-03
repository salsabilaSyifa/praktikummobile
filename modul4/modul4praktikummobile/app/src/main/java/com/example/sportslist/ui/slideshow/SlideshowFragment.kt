package com.example.sportslist.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportslist.adapter.CompetitionAdapter
import com.example.sportslist.databinding.FragmentSlideshowBinding
import com.example.sportslist.model.Competition
import com.example.sportslist.ui.slideshow.SlideshowViewModel

class SlideshowFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentSlideshowBinding? = null
    private var recyclerViewAdapter : CompetitionAdapter? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val slideshowViewModel =
            ViewModelProvider(this)[SlideshowViewModel::class.java]
        slideshowViewModel.mutableLiveDataCompetition.observe(viewLifecycleOwner,listUpdateObserver)
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewBir
        recyclerView.setHasFixedSize(true)
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private var listUpdateObserver : Observer<ArrayList<Competition>?> =
        Observer<ArrayList<Competition>?> { arrayListCompetition ->
            recyclerViewAdapter = CompetitionAdapter(requireContext(),arrayListCompetition)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = recyclerViewAdapter
        }
}