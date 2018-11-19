package mylittlechat.banancheg.com.homework4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.homework4.adapters.DayAdapter
import kotlinx.android.synthetic.main.fragment_main.view.*

class SignOfZodiacFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.recycler_view

        recyclerView.layoutManager = GridLayoutManager(context,3)
        recyclerView.adapter = SignOfZodiacAdapter()
    }
}