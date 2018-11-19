package mylittlechat.banancheg.com.homework4

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


class PageFragment : Fragment() {
    val ARGUMENT_PAGE_NUMBER = "arg_page_number"

    var pageNumber: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_main, container, false)

    fun newInstance(page: Int): PageFragment {
        val pageFragment = PageFragment()
        val arguments = Bundle()
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page)
        pageFragment.setArguments(arguments)
        return pageFragment
    }
}