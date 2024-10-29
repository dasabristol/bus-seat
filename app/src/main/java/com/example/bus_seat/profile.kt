package com.example.bus_seat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bus_seat.databinding.FragmentProfileBinding


class profile : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        binding.editprofilebtn.setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_editprofile)
        }
        binding.profilehomebtn.setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_home2)
        }
        return binding.root
    }

}