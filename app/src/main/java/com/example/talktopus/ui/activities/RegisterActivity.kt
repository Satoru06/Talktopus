package com.example.talktopus.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar;
import com.example.talktopus.R
import com.example.talktopus.databinding.ActivityRegisterBinding
import com.example.talktopus.ui.fragments.EnterPhoneNumberFragment

class RegisterActivity : AppCompatActivity() {
    private lateinit var mToolbar: Toolbar
    private lateinit var mBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title = getString(R.string.register_title_your_phone)
        supportFragmentManager.beginTransaction()
            .add(R.id.registerDataContainer,EnterPhoneNumberFragment())
            .commit()
    }
}