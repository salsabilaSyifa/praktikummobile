package com.example.modul4.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.adapter.ListAdapter
import com.example.modul4.databinding.FragmentOptionBinding

class OptionFragment : Fragment() {

    private var _binding: FragmentOptionBinding? = null
    private val binding get() = _binding!!

    private lateinit var rv: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemId = HomeFragment.OPTIONAL

        rv = binding.rv
        rv.layoutManager = LinearLayoutManager(context)
        rv.adapter = ListAdapter(requireContext(), itemId)
        rv.setHasFixedSize(true)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}