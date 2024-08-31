package com.example.bus_seat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bus_seat.databinding.FragmentForgotPasswordBinding
import com.example.bus_seat.databinding.FragmentSignInBinding


class ForgotPassword : Fragment() {

    private lateinit var binding: FragmentForgotPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentForgotPasswordBinding.inflate(inflater,container,false)

        binding.forgotsubmitbtn.setOnClickListener {
            findNavController().navigate(R.id.action_forgotPassword_to_fragmentSignIn)
        }
        return binding.root
    }

}