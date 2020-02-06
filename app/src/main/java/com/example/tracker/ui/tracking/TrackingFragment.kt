package com.example.tracker.ui.tracking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.tracker.R

class TrackingFragment : Fragment() {

    private lateinit var TrackingViewModel: TrackingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        TrackingViewModel= ViewModelProviders.of(this).get(this.TrackingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tracking, container, false)
//        val textView: TextView = root.findViewById(R.id.text_gallery)
       /* galleryViewModel.text.observe(this, Observer {
            textView.text = it
        })*/
        return root
    }
}