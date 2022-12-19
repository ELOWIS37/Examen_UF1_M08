package com.elowis.examenuf1_m08.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.elowis.examenuf1_m08.R
import com.elowis.examenuf1_m08.databinding.FragmentIniciAdminBinding


class IniciAdmin : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentIniciAdminBinding>(inflater,
            R.layout.fragment_inici_admin,container,false)

        val view = inflater.inflate(R.layout.fragment_inici_admin, container, false)

        val btn_entrar: Button = view.findViewById<View>(R.id.button) as Button

        binding.button.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_iniciAdmin2_to_formulariAlumne2)
        }

        btn_entrar.setOnClickListener {
            val et_admin: EditText = requireView().findViewById<View>(R.id.editTextTextPersonName) as EditText
            var adminNom = et_admin.text.toString()

            if (adminNom.equals("admin123")) {
                Toast.makeText(getContext(), "Benvingut admin123", Toast.LENGTH_LONG).show()
            }
            if (adminNom.equals("")) {
                Toast.makeText(getContext(), "Introdueix una contrasenya", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(getContext(), "Contrassenya Incorrecte", Toast.LENGTH_LONG).show()
            }
    }

        return binding.root


    }
}

