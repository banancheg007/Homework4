package mylittlechat.banancheg.com.homework4

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.day_or_month_item.view.*
import kotlinx.android.synthetic.main.sign_of_zodiac_item.view.*
import java.lang.IllegalArgumentException

class RecyclerViewItemAdapter(private val items: MutableList<out Item>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ItemsViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        private val itemTextTextView = view.item_text

        fun onBind(item: Item) {
            itemTextTextView.text = item.text
        }
    }

    class ZodiacSignsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val mZodiacSignImageView = view.zodiac_item_image
        private val mZodiacSignTitleTextView = view.zodiac_item_text

        fun onBind(signZodiacItem: SignZodiacItem) {
            mZodiacSignImageView.setImageResource(signZodiacItem.imageId)
            mZodiacSignTitleTextView.text = signZodiacItem.text
        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder = when (viewType) {
        R.layout.day_or_month_item -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.day_or_month_item, viewGroup, false)
            ItemsViewHolder(view)
        }

        R.layout.sign_of_zodiac_item -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.sign_of_zodiac_item, viewGroup, false)
            ZodiacSignsViewHolder(view)
        }

        else -> throw IllegalArgumentException("Type not found")
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = items[position]

        when (holder) {
            is ItemsViewHolder -> {
                holder.onBind(currentItem)
            }

            is ZodiacSignsViewHolder -> {
                holder.onBind(currentItem as SignZodiacItem)
            }
        }
    }

    override fun getItemViewType(position: Int): Int = when (items[position]) {
        is SignZodiacItem -> R.layout.sign_of_zodiac_item

        else -> R.layout.day_or_month_item
    }
}