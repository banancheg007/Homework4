package com.example.android.homework4.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import mylittlechat.banancheg.com.homework4.R

class MonthAdapter : RecyclerView.Adapter<MonthAdapter.MonthViewHolder>() {

    private val monthList: List<String> = mylittlechat.banancheg.com.homework4.monthList
    override fun getItemCount(): Int {
        return monthList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MonthAdapter.MonthViewHolder {
        return MonthViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.day_or_month_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MonthAdapter.MonthViewHolder, position: Int) {
        holder.onBind(monthList[position])
    }

    inner class MonthViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val itemText: TextView = view.findViewById(R.id.item_text)

        fun onBind(item: String) {
            itemText.text = item
        }
    }
}

