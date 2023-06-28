package com.example.talktopus.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.talktopus.R
import com.example.talktopus.databinding.FragmentEnterCodeBinding


class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    private lateinit var binding: FragmentEnterCodeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.registerInputCode.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            val string: String = binding.registerInputCode.text.toString()
                if (string.length == 6){
                   verifiCode()
                }
        }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }



        })
    }
    fun verifiCode(){
        Toast.makeText(activity,"OK",Toast.LENGTH_SHORT).show()
    }
}
