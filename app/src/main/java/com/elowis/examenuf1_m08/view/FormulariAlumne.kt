package com.elowis.examenuf1_m08.view

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.elowis.examenuf1_m08.R
import com.elowis.examenuf1_m08.databinding.FragmentFormulariAlumneBinding
import com.elowis.examenuf1_m08.model.DataModel
import com.google.gson.Gson

class FormulariAlumne : Fragment() {
    private var nom: String = ""
    private var edat: String = ""
    private lateinit var saveButton: Button
    private lateinit var alertDialog: AlertDialog

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentFormulariAlumneBinding>(inflater,
            R.layout.fragment_formulari_alumne,container,false)

        val view = inflater.inflate(R.layout.fragment_formulari_alumne, container, false)

        var bindingVar = FragmentFormulariAlumneBinding.bind(view)
        nom = bindingVar.editTextTextPersonName2.text.toString()
        edat = bindingVar.editTextTextPersonName3.text.toString()

        // Guardar les dades amb SharedPreferences al fer clic al botó
        saveButton = view.findViewById(R.id.button2)
        saveButton.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Confirmació")
            builder.setMessage("Estàs segur que vols introduïr l'alumne/a?")
            builder.setPositiveButton("Si") { dialog, which ->
                val DataModel = DataModel(nom, edat)
                val sharedPreferences = requireActivity().getSharedPreferences("form_data", Context.MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString("form_data", Gson().toJson(DataModel))
                editor.apply()
                Toast.makeText(getContext(), "Dades Guardades", Toast.LENGTH_LONG).show()

            }
            builder.setNegativeButton("No") { dialog, which ->
                Toast.makeText(getContext(), "No s'han guardat les dades", Toast.LENGTH_LONG).show()
            }
            alertDialog = builder.create()

            val button = view.findViewById<Button>(R.id.button2)
            button.setOnClickListener {
                alertDialog.show()
            }

        }
        return view
        return binding.root

    }

}