package com.farukdeveci.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farukdeveci.navigationcomponent.databinding.FragmentOyunEkraniBinding
import com.farukdeveci.navigationcomponent.databinding.FragmentSonucEkraniBinding

class SonucEkraniFragment : Fragment() {
    private lateinit var tasarim: FragmentSonucEkraniBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        tasarim = FragmentSonucEkraniBinding.inflate(inflater, container,false)
        return tasarim.root
    }

}