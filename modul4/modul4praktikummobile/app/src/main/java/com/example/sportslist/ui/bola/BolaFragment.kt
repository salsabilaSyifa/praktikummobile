package com.example.sportslist.ui.bola

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
import com.example.sportslist.adapter.BolaAdapter
import com.example.sportslist.databinding.FragmentBolaBinding
import com.example.sportslist.model.Bola


class BolaFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var gridLayoutManager: GridLayoutManager? = null
    private var _binding: FragmentBolaBinding? = null
    private var recyclerViewAdapter : BolaAdapter? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bolaViewModel =
            ViewModelProvider(this)[BolaViewModel::class.java]
        bolaViewModel.mutableLiveDataBola.observe(viewLifecycleOwner,listUpdateObserver)
        _binding = FragmentBolaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        gridLayoutManager = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)
        recyclerView = _binding!!.recylerViewCir
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        gridLayoutManager = null
        _binding = null
    }
    private var listUpdateObserver : Observer<ArrayList<Bola>?> =
        Observer<ArrayList<Bola>?> { arrayList ->
            recyclerViewAdapter = BolaAdapter(requireContext(),arrayList)
            recyclerView.adapter = recyclerViewAdapter
        }
}