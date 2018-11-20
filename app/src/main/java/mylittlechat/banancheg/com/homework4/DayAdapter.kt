package com.example.android.homework4.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import mylittlechat.banancheg.com.homework4.R
import mylittlechat.banancheg.com.homework4.daysList

class DayAdapter : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {

    private val dayList: List<String> = daysList
    override fun getItemCount(): Int {
        return dayList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): DayAdapter.DayViewHolder {
        return DayViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.day_or_month_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DayAdapter.DayViewHolder, position: Int) {
        holder.onBind(dayList[position])
    }

    inner class DayViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val itemText: TextView = view.findViewById(R.id.item_text)

        fun onBind(item: String) {
            itemText.text = item
        }
    }
}

