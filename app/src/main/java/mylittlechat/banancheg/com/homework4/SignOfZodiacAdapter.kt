package mylittlechat.banancheg.com.homework4

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class SignOfZodiacAdapter : RecyclerView.Adapter<SignOfZodiacAdapter.SignOfZodiacViewHolder>() {

    private val signsOfZodiacList: List<SignZodiacItem> = zodiacSignsList
    override fun getItemCount(): Int {
        return signsOfZodiacList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SignOfZodiacAdapter.SignOfZodiacViewHolder {
        return SignOfZodiacViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.sign_of_zodiac_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SignOfZodiacAdapter.SignOfZodiacViewHolder, position: Int) {
        holder.onBind(signsOfZodiacList[position])
    }

    inner class SignOfZodiacViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val itemText: TextView = view.findViewById(R.id.item_text)
        private val itemImage: ImageView = view.findViewById(R.id.item_image)

        fun onBind(signZodiacItem: SignZodiacItem) {
            itemText.text = signZodiacItem.text
            itemImage.setImageResource(signZodiacItem.imageId)
        }
    }
}
