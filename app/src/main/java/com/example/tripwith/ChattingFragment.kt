package com.example.tripwith

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChattingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chatting, container, false)
        val recyclerview: RecyclerView = view.findViewById(R.id.recyclerViewChat)
        recyclerview.layoutManager = LinearLayoutManager(activity)
        recyclerview.adapter = ChatAdapter()

        return view
    }
}