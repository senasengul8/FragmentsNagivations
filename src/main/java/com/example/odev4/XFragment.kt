package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfaBinding
import com.example.odev4.databinding.FragmentBBinding
import com.example.odev4.databinding.FragmentXBinding

class XFragment : Fragment() {
    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentXBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener{ Navigation.findNavController(it).navigate(R.id.action_XFragment_to_YFragment)}
        // Inflate the layout for this fragment
        return binding.root
    }


}