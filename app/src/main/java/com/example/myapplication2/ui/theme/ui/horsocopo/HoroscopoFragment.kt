package com.example.myapplication2.ui.theme.ui.horsocopo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication2.databinding.FragmentHoroscopoBinding
import dagger.hilt.android.AndroidEntryPoint
import androidx.fragment.app.viewModels


@AndroidEntryPoint
class HoroscopoFragment : Fragment() {


    private val horoscopoViewModel by viewModels<HoroscopoViewModel>()
    private var _binding: FragmentHoroscopoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHoroscopoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}



