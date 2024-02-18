package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentABinding
import com.example.odev4.databinding.FragmentAnasayfaBinding

class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentABinding.inflate(inflater, container, false)
        binding.goB.setOnClickListener{ Navigation.findNavController(it).navigate(R.id.action_AFragment_to_BFragment)}
        // Inflate the layout for this fragment
        return binding.root
    }


}