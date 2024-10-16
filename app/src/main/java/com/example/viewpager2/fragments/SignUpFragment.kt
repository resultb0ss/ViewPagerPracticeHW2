package com.example.viewpager2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.viewpager2.R
import com.example.viewpager2.databinding.FragmentSignUpBinding
import com.example.viewpager2.databinding.FragmentViewPagerBinding

class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSignUpBinding.inflate(inflater,container,false)

        binding.loginSignUpButton.setOnClickListener{
            val userNameSignUp = binding.userNameSignUpEditTextET.text.toString()
            val passwordSignUp = binding.passwordSignUpEditTextET.text.toString()

            if (passwordSignUp.isEmpty() || userNameSignUp.isEmpty() ) {
                Toast.makeText(context, "Данные не введены", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameSignUp)
            bundle.putString("password", passwordSignUp)
            signInFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context,"Вы успешно зарегистрированы", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }

}