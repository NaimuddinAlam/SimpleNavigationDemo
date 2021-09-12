package com.fserp.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.fserp.navigationdemo.databinding.FragmentSecondeBinding


class SecondeFragment : Fragment() {
private  lateinit var binding: FragmentSecondeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_seconde, container, false)
        val userinput=requireArguments().getString("user_input")
        binding.textView2.text=userinput
        return binding.root
    }


}