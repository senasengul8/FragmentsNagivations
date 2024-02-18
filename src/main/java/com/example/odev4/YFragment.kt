package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentXBinding
import com.example.odev4.databinding.FragmentYBinding


class YFragment : Fragment() {
    private lateinit var binding: FragmentYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentYBinding.inflate(inflater, container, false)
        binding.button2.setOnClickListener{ Navigation.findNavController(it).navigate(R.id.action_YFragment_to_anasayfaFragment)}
        // Inflate the layout for this fragment
        return binding.root
    }


}