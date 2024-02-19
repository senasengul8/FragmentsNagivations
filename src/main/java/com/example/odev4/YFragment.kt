package com.example.odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
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
        val geriTusu=object: OnBackPressedCallback( true)
        {
            override fun handleOnBackPressed() {
                if (findNavController().currentDestination?.id != R.id.anasayfaFragment) {
                    // Navigate to the home fragment
                    findNavController().navigate(R.id.action_YFragment_to_anasayfaFragment3 )
                } else {
                }
                ///geridonusaktifdegil
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        // Inflate the layout for this fragment
        return binding.root
    }


}
