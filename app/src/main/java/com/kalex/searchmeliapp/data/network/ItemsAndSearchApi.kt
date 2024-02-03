package com.kalex.searchmeliapp.data.network

import com.kalex.searchmeliapp.data.responses.Item
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Query


interface ItemsAndSearchApi {
    @GET("/search")
    suspend fun searchItemByQuery(  @Query("q") query: String ): Flow<Item>
}