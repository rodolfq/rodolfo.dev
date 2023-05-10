package com.hellodev.ssx_project02.fragments

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hellodev.ssx_project02.databinding.AppFragmentBinding

class AppFragment : Fragment() {

    private lateinit var _binding: AppFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AppFragmentBinding.inflate(inflater)
        return _binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val apkdownload1 = _binding.link
        apkdownload1.movementMethod = LinkMovementMethod.getInstance()

//        val apkdownload2 = _binding.link2
//        apkdownload2.movementMethod = LinkMovementMethod.getInstance()
//
//        val apkdownload3 = _binding.link3
//        apkdownload3.movementMethod = LinkMovementMethod.getInstance()
//
//        val apkdownload4 = _binding.link4
//        apkdownload4.movementMethod = LinkMovementMethod.getInstance()
//
//        val apkdownload5 = _binding.link5
//        apkdownload5.movementMethod = LinkMovementMethod.getInstance()

    }

}