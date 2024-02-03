package com.kalex.searchmeliapp.presentation

import androidx.lifecycle.ViewModel
import com.kalex.searchmeliapp.domain.GetSearchItemUseCase
import kotlinx.coroutines.flow.MutableStateFlow

class SearchViewModel (private val getSearchItemUseCase: GetSearchItemUseCase): ViewModel() {

    private var _searchStatus: MutableStateFlow<> =

fun getItemByQuery(query: String){


}
    // TODO: Implement the ViewModel
}