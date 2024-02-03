package com.kalex.searchmeliapp.data

import com.kalex.searchmeliapp.data.network.ItemsAndSearchApi
import com.kalex.searchmeliapp.data.responses.Item
import kotlinx.coroutines.flow.Flow

class ItemSearchRepositoryImpl (private val searchApi: ItemsAndSearchApi): ItemSearchRepository {
    override suspend fun getItemByQuery(query: String): Flow<Item> {
        return searchApi.searchItemByQuery(query)
    }
}