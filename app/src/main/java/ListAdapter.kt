package com.example.muhammadrizwan.recycler_view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.cardview_row.view.*

class ListAdapter(var ctx : Context , var array:ArrayList<String>) : RecyclerView.Adapter<ListAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):CustomViewHolder {
        var view  = LayoutInflater.from(ctx).inflate(R.layout.cardview_row,null)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        var position = array[position]
        holder.tv.text = position
    }


    inner class CustomViewHolder(var view : View) : RecyclerView.ViewHolder(view)
    {
        var tv = view.findViewById<TextView>(R.id.TV)
        var v_btn = view.findViewById<Button>(R.id.view_btn)
        var d_btn = view.findViewById<Button>(R.id.delete_btn)
    }

}