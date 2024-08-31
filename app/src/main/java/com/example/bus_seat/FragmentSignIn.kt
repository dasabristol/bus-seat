package com.example.bus_seat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bus_seat.databinding.FragmentSignInBinding


class FragmentSignIn : Fragment() {

    private lateinit var binding : FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(inflater, container,false)

        binding.forgotbtn.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentSignIn_to_forgotPassword)
        }
        binding.signupbtn.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentSignIn_to_signUp)
        }

        return binding.root
    }


}