package com.hellodev.ssx_project02.fragments

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hellodev.ssx_project02.databinding.ContactFragmentBinding


class ContactsFragment : Fragment() {

    private lateinit var _binding: ContactFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ContactFragmentBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val linkWpp = _binding.textNumWhatsapp
        linkWpp.movementMethod = LinkMovementMethod.getInstance()

        val linkLinkedin = _binding.textNumLinkedin
        linkLinkedin.movementMethod = LinkMovementMethod.getInstance()

        val linkGithub = _binding.textNumGithub
        linkGithub.movementMethod = LinkMovementMethod.getInstance()

    }

}
