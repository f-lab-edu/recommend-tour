//package com.recommend_tour.data
//
//import androidx.paging.Pager
//import androidx.paging.PagingConfig
//import androidx.paging.PagingData
//import com.copy.sunflower.api.TourService
//import kotlinx.coroutines.flow.Flow
//import javax.inject.Inject
//
//class TourRepository @Inject constructor(private val service: TourService) {
//
//    fun getSearchResultStream(query: String): Flow<PagingData<UnsplashPhoto>> {
//        return Pager(
//            config = PagingConfig(enablePlaceholders = false, pageSize = NETWORK_PAGE_SIZE),
//            pagingSourceFactory = { UnsplashPagingSource(service, query) }
//        ).flow
//    }
//
//    companion object {
//        private const val NETWORK_PAGE_SIZE = 25
//    }
//}
