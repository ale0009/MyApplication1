package com.example.myapplication2.ui.theme.ui.lucky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication2.R
import com.example.myapplication2.databinding.FragmentLuckyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LuckyFragment : Fragment() {

    private var _binding: FragmentLuckyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLuckyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}