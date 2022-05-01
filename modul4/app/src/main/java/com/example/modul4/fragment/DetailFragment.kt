package com.example.modul4.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modul4.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private lateinit var item: Map<String, String>

    companion object{
        const val NAME = "name"
        const val LECTURER = "lecturer"
        const val CREDITS = "credits"
        const val SCHEDULE = "schedule"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        item = mapOf(
            NAME to arguments?.getString(NAME),
            LECTURER to arguments?.getString(LECTURER),
            CREDITS to arguments?.getString(CREDITS),
            SCHEDULE to arguments?.getString(SCHEDULE)
        ) as Map<String, String>

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.subjectSName.text = item[NAME]
        binding.lecturerSName.text = item[LECTURER]
        binding.creditSSubject.text = item[CREDITS]
        binding.scheduleSSubject.text = item[SCHEDULE]
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}