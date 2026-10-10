package com.mdwc.attendancetracker.fragments

import android.app.Person
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mdwc.attendancetracker.ObjectBoxModel
import com.mdwc.attendancetracker.R
import io.objectbox.Box
import io.paperdb.Paper

class HomeFragment : Fragment() {


    private lateinit var notesBox: Box<ObjectBoxModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}