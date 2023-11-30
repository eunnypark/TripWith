package com.example.tripwith

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    // 가상의 채팅 데이터
    private val chatData = listOf(
        "안녕하세요!",
        "네. :)",
        // 여러 채팅 데이터 추가 가능
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.material_list_item_two_line, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = chatData[position]
        holder.bind(message)
    }

    override fun getItemCount(): Int {
        return chatData.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val messageTextView: TextView = itemView.findViewById(R.id.mtrl_list_item_secondary_text)

        fun bind(message: String) {
            messageTextView.text = message
        }
    }
}