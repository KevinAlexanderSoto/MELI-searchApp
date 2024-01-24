package com.kalex.searchmeliapp.data.responses

data class Item(
    val country_default_time_zone: String,
    val paging: Paging,
    val query: String,
    val results: List<Result>,
    val site_id: String
)