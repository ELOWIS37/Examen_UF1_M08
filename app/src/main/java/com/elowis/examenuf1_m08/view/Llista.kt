package com.elowis.examenuf1_m08.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.elowis.examenuf1_m08.R
import com.elowis.examenuf1_m08.databinding.FragmentFormulariAlumneBinding
import com.elowis.examenuf1_m08.databinding.FragmentLlistaBinding


class Llista : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLlistaBinding>(inflater,
            R.layout.fragment_llista,container,false)
        return binding.root
    }
}