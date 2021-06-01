package com.capstone.saba.ui.signup.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.findNavController
import com.capstone.saba.R
import com.capstone.saba.databinding.FragmentABinding
import com.capstone.saba.databinding.FragmentBBinding
import com.capstone.saba.databinding.FragmentLoginBinding


class BFragment : Fragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNextB.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_BFragment_to_CFragment)
        }


    }
}