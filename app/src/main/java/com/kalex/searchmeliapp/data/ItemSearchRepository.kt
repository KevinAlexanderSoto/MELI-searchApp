package com.kalex.searchmeliapp.data

import com.kalex.searchmeliapp.data.responses.Item
import kotlinx.coroutines.flow.Flow

interface ItemSearchRepository {
    suspend fun getItemByQuery(query: String): Flow<Item>
}