package com.kalex.searchmeliapp.domain

import com.kalex.searchmeliapp.data.ItemSearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapLatest

class GetSearchItemUseCase( private val searchRepository: ItemSearchRepository) {

     suspend fun getItemByQuery(query: String): Flow<Unit> {
         return searchRepository.getItemByQuery(query).mapLatest {

         }
    }
}