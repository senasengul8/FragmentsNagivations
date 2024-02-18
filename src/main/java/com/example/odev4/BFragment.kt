package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentABinding
import com.example.odev4.databinding.FragmentBBinding


class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentBBinding.inflate(inflater, container, false)
        binding.goY.setOnClickListener{ Navigation.findNavController(it).navigate(R.id.action_BFragment_to_YFragment)}
        // Inflate the layout for this fragment
        return binding.root
        // Inflate the layout for this fragment

    }


}