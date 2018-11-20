package mylittlechat.banancheg.com.homework4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*

class SignOfZodiacFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val recyclerView = view.recycler_view

        val numberOfColumns = 3
        val layoutManager = GridLayoutManager(context, numberOfColumns)
        val adapter = RecyclerViewItemAdapter(zodiacSignsList)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(MySignOfZodiacItemDecorator(context!!))

        return view
    }
}