package com.kalex.searchmeliapp.data.network

import retrofit2.http.GET


interface ItemsAndSearchApi {
    @GET("/search")
    suspend fun searchItemByQuery()
}