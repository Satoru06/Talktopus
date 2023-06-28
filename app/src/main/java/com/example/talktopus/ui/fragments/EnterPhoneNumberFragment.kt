package com.example.talktopus.ui.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.talktopus.R
import com.example.talktopus.databinding.FragmentEnterPhoneNumberBinding



class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {
    private lateinit var binding: FragmentEnterPhoneNumberBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
    override fun onStart() {
        super.onStart()
        binding.registerBtnNext.setOnClickListener {
            sendCode()
        }

    }
    private fun sendCode() {
        if(binding.registerInputPhoneNumber.text.toString().isEmpty()){
            Toast.makeText(activity,getString(R.string.register_toast_enter_phone),Toast.LENGTH_SHORT).show()
        } else{
            parentFragmentManager.beginTransaction()
                .replace(R.id.registerDataContainer,EnterCodeFragment())
                .addToBackStack(null)
                .commit()
        }

    }
}