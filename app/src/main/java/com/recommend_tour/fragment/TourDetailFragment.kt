package com.recommend_tour.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.gson.Gson
import com.recommend_tour.MainActivity
import com.recommend_tour.R
import com.recommend_tour.api.DataApiService
import com.recommend_tour.data.FestivalIntroduction
import com.recommend_tour.data.LeisureIntroduction
import com.recommend_tour.data.TourDetailIntroduction
import com.recommend_tour.data.TourItem
import com.recommend_tour.databinding.FragmentTourDetailBinding
import com.recommend_tour.viewmodels.TourListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class TourDetailViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

}

@AndroidEntryPoint
class TourDetailFragment : Fragment() {

    @Inject
    lateinit var apiClient: DataApiService

    private val viewModel: TourListViewModel by viewModels()
    private lateinit var binding: FragmentTourDetailBinding
    private var contentId: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tour_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tourItem = arguments?.getParcelable<TourItem>("tourItem")

        (activity as? MainActivity)?.setActionBarTitle(tourItem?.title)

        CoroutineScope(Dispatchers.IO).launch {
            getTourDetailItem(tourItem!!)
        }
    }

    private suspend fun getTourDetailItem(tourItem: TourItem) {
        val response = apiClient.getTourDetailItem(tourItem.contentId, tourItem.contentTypeId!!)
        val apiResultCode = response.response?.header?.resultCode
        val body = response.response?.body

        if (apiResultCode == "0000") {
            body?.items?.item?.forEach {
                when (it) {
                    is FestivalIntroduction -> {

                    }

                    is TourDetailIntroduction -> {
                        /**
                         * setup for tour detail view
                         */
                    }

                    is LeisureIntroduction -> {

                    }
                }
            }
            val totalCount: Int = response.response?.body?.totalCount ?: 0
            val tourItems = body?.items?.item

            val test = listOf(body?.items?.item)
            val test2 = test.filterNotNull()
            Log.d("itemFilter", "itemFilter : $test")
            Log.d("itemFilter", "itemFilter : $test2")

//            val test3 = itemFilter(body?.items?.item!!)
//            Log.d("itemFilter", "itemFilter : $test3")

            val gson = Gson()
            val json2 = gson.toJson(tourItems)
            Log.d("itemFilter", "itemFilter : $json2")


//            val test = itemFilter(tourItems!!)
//            Log.d("itemFilter", "itemFilter : $test")
        }
    }

    override fun onResume() {
        super.onResume()
        hideBottomNavigationView()
    }

    private fun hideBottomNavigationView() {
        val bottomNav: BottomNavigationView = requireActivity().findViewById(R.id.bottomNav)
        bottomNav.visibility = View.GONE
    }

    override fun onPause() {
        super.onPause()
        showBottomNavigationView()
    }

    private fun showBottomNavigationView() {
        val bottomNav: BottomNavigationView = requireActivity().findViewById(R.id.bottomNav)
        bottomNav.visibility = View.VISIBLE
    }
}
