package com.example.bus_seat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bus_seat.databinding.FragmentSignUpBinding

class SignUp : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        binding.signupsubmit.isEnabled = false

        // Set up onClickListener for the submit button
        binding.signupsubmit.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_fragmentSignIn)
        }

        // Set up onClickListener for the terms and conditions TextView
        binding.termsandcondition.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_termsAndCondition)
        }

        // Set up onCheckedChangeListener for the CheckBox
        binding.termscheckbox.setOnCheckedChangeListener { _, isChecked ->
            // Enable or disable the submit button based on CheckBox state
            binding.signupsubmit.isEnabled = isChecked
        }

        return binding.root
    }
}
