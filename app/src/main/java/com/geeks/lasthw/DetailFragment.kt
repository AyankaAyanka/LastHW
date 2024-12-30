package com.geeks.lasthw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class DetailFragment : Fragment() {

    private val args: DetailFragmentArgs by navArgs()

    class DetailFragmentArgs {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.detail_text)
        textView.text = args.itemText

        val backButton = view.findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}

