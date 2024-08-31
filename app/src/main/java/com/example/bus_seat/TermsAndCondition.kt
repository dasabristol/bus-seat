package com.example.bus_seat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bus_seat.databinding.FragmentTermsAndConditionBinding

class TermsAndCondition : Fragment() {

    private lateinit var binding : FragmentTermsAndConditionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTermsAndConditionBinding.inflate(inflater,container,false)

        binding.termsAndConditionbtn.setOnClickListener {
            findNavController().navigate(R.id.action_termsAndCondition_to_signUp)
        }
        return binding.root
    }

}