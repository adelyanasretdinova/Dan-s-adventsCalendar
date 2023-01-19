package com.example.danscalendar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.danscalendar.databinding.FragmentFullPhotoBinding

class FullPhotoFragment : Fragment() {
    private lateinit var binding: FragmentFullPhotoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFullPhotoBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide
            .with(this)
            .load(getArguments()?.getInt("photo"))
            .into(binding.fullScreenPhotoFragment)

    }
}