package com.sandip.listadapterdiffutil

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ProgrammingAdapter:ListAdapter<programmingitem,ProgrammingAdapter.ProgrammingViewHolder>(DiffUtil()) {

    class ProgrammingViewHolder(view: View):RecyclerView.ViewHolder(view){
        val bg = view.findViewById<View>(R.id.initial)
        val name = view.findViewById<TextView>(R.id.name)
        val initial = view.findViewById<TextView>(R.id.initial)

        fun bind(item: programmingitem){
            bg.setBackgroundResource(item.bgitem)
            name.text = item.name
            initial.text = item.initial
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_layout,parent,false)
        return ProgrammingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgrammingViewHolder, position: Int) {

        val item = getItem(position)
        holder.bind(item)

    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<programmingitem>(){
        override fun areItemsTheSame(oldItem: programmingitem, newItem: programmingitem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: programmingitem,
            newItem: programmingitem
        ): Boolean {
            return oldItem == newItem
        }

    }

}

