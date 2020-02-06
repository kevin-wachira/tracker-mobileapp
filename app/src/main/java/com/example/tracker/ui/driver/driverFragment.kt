package com.example.tracker.ui.driver

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.tracker.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_driver.*

class driverFragment : Fragment() {


    private lateinit var slideShowModel: SlideShowModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )


        : View? {
      slideShowModel=
          ViewModelProviders.of(this).get(SlideShowModel::class.java)
        val root = inflater.inflate(R.layout.fragment_driver, container, false)
val fab1=root.findViewById<FloatingActionButton>(R.id.fab1).setOnClickListener{
    startActivity(Intent(context,registration::class.java))
}

        return root

    }
}