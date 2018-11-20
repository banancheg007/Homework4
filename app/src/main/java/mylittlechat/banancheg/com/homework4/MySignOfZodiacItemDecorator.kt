package mylittlechat.banancheg.com.homework4

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class MySignOfZodiacItemDecorator(val context: Context): RecyclerView.ItemDecoration() {
    companion object {
        private const val LEFT_MARGIN = 30
        private const val TOP_MARGIN = 30
    }
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {
            left = LEFT_MARGIN
            top = TOP_MARGIN

        }
    }
}